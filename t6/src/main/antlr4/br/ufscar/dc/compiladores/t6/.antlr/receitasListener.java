// Generated from c:/UFSCar/Compiladores/T6/T6-Compiladores/t6/src/main/antlr4/br/ufscar/dc/compiladores/t6/Receitas.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ReceitasParser}.
 */
public interface ReceitasListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ReceitasParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(ReceitasParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceitasParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(ReceitasParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceitasParser#declaracoes_receitas}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes_receitas(ReceitasParser.Declaracoes_receitasContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceitasParser#declaracoes_receitas}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes_receitas(ReceitasParser.Declaracoes_receitasContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceitasParser#declaracao_receita}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_receita(ReceitasParser.Declaracao_receitaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceitasParser#declaracao_receita}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_receita(ReceitasParser.Declaracao_receitaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceitasParser#declaracao_ingredientes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_ingredientes(ReceitasParser.Declaracao_ingredientesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceitasParser#declaracao_ingredientes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_ingredientes(ReceitasParser.Declaracao_ingredientesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceitasParser#declaracao_passos}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_passos(ReceitasParser.Declaracao_passosContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceitasParser#declaracao_passos}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_passos(ReceitasParser.Declaracao_passosContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceitasParser#passo}.
	 * @param ctx the parse tree
	 */
	void enterPasso(ReceitasParser.PassoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceitasParser#passo}.
	 * @param ctx the parse tree
	 */
	void exitPasso(ReceitasParser.PassoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceitasParser#lista_ingredientes}.
	 * @param ctx the parse tree
	 */
	void enterLista_ingredientes(ReceitasParser.Lista_ingredientesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceitasParser#lista_ingredientes}.
	 * @param ctx the parse tree
	 */
	void exitLista_ingredientes(ReceitasParser.Lista_ingredientesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceitasParser#ingrediente}.
	 * @param ctx the parse tree
	 */
	void enterIngrediente(ReceitasParser.IngredienteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceitasParser#ingrediente}.
	 * @param ctx the parse tree
	 */
	void exitIngrediente(ReceitasParser.IngredienteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceitasParser#unidade}.
	 * @param ctx the parse tree
	 */
	void enterUnidade(ReceitasParser.UnidadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceitasParser#unidade}.
	 * @param ctx the parse tree
	 */
	void exitUnidade(ReceitasParser.UnidadeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceitasParser#substituicoes}.
	 * @param ctx the parse tree
	 */
	void enterSubstituicoes(ReceitasParser.SubstituicoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceitasParser#substituicoes}.
	 * @param ctx the parse tree
	 */
	void exitSubstituicoes(ReceitasParser.SubstituicoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReceitasParser#substituicao}.
	 * @param ctx the parse tree
	 */
	void enterSubstituicao(ReceitasParser.SubstituicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReceitasParser#substituicao}.
	 * @param ctx the parse tree
	 */
	void exitSubstituicao(ReceitasParser.SubstituicaoContext ctx);
}