// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.t6;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link receitasParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface receitasVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link receitasParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(receitasParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitasParser#declaracoes_receitas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes_receitas(receitasParser.Declaracoes_receitasContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitasParser#declaracao_receita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_receita(receitasParser.Declaracao_receitaContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitasParser#declaracao_ingredientes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_ingredientes(receitasParser.Declaracao_ingredientesContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitasParser#lista_ingredientes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_ingredientes(receitasParser.Lista_ingredientesContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitasParser#ingrediente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIngrediente(receitasParser.IngredienteContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitasParser#unidade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnidade(receitasParser.UnidadeContext ctx);
}