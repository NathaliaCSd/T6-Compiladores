package br.ufscar.dc.compiladores.t6;

import java.util.HashSet;
import java.util.Set;
import org.antlr.v4.runtime.Token;


public class ReceitasSemantico extends ReceitasBaseVisitor<Void> {

    private TabelaDeSimbolos tabela = new TabelaDeSimbolos();

    @Override
public Void visitPrograma(ReceitasParser.ProgramaContext ctx) {
    // 1) Receitas
    for (var recCtx : ctx.declaracoes_receitas().declaracao_receita()) {
        visitDeclaracao_receita(recCtx);
    }
    // 2) Ingredientes
    visitDeclaracao_ingredientes(ctx.declaracao_ingredientes());
    // 3) Passos
    visitDeclaracao_passos(ctx.declaracao_passos());
    // 4) Substituições, se houver
    if (ctx.substituicoes() != null) {
        visitSubstituicoes(ctx.substituicoes());
    }
    return null;
}


    @Override
    public Void visitDeclaracao_ingredientes(ReceitasParser.Declaracao_ingredientesContext ctx) {
        for (var ingCtx : ctx.lista_ingredientes().ingrediente()) {
            Token tk = ingCtx.NOME().getSymbol();
            String nome = tk.getText();
            if (tabela.existeIngrediente(nome)) {
                ReceitasSemanticoUtils.adicionarErroSemantico(tk,
                    "Ingrediente '" + nome + "' já declarado.");
            } else {
                tabela.adicionarIngrediente(nome);
            }
        }
        return null;
    }

    @Override
    public Void visitDeclaracao_receita(ReceitasParser.Declaracao_receitaContext ctx) {
        Token tkRec = ctx.NOME().getSymbol();
        String nomeRec = tkRec.getText();
        // 2.1) Receita duplicada
        if (tabela.existeReceita(nomeRec)) {
            ReceitasSemanticoUtils.adicionarErroSemantico(tkRec,
                "Receita '" + nomeRec + "' já declarada.");
        } else {
            tabela.adicionarReceita(nomeRec);
        }
        
        // 2.2) Rendimento (se presente)
        if (ctx.RENDIMENTO() != null) {
            int rendimento = Integer.parseInt(ctx.NUMERO(0).getText());
            if (rendimento <= 0) {
                ReceitasSemanticoUtils.adicionarErroSemantico(ctx.NUMERO(0).getSymbol(),
                    "Rendimento deve ser maior que zero.");
            }
        }
        // 2.3) Tempo (se presente)
        if (ctx.TEMPO() != null) {
            int tempo = Integer.parseInt(ctx.NUMERO(ctx.RENDIMENTO() != null ? 1 : 0).getText());
            if (tempo <= 0) {
                ReceitasSemanticoUtils.adicionarErroSemantico(ctx.NUMERO(ctx.RENDIMENTO() != null ? 1 : 0).getSymbol(),
                    "Tempo deve ser maior que zero.");
            }
        }
        
        // 2.4) Ingredientes da receita
        Set<String> usados = new HashSet<>();
        for (var ingReq : ctx.lista_ingredientes().ingrediente()) {
            Token tkIng = ingReq.NOME().getSymbol();
            String nomeIng = tkIng.getText();
            // Deve existir no inventário
            if (!tabela.existeIngrediente(nomeIng)) {
                ReceitasSemanticoUtils.adicionarErroSemantico(tkIng,
                    "Ingrediente '" + nomeIng + "' não declarado.");
            }
            // Sem duplicatas na mesma receita
            if (!usados.add(nomeIng)) {
                ReceitasSemanticoUtils.adicionarErroSemantico(tkIng,
                    "Ingrediente '" + nomeIng + "' duplicado na receita.");
            }
        }
        return null;
    }

    @Override
    public Void visitSubstituicoes(ReceitasParser.SubstituicoesContext ctx) {
        Set<String> originais = new HashSet<>();
        for (var subCtx : ctx.substituicao()) {
            Token tkOrig = subCtx.NOME(0).getSymbol();
            Token tkNovo = subCtx.NOME(1).getSymbol();
            String orig = tkOrig.getText();
            String novo = tkNovo.getText();
            if (!tabela.existeIngrediente(orig)) {
                ReceitasSemanticoUtils.adicionarErroSemantico(tkOrig,
                    "Ingrediente '" + orig + "' não declarado para substituição.");
            }
            if (!tabela.existeIngrediente(novo)) {
                ReceitasSemanticoUtils.adicionarErroSemantico(tkNovo,
                    "Ingrediente '" + novo + "' não declarado como substituto.");
            }
            if (!originais.add(orig)) {
                ReceitasSemanticoUtils.adicionarErroSemantico(tkOrig,
                    "Substituição para '" + orig + "' declarada mais de uma vez.");
            }
        }
        return null;
    }

    @Override
    public Void visitDeclaracao_passos(ReceitasParser.Declaracao_passosContext ctx) {
        if (ctx.passo().isEmpty()) {
            ReceitasSemanticoUtils.adicionarErroSemantico(ctx.getStart(),
                "É preciso definir ao menos um passo.");
        }
        return null;
    }
}
