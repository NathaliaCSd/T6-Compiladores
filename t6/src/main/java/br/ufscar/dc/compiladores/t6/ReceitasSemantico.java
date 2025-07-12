package br.ufscar.dc.compiladores.t6;

import br.ufscar.dc.compiladores.t6.TabelaDeSimbolos.TipoReceitas;

public class ReceitasSemantico extends ReceitasBaseVisitor<Void> {
    
    //Cria a tabela de simbolos:
    private TabelaDeSimbolos tabela = new TabelaDeSimbolos();

    //Visitante de Receita:
     @Override
    public Void visitPrograma(ReceitasParser.ProgramaContext ctx) {
        // 1) Primeiro processa o inventário de ingredientes
        visitDeclaracao_ingredientes(ctx.declaracao_ingredientes());
        // 2) Depois processa cada receita, usando o inventário já preenchido
        for (ReceitasParser.Declaracao_receitaContext recCtx
                : ctx.declaracoes_receitas().declaracao_receita()) {
            visitDeclaracao_receita(recCtx);
        }
        return null;
    }

     //Visitante da lista de ingredientes: Verifica se o ingrediente já está na tabela e o adiciona:
    @Override
    public Void visitDeclaracao_ingredientes(ReceitasParser.Declaracao_ingredientesContext ctx) {
        // Percorre cada ingrediente do inventário
        for (ReceitasParser.IngredienteContext ingCtx
                : ctx.lista_ingredientes().ingrediente()) {
            Token tk = ingCtx.ID().getSymbol();
            String nomeIng = tk.getText();
            if (tabela.existeIngrediente(nomeIng)) {
                SemanticoUtils.adicionarErroSemantico(tk,
                    "Ingrediente " + nomeIng + " já declarado.");
            } else {
                tabela.adicionarIngrediente(nomeIng);
            }
        }
        return null;
    }

    

}
