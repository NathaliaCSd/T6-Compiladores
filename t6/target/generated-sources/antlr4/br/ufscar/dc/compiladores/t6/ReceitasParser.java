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
		T__0=1, T__1=2, T__2=3, T__3=4, PASSO=5, RECEITA=6, REQUER=7, INGREDIENTES=8, 
		RENDIMENTO=9, TEMPO=10, UN=11, G=12, ML=13, ID=14, NUMERO=15, DOIS_PONTOS=16, 
		VIRGULA=17, EQUAL=18, WS=19, COMENTARIO=20;
	public static final int
		RULE_programa = 0, RULE_declaracoes_receitas = 1, RULE_declaracao_receita = 2, 
		RULE_declaracao_ingredientes = 3, RULE_declaracao_passos = 4, RULE_passo = 5, 
		RULE_lista_ingredientes = 6, RULE_ingrediente = 7, RULE_unidade = 8, RULE_substituicoes = 9, 
		RULE_substituicao = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracoes_receitas", "declaracao_receita", "declaracao_ingredientes", 
			"declaracao_passos", "passo", "lista_ingredientes", "ingrediente", "unidade", 
			"substituicoes", "substituicao"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'porcoes'", "'min'", "'passos:'", "'substituicoes:'", "'-'", "'receita'", 
			"'requer'", "'ingredientes'", "'rendimento'", "'tempo'", "'un'", "'g'", 
			"'ml'", null, null, "':'", "','", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "PASSO", "RECEITA", "REQUER", "INGREDIENTES", 
			"RENDIMENTO", "TEMPO", "UN", "G", "ML", "ID", "NUMERO", "DOIS_PONTOS", 
			"VIRGULA", "EQUAL", "WS", "COMENTARIO"
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
		public Declaracao_passosContext declaracao_passos() {
			return getRuleContext(Declaracao_passosContext.class,0);
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
			setState(22);
			declaracoes_receitas();
			setState(23);
			declaracao_ingredientes();
			setState(24);
			declaracao_passos();
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(25);
				substituicoes();
				}
			}

			setState(28);
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
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				declaracao_receita();
				}
				}
				setState(33); 
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
		public TerminalNode ID() { return getToken(ReceitasParser.ID, 0); }
		public TerminalNode REQUER() { return getToken(ReceitasParser.REQUER, 0); }
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
			setState(35);
			match(RECEITA);
			setState(36);
			match(ID);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RENDIMENTO) {
				{
				setState(37);
				match(RENDIMENTO);
				setState(38);
				match(NUMERO);
				setState(39);
				match(T__0);
				}
			}

			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPO) {
				{
				setState(42);
				match(TEMPO);
				setState(43);
				match(NUMERO);
				setState(44);
				match(T__1);
				}
			}

			setState(47);
			match(REQUER);
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
	public static class Declaracao_ingredientesContext extends ParserRuleContext {
		public TerminalNode INGREDIENTES() { return getToken(ReceitasParser.INGREDIENTES, 0); }
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
			setState(50);
			match(INGREDIENTES);
			setState(51);
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
	public static class Declaracao_passosContext extends ParserRuleContext {
		public List<PassoContext> passo() {
			return getRuleContexts(PassoContext.class);
		}
		public PassoContext passo(int i) {
			return getRuleContext(PassoContext.class,i);
		}
		public Declaracao_passosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_passos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitasListener ) ((ReceitasListener)listener).enterDeclaracao_passos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitasListener ) ((ReceitasListener)listener).exitDeclaracao_passos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReceitasVisitor ) return ((ReceitasVisitor<? extends T>)visitor).visitDeclaracao_passos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_passosContext declaracao_passos() throws RecognitionException {
		Declaracao_passosContext _localctx = new Declaracao_passosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracao_passos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__2);
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				passo();
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PASSO );
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
	public static class PassoContext extends ParserRuleContext {
		public TerminalNode PASSO() { return getToken(ReceitasParser.PASSO, 0); }
		public PassoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_passo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitasListener ) ((ReceitasListener)listener).enterPasso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReceitasListener ) ((ReceitasListener)listener).exitPasso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReceitasVisitor ) return ((ReceitasVisitor<? extends T>)visitor).visitPasso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PassoContext passo() throws RecognitionException {
		PassoContext _localctx = new PassoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_passo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(PASSO);
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
		enterRule(_localctx, 12, RULE_lista_ingredientes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			ingrediente();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(62);
				match(VIRGULA);
				setState(63);
				ingrediente();
				}
				}
				setState(68);
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
		public TerminalNode ID() { return getToken(ReceitasParser.ID, 0); }
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
		enterRule(_localctx, 14, RULE_ingrediente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(ID);
			setState(70);
			match(DOIS_PONTOS);
			setState(71);
			match(NUMERO);
			setState(72);
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
		enterRule(_localctx, 16, RULE_unidade);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 14336L) != 0) ) {
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
		enterRule(_localctx, 18, RULE_substituicoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__3);
			setState(77);
			substituicao();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(78);
				match(VIRGULA);
				setState(79);
				substituicao();
				}
				}
				setState(84);
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
		public List<TerminalNode> ID() { return getTokens(ReceitasParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReceitasParser.ID, i);
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
		enterRule(_localctx, 20, RULE_substituicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(ID);
			setState(86);
			match(EQUAL);
			setState(87);
			match(ID);
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
		"\u0004\u0001\u0014Z\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000\u001b\b\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0004\u0001 \b\u0001\u000b\u0001\f\u0001!\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002)\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002.\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0004\u00048\b\u0004\u000b\u0004\f\u00049\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006A\b\u0006\n\u0006\f\u0006D\t"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\tQ\b\t\n\t\f\tT\t\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0001\u0001\u0000\u000b\rU"+
		"\u0000\u0016\u0001\u0000\u0000\u0000\u0002\u001f\u0001\u0000\u0000\u0000"+
		"\u0004#\u0001\u0000\u0000\u0000\u00062\u0001\u0000\u0000\u0000\b5\u0001"+
		"\u0000\u0000\u0000\n;\u0001\u0000\u0000\u0000\f=\u0001\u0000\u0000\u0000"+
		"\u000eE\u0001\u0000\u0000\u0000\u0010J\u0001\u0000\u0000\u0000\u0012L"+
		"\u0001\u0000\u0000\u0000\u0014U\u0001\u0000\u0000\u0000\u0016\u0017\u0003"+
		"\u0002\u0001\u0000\u0017\u0018\u0003\u0006\u0003\u0000\u0018\u001a\u0003"+
		"\b\u0004\u0000\u0019\u001b\u0003\u0012\t\u0000\u001a\u0019\u0001\u0000"+
		"\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000"+
		"\u0000\u0000\u001c\u001d\u0005\u0000\u0000\u0001\u001d\u0001\u0001\u0000"+
		"\u0000\u0000\u001e \u0003\u0004\u0002\u0000\u001f\u001e\u0001\u0000\u0000"+
		"\u0000 !\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001"+
		"\u0000\u0000\u0000\"\u0003\u0001\u0000\u0000\u0000#$\u0005\u0006\u0000"+
		"\u0000$(\u0005\u000e\u0000\u0000%&\u0005\t\u0000\u0000&\'\u0005\u000f"+
		"\u0000\u0000\')\u0005\u0001\u0000\u0000(%\u0001\u0000\u0000\u0000()\u0001"+
		"\u0000\u0000\u0000)-\u0001\u0000\u0000\u0000*+\u0005\n\u0000\u0000+,\u0005"+
		"\u000f\u0000\u0000,.\u0005\u0002\u0000\u0000-*\u0001\u0000\u0000\u0000"+
		"-.\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0005\u0007\u0000"+
		"\u000001\u0003\f\u0006\u00001\u0005\u0001\u0000\u0000\u000023\u0005\b"+
		"\u0000\u000034\u0003\f\u0006\u00004\u0007\u0001\u0000\u0000\u000057\u0005"+
		"\u0003\u0000\u000068\u0003\n\u0005\u000076\u0001\u0000\u0000\u000089\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000"+
		":\t\u0001\u0000\u0000\u0000;<\u0005\u0005\u0000\u0000<\u000b\u0001\u0000"+
		"\u0000\u0000=B\u0003\u000e\u0007\u0000>?\u0005\u0011\u0000\u0000?A\u0003"+
		"\u000e\u0007\u0000@>\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000"+
		"B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000C\r\u0001\u0000\u0000"+
		"\u0000DB\u0001\u0000\u0000\u0000EF\u0005\u000e\u0000\u0000FG\u0005\u0010"+
		"\u0000\u0000GH\u0005\u000f\u0000\u0000HI\u0003\u0010\b\u0000I\u000f\u0001"+
		"\u0000\u0000\u0000JK\u0007\u0000\u0000\u0000K\u0011\u0001\u0000\u0000"+
		"\u0000LM\u0005\u0004\u0000\u0000MR\u0003\u0014\n\u0000NO\u0005\u0011\u0000"+
		"\u0000OQ\u0003\u0014\n\u0000PN\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000"+
		"\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000S\u0013\u0001"+
		"\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000UV\u0005\u000e\u0000\u0000"+
		"VW\u0005\u0012\u0000\u0000WX\u0005\u000e\u0000\u0000X\u0015\u0001\u0000"+
		"\u0000\u0000\u0007\u001a!(-9BR";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}