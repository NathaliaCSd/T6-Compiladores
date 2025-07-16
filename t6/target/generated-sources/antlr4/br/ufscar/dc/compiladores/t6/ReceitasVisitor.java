// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.t6;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ReceitasParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ReceitasVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ReceitasParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(ReceitasParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceitasParser#declaracoes_receitas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes_receitas(ReceitasParser.Declaracoes_receitasContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceitasParser#declaracao_receita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_receita(ReceitasParser.Declaracao_receitaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceitasParser#declaracao_ingredientes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_ingredientes(ReceitasParser.Declaracao_ingredientesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceitasParser#lista_ingredientes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_ingredientes(ReceitasParser.Lista_ingredientesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceitasParser#ingrediente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIngrediente(ReceitasParser.IngredienteContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceitasParser#unidade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnidade(ReceitasParser.UnidadeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceitasParser#substituicoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstituicoes(ReceitasParser.SubstituicoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReceitasParser#substituicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstituicao(ReceitasParser.SubstituicaoContext ctx);
}