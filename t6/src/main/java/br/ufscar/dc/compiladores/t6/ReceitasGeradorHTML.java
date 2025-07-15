package br.ufscar.dc.compiladores.t6;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.*;

/**
 * Gera um relatório HTML listando:
 * - Ingredientes disponíveis
 * - Receitas possíveis
 * - Receitas não possíveis com faltantes
 * - Passos de preparo
 */
public class ReceitasGeradorHTML extends ReceitasBaseVisitor<Void> {

    private final Map<String, Integer> inventario = new LinkedHashMap<>();
    private final List<String> possiveis = new ArrayList<>();
    private final Map<String, List<String>> insuficientes = new LinkedHashMap<>();
    private final List<String> passos = new ArrayList<>();
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
        visitDeclaracao_passos(ctx.declaracao_passos());
        // 4) Monta e escreve HTML
        montarHTML();
        return null;
    }

    @Override
    public Void visitDeclaracao_ingredientes(ReceitasParser.Declaracao_ingredientesContext ctx) {
        for (var ing : ctx.lista_ingredientes().ingrediente()) {
            String nome = ing.NOME().getText();
            int qtd = Integer.parseInt(ing.NUMERO().getText());
            inventario.put(nome, qtd);
        }
        return null;
    }

    @Override
    public Void visitDeclaracao_passos(ReceitasParser.Declaracao_passosContext ctx) {
        for (var passoCtx : ctx.passo()) {
            String textoComTraco = passoCtx.PASSO().getText(); // ex.: "-misture ovo..."
            String texto = textoComTraco.substring(1).trim(); // "misture ovo..."
            passos.add(texto);
        }
        return null;
    }

    /** Checa se uma receita pode ser feita e registra faltas */
    private void checarReceita(ReceitasParser.Declaracao_receitaContext ctx) {
        String nomeRec = ctx.NOME().getText();
        List<String> faltam = new ArrayList<>();
        for (var req : ctx.lista_ingredientes().ingrediente()) {
            String nomeIng = req.NOME().getText();
            int qtdReq = Integer.parseInt(req.NUMERO().getText());
            int qtdDisp = inventario.getOrDefault(nomeIng, 0);
            if (qtdDisp < qtdReq) {
                faltam.add(nomeIng + ": " + (qtdReq - qtdDisp));
            }
        }
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
        inventario
                .forEach((nome, qtd) -> html.append("  <li>").append(nome).append(": ").append(qtd).append("</li>\n"));
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

        // Passos de preparo
        html.append("<h1>Passos de Preparo</h1>\n<ol>\n");
        for (String passo : passos) {
            html.append("  <li>").append(passo).append("</li>\n");
        }
        html.append("</ol>\n");

        html.append("</body>\n</html>");
    }

    /** Escreve o HTML gerado em um arquivo */
    public void escreverHTML(String caminho) throws IOException {
        Files.writeString(Paths.get(caminho), html.toString());
    }
}
