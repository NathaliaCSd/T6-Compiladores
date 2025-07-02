// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.t6;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link receitasParser}.
 */
public interface receitasListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link receitasParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(receitasParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link receitasParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(receitasParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link receitasParser#declaracao_receita}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_receita(receitasParser.Declaracao_receitaContext ctx);
	/**
	 * Exit a parse tree produced by {@link receitasParser#declaracao_receita}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_receita(receitasParser.Declaracao_receitaContext ctx);
	/**
	 * Enter a parse tree produced by {@link receitasParser#declaracao_ingredientes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_ingredientes(receitasParser.Declaracao_ingredientesContext ctx);
	/**
	 * Exit a parse tree produced by {@link receitasParser#declaracao_ingredientes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_ingredientes(receitasParser.Declaracao_ingredientesContext ctx);
	/**
	 * Enter a parse tree produced by {@link receitasParser#lista_ingredientes}.
	 * @param ctx the parse tree
	 */
	void enterLista_ingredientes(receitasParser.Lista_ingredientesContext ctx);
	/**
	 * Exit a parse tree produced by {@link receitasParser#lista_ingredientes}.
	 * @param ctx the parse tree
	 */
	void exitLista_ingredientes(receitasParser.Lista_ingredientesContext ctx);
	/**
	 * Enter a parse tree produced by {@link receitasParser#ingrediente}.
	 * @param ctx the parse tree
	 */
	void enterIngrediente(receitasParser.IngredienteContext ctx);
	/**
	 * Exit a parse tree produced by {@link receitasParser#ingrediente}.
	 * @param ctx the parse tree
	 */
	void exitIngrediente(receitasParser.IngredienteContext ctx);
	/**
	 * Enter a parse tree produced by {@link receitasParser#unidade}.
	 * @param ctx the parse tree
	 */
	void enterUnidade(receitasParser.UnidadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link receitasParser#unidade}.
	 * @param ctx the parse tree
	 */
	void exitUnidade(receitasParser.UnidadeContext ctx);
}