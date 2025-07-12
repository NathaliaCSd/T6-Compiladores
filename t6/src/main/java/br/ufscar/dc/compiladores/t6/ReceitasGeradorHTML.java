package br.ufscar.dc.compiladores.t6;


import org.antlr.v4.runtime.ParserRuleContext;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.*;


/**
 * Gera um relatório HTML listando receitas possíveis e não possíveis
 * com base nos ingredientes disponíveis.
 */
public class ReceitasGeradorHTML extends ReceitasBaseVisitor<Void> {

    /** Inventário de ingredientes (nome -> quantidade disponível) */
    private final Map<String, Integer> inventario = new LinkedHashMap<>();
    /** Receitas possíveis de serem feitas */
    private final List<String> possiveis = new ArrayList<>();
    /** Receitas não possíveis e seus ingredientes faltantes */
    private final Map<String, List<String>> insuficientes = new LinkedHashMap<>();
    /** HTML gerado */
    private final StringBuilder html = new StringBuilder();

    @Override
    public Void visitPrograma(ReceitasParser.ProgramaContext ctx) {
        // 1) Preenche inventário
        visitDeclaracao_ingredientes(ctx.declaracao_ingredientes());
        // 2) Avalia cada receita
        for (var recCtx : ctx.declaracoes_receitas().declaracao_receita()) {
            checarReceita(recCtx);
        }
        // 3) Monta HTML
        montarHTML();
        return null;
    }

    @Override
    public Void visitDeclaracao_ingredientes(ReceitasParser.Declaracao_ingredientesContext ctx) {
        for (var ing : ctx.lista_ingredientes().ingrediente()) {
            String nome = ing.ID().getText();
            int qtd = Integer.parseInt(ing.NUMERO().getText());
            inventario.put(nome, qtd);
        }
        return null;
    }

    /** Checa se uma receita pode ser feita e registra faltas */
    private void checarReceita(ReceitasParser.Declaracao_receitaContext ctx) {
        String nomeRec = ctx.ID().getText();
        List<String> faltam = new ArrayList<>();
        for (var req : ctx.lista_ingredientes().ingrediente()) {
            String nomeIng = req.ID().getText();
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

    /** Constrói o conteúdo HTML */
    private void montarHTML() {
        html.append("<!doctype html>\n<html>\n<head>\n  <meta charset=\"utf-8\">\n  <title>Relatório de Receitas</title>\n  <style>body{font-family:sans-serif;}h1{color:#2e6c80;}ul{list-style:circle;}li{margin-bottom:4px;}</style>\n</head>\n<body>\n");
        html.append("<h1>Receitas Possíveis</h1>\n<ul>\n");
        for (String r : possiveis) {
            html.append("  <li>").append(r).append("</li>\n");
        }
        html.append("</ul>\n<h1>Receitas Não Possíveis</h1>\n<ul>\n");
        for (var entry : insuficientes.entrySet()) {
            html.append("  <li>")
                .append(entry.getKey())
                .append(" (faltam: ")
                .append(String.join(", ", entry.getValue()))
                .append(")</li>\n");
        }
        html.append("</ul>\n</body>\n</html>");
    }

    /** Escreve o HTML gerado em um arquivo */
    public void escreverHTML(String caminho) throws IOException {
        Files.writeString(Paths.get(caminho), html.toString());
    }
}
