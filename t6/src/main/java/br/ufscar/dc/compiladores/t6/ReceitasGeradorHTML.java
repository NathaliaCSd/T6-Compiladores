package br.ufscar.dc.compiladores.t6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import br.ufscar.dc.compiladores.t6.Unidade;

public class ReceitasGeradorHTML extends ReceitasBaseVisitor<Void> {

    private final Map<String, DadosIngrediente> inventario = new LinkedHashMap<>();
    private final List<String> possiveis = new ArrayList<>();
    private final Map<String, List<String>> insuficientes = new LinkedHashMap<>();
    // private final List<String> passos = new ArrayList<>();
    private final StringBuilder html = new StringBuilder();

    @Override
    public Void visitPrograma(ReceitasParser.ProgramaContext ctx) {
        // 1) Preenche inventário
        visitDeclaracao_ingredientes(ctx.declaracao_ingredientes());
        // 2) Avalia cada receita
        for (var recCtx : ctx.declaracoes_receitas().declaracao_receita()) {
            checarReceita(recCtx);
        }
        // 3) Lê os passos
        // visitDeclaracao_passos(ctx.declaracao_passos());
        // 4) Monta e escreve HTML
        montarHTML();
        return null;
    }

    @Override
    public Void visitDeclaracao_ingredientes(ReceitasParser.Declaracao_ingredientesContext ctx) {
        for (var ing : ctx.lista_ingredientes().ingrediente()) {
            String nome = ing.NOME().getText();
            double valor = Double.parseDouble(ing.NUMERO().getText());
            String uniTxt = ing.unidade().getText(); // "ml","l","g","kg","un"
            Unidade uni = Unidade.of(uniTxt); // seu enum faz o mapeamento
            double qtdBase = valor * uni.fatorParaBase; // sempre em mL ou g

            inventario.put(nome, qtdBase);
        }
        return null;
    }

    /*
     * @Override
     * public Void visitDeclaracao_passos(ReceitasParser.Declaracao_passosContext
     * ctx) {
     * for (var passoCtx : ctx.passo()) {
     * String textoComTraco = passoCtx.PASSO().getText(); // ex.: "-misture ovo..."
     * String texto = textoComTraco.substring(1).trim(); // "misture ovo..."
     * passos.add(texto);
     * }
     * return null;
     * }
     */
    /** Checa se uma receita pode ser feita e registra faltas */
    private void checarReceita(ReceitasParser.Declaracao_receitaContext ctx) {
    String nomeRec = ctx.NOME().getText();
    List<String> faltam = new ArrayList<>();

    for (var reqCtx : ctx.lista_ingredientes().ingrediente()) {
        // 1) Nome do ingrediente e valor pedido
        String nomeIng    = reqCtx.NOME().getText();
        double valorReq   = Double.parseDouble(reqCtx.NUMERO().getText());
        String uniReqTxt  = reqCtx.unidade().getText();        // "g","kg","ml","l" ou "un"

        // 2) Converte para unidade base (g ou mL)
        Unidade uniReq    = Unidade.of(uniReqTxt);
        double reqBase    = valorReq * uniReq.fatorParaBase;   // e.g. 1 kg → 1000 g

        // 3) Busca o que há em estoque (já normalizado em g ou mL)
        double disponivel = inventario.getOrDefault(nomeIng, 0.0);

        // 4) Se faltar, calcula quanto falta e formata na unidade original
        if (disponivel < reqBase) {
            double faltanteBase    = reqBase - disponivel;
            double faltanteUnidade = faltanteBase / uniReq.fatorParaBase;
            // ex: “tomate: falta(m) 2.5 kg”
            faltam.add(nomeIng + ": falta(m) " 
                       + faltanteUnidade 
                       + " " + uniReqTxt);
        }
    }

    // 5) Mantém o restante da lógica igual
    if (faltam.isEmpty()) {
        possiveis.add(nomeRec);
    } else {
        insuficientes.put(nomeRec, faltam);
    }
}


    /** Constrói e escreve o conteúdo HTML */
    private void montarHTML() {
        html.append(
                "<!doctype html>\n<html>\n<head>\n  <meta charset=\"utf-8\">\n  <title>Relatório de Receitas</title>\n  <style>body{font-family:sans-serif;}h1{color:#2e6c80;}ul,ol{margin-left:20px;}li{margin-bottom:4px;}</style>\n</head>\n<body>\n");

        // Ingredientes
        html.append("<h1>Inventário de Ingredientes</h1>\n<ul>\n");

        // --- AQUI ESTÁ A ALTERAÇÃO ---
        inventario.forEach((nome, dados) -> {
            html.append("  <li>")
                    .append(nome)
                    .append(": ")
                    .append(dados.getQuantidade())
                    .append(" ")
                    .append(dados.getUnidadeMedida())
                    .append("</li>\n");
        });
        // ----------------------------

        html.append("</ul>\n");

        // Receitas possíveis
        html.append("<h1>Receitas Possíveis</h1>\n<ul>\n");
        for (String r : possiveis) {
            html.append("  <li>").append(r).append("</li>\n");
        }
        html.append("</ul>\n");

        // Receitas não possíveis
        html.append("<h1>Receitas Não Possíveis</h1>\n<ul>\n");
        for (var entry : insuficientes.entrySet()) {
            html.append("  <li>")
                    .append(entry.getKey())
                    .append(" (faltam: ")
                    .append(String.join(", ", entry.getValue()))
                    .append(")</li>\n");
        }
        html.append("</ul>\n");

    }

    /** Escreve o HTML gerado em um arquivo */
    public void escreverHTML(String caminho) throws IOException {
        Files.writeString(Paths.get(caminho), html.toString());
    }
}
