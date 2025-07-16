// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.t6;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ReceitasParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, RECEITA=4, REQUER=5, INGREDIENTES=6, RENDIMENTO=7, 
		TEMPO=8, UN=9, G=10, ML=11, NOME=12, NUMERO=13, DOIS_PONTOS=14, VIRGULA=15, 
		EQUAL=16, PASSO=17, WS=18, COMENTARIO=19;
	public static final int
		RULE_programa = 0, RULE_declaracoes_receitas = 1, RULE_declaracao_receita = 2, 
		RULE_declaracao_ingredientes = 3, RULE_lista_ingredientes = 4, RULE_ingrediente = 5, 
		RULE_unidade = 6, RULE_substituicoes = 7, RULE_substituicao = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracoes_receitas", "declaracao_receita", "declaracao_ingredientes", 
			"lista_ingredientes", "ingrediente", "unidade", "substituicoes", "substituicao"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'porcoes'", "'min'", "'substituicoes:'", "'receita'", "'requer'", 
			"'ingredientes'", "'rendimento'", "'tempo'", "'un'", "'g'", "'ml'", null, 
			null, "':'", "','", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "RECEITA", "REQUER", "INGREDIENTES", "RENDIMENTO", 
			"TEMPO", "UN", "G", "ML", "NOME", "NUMERO", "DOIS_PONTOS", "VIRGULA", 
			"EQUAL", "PASSO", "WS", "COMENTARIO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ReceitasParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public Declaracoes_receitasContext declaracoes_receitas() {
			return getRuleContext(Declaracoes_receitasContext.class,0);
		}
		public Declaracao_ingredientesContext declaracao_ingredientes() {
			return getRuleContext(Declaracao_ingredientesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ReceitasParser.EOF, 0); }
		public SubstituicoesContext substituicoes() {
			return getRuleContext(SubstituicoesContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitasListener ) ((ReceitasListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitasListener ) ((ReceitasListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReceitasVisitor ) return ((ReceitasVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			declaracoes_receitas();
			setState(19);
			declaracao_ingredientes();
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(20);
				substituicoes();
				}
			}

			setState(23);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracoes_receitasContext extends ParserRuleContext {
		public List<Declaracao_receitaContext> declaracao_receita() {
			return getRuleContexts(Declaracao_receitaContext.class);
		}
		public Declaracao_receitaContext declaracao_receita(int i) {
			return getRuleContext(Declaracao_receitaContext.class,i);
		}
		public Declaracoes_receitasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes_receitas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitasListener ) ((ReceitasListener)listener).enterDeclaracoes_receitas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitasListener ) ((ReceitasListener)listener).exitDeclaracoes_receitas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReceitasVisitor ) return ((ReceitasVisitor<? extends T>)visitor).visitDeclaracoes_receitas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracoes_receitasContext declaracoes_receitas() throws RecognitionException {
		Declaracoes_receitasContext _localctx = new Declaracoes_receitasContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes_receitas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(25);
				declaracao_receita();
				}
				}
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RECEITA );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_receitaContext extends ParserRuleContext {
		public TerminalNode RECEITA() { return getToken(ReceitasParser.RECEITA, 0); }
		public TerminalNode NOME() { return getToken(ReceitasParser.NOME, 0); }
		public TerminalNode REQUER() { return getToken(ReceitasParser.REQUER, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(ReceitasParser.DOIS_PONTOS, 0); }
		public Lista_ingredientesContext lista_ingredientes() {
			return getRuleContext(Lista_ingredientesContext.class,0);
		}
		public TerminalNode RENDIMENTO() { return getToken(ReceitasParser.RENDIMENTO, 0); }
		public List<TerminalNode> NUMERO() { return getTokens(ReceitasParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(ReceitasParser.NUMERO, i);
		}
		public TerminalNode TEMPO() { return getToken(ReceitasParser.TEMPO, 0); }
		public Declaracao_receitaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_receita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitasListener ) ((ReceitasListener)listener).enterDeclaracao_receita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitasListener ) ((ReceitasListener)listener).exitDeclaracao_receita(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReceitasVisitor ) return ((ReceitasVisitor<? extends T>)visitor).visitDeclaracao_receita(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_receitaContext declaracao_receita() throws RecognitionException {
		Declaracao_receitaContext _localctx = new Declaracao_receitaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao_receita);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(RECEITA);
			setState(31);
			match(NOME);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RENDIMENTO) {
				{
				setState(32);
				match(RENDIMENTO);
				setState(33);
				match(NUMERO);
				setState(34);
				match(T__0);
				}
			}

			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPO) {
				{
				setState(37);
				match(TEMPO);
				setState(38);
				match(NUMERO);
				setState(39);
				match(T__1);
				}
			}

			setState(42);
			match(REQUER);
			setState(43);
			match(DOIS_PONTOS);
			setState(44);
			lista_ingredientes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_ingredientesContext extends ParserRuleContext {
		public TerminalNode INGREDIENTES() { return getToken(ReceitasParser.INGREDIENTES, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(ReceitasParser.DOIS_PONTOS, 0); }
		public Lista_ingredientesContext lista_ingredientes() {
			return getRuleContext(Lista_ingredientesContext.class,0);
		}
		public Declaracao_ingredientesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_ingredientes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitasListener ) ((ReceitasListener)listener).enterDeclaracao_ingredientes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitasListener ) ((ReceitasListener)listener).exitDeclaracao_ingredientes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReceitasVisitor ) return ((ReceitasVisitor<? extends T>)visitor).visitDeclaracao_ingredientes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_ingredientesContext declaracao_ingredientes() throws RecognitionException {
		Declaracao_ingredientesContext _localctx = new Declaracao_ingredientesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao_ingredientes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(INGREDIENTES);
			setState(47);
			match(DOIS_PONTOS);
			setState(48);
			lista_ingredientes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Lista_ingredientesContext extends ParserRuleContext {
		public List<IngredienteContext> ingrediente() {
			return getRuleContexts(IngredienteContext.class);
		}
		public IngredienteContext ingrediente(int i) {
			return getRuleContext(IngredienteContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(ReceitasParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(ReceitasParser.VIRGULA, i);
		}
		public Lista_ingredientesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_ingredientes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitasListener ) ((ReceitasListener)listener).enterLista_ingredientes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitasListener ) ((ReceitasListener)listener).exitLista_ingredientes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReceitasVisitor ) return ((ReceitasVisitor<? extends T>)visitor).visitLista_ingredientes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_ingredientesContext lista_ingredientes() throws RecognitionException {
		Lista_ingredientesContext _localctx = new Lista_ingredientesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lista_ingredientes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			ingrediente();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(51);
				match(VIRGULA);
				setState(52);
				ingrediente();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IngredienteContext extends ParserRuleContext {
		public TerminalNode NOME() { return getToken(ReceitasParser.NOME, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(ReceitasParser.DOIS_PONTOS, 0); }
		public TerminalNode NUMERO() { return getToken(ReceitasParser.NUMERO, 0); }
		public UnidadeContext unidade() {
			return getRuleContext(UnidadeContext.class,0);
		}
		public IngredienteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ingrediente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitasListener ) ((ReceitasListener)listener).enterIngrediente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitasListener ) ((ReceitasListener)listener).exitIngrediente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReceitasVisitor ) return ((ReceitasVisitor<? extends T>)visitor).visitIngrediente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IngredienteContext ingrediente() throws RecognitionException {
		IngredienteContext _localctx = new IngredienteContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ingrediente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(NOME);
			setState(59);
			match(DOIS_PONTOS);
			setState(60);
			match(NUMERO);
			setState(61);
			unidade();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnidadeContext extends ParserRuleContext {
		public TerminalNode UN() { return getToken(ReceitasParser.UN, 0); }
		public TerminalNode G() { return getToken(ReceitasParser.G, 0); }
		public TerminalNode ML() { return getToken(ReceitasParser.ML, 0); }
		public UnidadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unidade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitasListener ) ((ReceitasListener)listener).enterUnidade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitasListener ) ((ReceitasListener)listener).exitUnidade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReceitasVisitor ) return ((ReceitasVisitor<? extends T>)visitor).visitUnidade(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnidadeContext unidade() throws RecognitionException {
		UnidadeContext _localctx = new UnidadeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unidade);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubstituicoesContext extends ParserRuleContext {
		public List<SubstituicaoContext> substituicao() {
			return getRuleContexts(SubstituicaoContext.class);
		}
		public SubstituicaoContext substituicao(int i) {
			return getRuleContext(SubstituicaoContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(ReceitasParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(ReceitasParser.VIRGULA, i);
		}
		public SubstituicoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substituicoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitasListener ) ((ReceitasListener)listener).enterSubstituicoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitasListener ) ((ReceitasListener)listener).exitSubstituicoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReceitasVisitor ) return ((ReceitasVisitor<? extends T>)visitor).visitSubstituicoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubstituicoesContext substituicoes() throws RecognitionException {
		SubstituicoesContext _localctx = new SubstituicoesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_substituicoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__2);
			setState(66);
			substituicao();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(67);
				match(VIRGULA);
				setState(68);
				substituicao();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubstituicaoContext extends ParserRuleContext {
		public List<TerminalNode> NOME() { return getTokens(ReceitasParser.NOME); }
		public TerminalNode NOME(int i) {
			return getToken(ReceitasParser.NOME, i);
		}
		public TerminalNode EQUAL() { return getToken(ReceitasParser.EQUAL, 0); }
		public SubstituicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substituicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitasListener ) ((ReceitasListener)listener).enterSubstituicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitasListener ) ((ReceitasListener)listener).exitSubstituicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReceitasVisitor ) return ((ReceitasVisitor<? extends T>)visitor).visitSubstituicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubstituicaoContext substituicao() throws RecognitionException {
		SubstituicaoContext _localctx = new SubstituicaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_substituicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(NOME);
			setState(75);
			match(EQUAL);
			setState(76);
			match(NOME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0013O\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0016\b\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001\u001b\b\u0001\u000b\u0001"+
		"\f\u0001\u001c\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002$\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		")\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u00046\b\u0004\n\u0004\f\u00049\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007F\b\u0007\n\u0007\f\u0007"+
		"I\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0000\u0000\t\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0001\u0001\u0000\t\u000bK"+
		"\u0000\u0012\u0001\u0000\u0000\u0000\u0002\u001a\u0001\u0000\u0000\u0000"+
		"\u0004\u001e\u0001\u0000\u0000\u0000\u0006.\u0001\u0000\u0000\u0000\b"+
		"2\u0001\u0000\u0000\u0000\n:\u0001\u0000\u0000\u0000\f?\u0001\u0000\u0000"+
		"\u0000\u000eA\u0001\u0000\u0000\u0000\u0010J\u0001\u0000\u0000\u0000\u0012"+
		"\u0013\u0003\u0002\u0001\u0000\u0013\u0015\u0003\u0006\u0003\u0000\u0014"+
		"\u0016\u0003\u000e\u0007\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0015"+
		"\u0016\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017"+
		"\u0018\u0005\u0000\u0000\u0001\u0018\u0001\u0001\u0000\u0000\u0000\u0019"+
		"\u001b\u0003\u0004\u0002\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001b"+
		"\u001c\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001c"+
		"\u001d\u0001\u0000\u0000\u0000\u001d\u0003\u0001\u0000\u0000\u0000\u001e"+
		"\u001f\u0005\u0004\u0000\u0000\u001f#\u0005\f\u0000\u0000 !\u0005\u0007"+
		"\u0000\u0000!\"\u0005\r\u0000\u0000\"$\u0005\u0001\u0000\u0000# \u0001"+
		"\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$(\u0001\u0000\u0000\u0000"+
		"%&\u0005\b\u0000\u0000&\'\u0005\r\u0000\u0000\')\u0005\u0002\u0000\u0000"+
		"(%\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000"+
		"\u0000*+\u0005\u0005\u0000\u0000+,\u0005\u000e\u0000\u0000,-\u0003\b\u0004"+
		"\u0000-\u0005\u0001\u0000\u0000\u0000./\u0005\u0006\u0000\u0000/0\u0005"+
		"\u000e\u0000\u000001\u0003\b\u0004\u00001\u0007\u0001\u0000\u0000\u0000"+
		"27\u0003\n\u0005\u000034\u0005\u000f\u0000\u000046\u0003\n\u0005\u0000"+
		"53\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000"+
		"\u000078\u0001\u0000\u0000\u00008\t\u0001\u0000\u0000\u000097\u0001\u0000"+
		"\u0000\u0000:;\u0005\f\u0000\u0000;<\u0005\u000e\u0000\u0000<=\u0005\r"+
		"\u0000\u0000=>\u0003\f\u0006\u0000>\u000b\u0001\u0000\u0000\u0000?@\u0007"+
		"\u0000\u0000\u0000@\r\u0001\u0000\u0000\u0000AB\u0005\u0003\u0000\u0000"+
		"BG\u0003\u0010\b\u0000CD\u0005\u000f\u0000\u0000DF\u0003\u0010\b\u0000"+
		"EC\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000"+
		"\u0000GH\u0001\u0000\u0000\u0000H\u000f\u0001\u0000\u0000\u0000IG\u0001"+
		"\u0000\u0000\u0000JK\u0005\f\u0000\u0000KL\u0005\u0010\u0000\u0000LM\u0005"+
		"\f\u0000\u0000M\u0011\u0001\u0000\u0000\u0000\u0006\u0015\u001c#(7G";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}