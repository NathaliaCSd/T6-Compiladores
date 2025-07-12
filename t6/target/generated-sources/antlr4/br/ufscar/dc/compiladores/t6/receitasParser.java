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
public class receitasParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		RECEITA=1, REQUER=2, INGREDIENTES=3, UN=4, G=5, ML=6, ID=7, NUMERO=8, 
		DOIS_PONTOS=9, VIRGULA=10, WS=11, COMENTARIO=12;
	public static final int
		RULE_programa = 0, RULE_declaracoes_receitas = 1, RULE_declaracao_receita = 2, 
		RULE_declaracao_ingredientes = 3, RULE_lista_ingredientes = 4, RULE_ingrediente = 5, 
		RULE_unidade = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracoes_receitas", "declaracao_receita", "declaracao_ingredientes", 
			"lista_ingredientes", "ingrediente", "unidade"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'receita'", "'requer'", "'ingredientes'", "'un'", "'g'", "'ml'", 
			null, null, "':'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "RECEITA", "REQUER", "INGREDIENTES", "UN", "G", "ML", "ID", "NUMERO", 
			"DOIS_PONTOS", "VIRGULA", "WS", "COMENTARIO"
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

	public receitasParser(TokenStream input) {
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
		public TerminalNode EOF() { return getToken(receitasParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof receitasListener ) ((receitasListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitasListener ) ((receitasListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof receitasVisitor ) return ((receitasVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			declaracoes_receitas();
			setState(15);
			declaracao_ingredientes();
			setState(16);
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
			if ( listener instanceof receitasListener ) ((receitasListener)listener).enterDeclaracoes_receitas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitasListener ) ((receitasListener)listener).exitDeclaracoes_receitas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof receitasVisitor ) return ((receitasVisitor<? extends T>)visitor).visitDeclaracoes_receitas(this);
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
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				declaracao_receita();
				}
				}
				setState(21); 
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
		public TerminalNode RECEITA() { return getToken(receitasParser.RECEITA, 0); }
		public TerminalNode ID() { return getToken(receitasParser.ID, 0); }
		public TerminalNode REQUER() { return getToken(receitasParser.REQUER, 0); }
		public Lista_ingredientesContext lista_ingredientes() {
			return getRuleContext(Lista_ingredientesContext.class,0);
		}
		public Declaracao_receitaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_receita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof receitasListener ) ((receitasListener)listener).enterDeclaracao_receita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitasListener ) ((receitasListener)listener).exitDeclaracao_receita(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof receitasVisitor ) return ((receitasVisitor<? extends T>)visitor).visitDeclaracao_receita(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_receitaContext declaracao_receita() throws RecognitionException {
		Declaracao_receitaContext _localctx = new Declaracao_receitaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao_receita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(RECEITA);
			setState(24);
			match(ID);
			setState(25);
			match(REQUER);
			setState(26);
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
		public TerminalNode INGREDIENTES() { return getToken(receitasParser.INGREDIENTES, 0); }
		public Lista_ingredientesContext lista_ingredientes() {
			return getRuleContext(Lista_ingredientesContext.class,0);
		}
		public Declaracao_ingredientesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_ingredientes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof receitasListener ) ((receitasListener)listener).enterDeclaracao_ingredientes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitasListener ) ((receitasListener)listener).exitDeclaracao_ingredientes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof receitasVisitor ) return ((receitasVisitor<? extends T>)visitor).visitDeclaracao_ingredientes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_ingredientesContext declaracao_ingredientes() throws RecognitionException {
		Declaracao_ingredientesContext _localctx = new Declaracao_ingredientesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao_ingredientes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(INGREDIENTES);
			setState(29);
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
		public List<TerminalNode> VIRGULA() { return getTokens(receitasParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(receitasParser.VIRGULA, i);
		}
		public Lista_ingredientesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_ingredientes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof receitasListener ) ((receitasListener)listener).enterLista_ingredientes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitasListener ) ((receitasListener)listener).exitLista_ingredientes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof receitasVisitor ) return ((receitasVisitor<? extends T>)visitor).visitLista_ingredientes(this);
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
			setState(31);
			ingrediente();
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(32);
				match(VIRGULA);
				setState(33);
				ingrediente();
				}
				}
				setState(38);
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
		public TerminalNode ID() { return getToken(receitasParser.ID, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(receitasParser.DOIS_PONTOS, 0); }
		public TerminalNode NUMERO() { return getToken(receitasParser.NUMERO, 0); }
		public UnidadeContext unidade() {
			return getRuleContext(UnidadeContext.class,0);
		}
		public IngredienteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ingrediente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof receitasListener ) ((receitasListener)listener).enterIngrediente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitasListener ) ((receitasListener)listener).exitIngrediente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof receitasVisitor ) return ((receitasVisitor<? extends T>)visitor).visitIngrediente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IngredienteContext ingrediente() throws RecognitionException {
		IngredienteContext _localctx = new IngredienteContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ingrediente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(ID);
			setState(40);
			match(DOIS_PONTOS);
			setState(41);
			match(NUMERO);
			setState(42);
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
		public TerminalNode UN() { return getToken(receitasParser.UN, 0); }
		public TerminalNode G() { return getToken(receitasParser.G, 0); }
		public TerminalNode ML() { return getToken(receitasParser.ML, 0); }
		public UnidadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unidade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof receitasListener ) ((receitasListener)listener).enterUnidade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitasListener ) ((receitasListener)listener).exitUnidade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof receitasVisitor ) return ((receitasVisitor<? extends T>)visitor).visitUnidade(this);
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
			setState(44);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 112L) != 0) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\f/\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0004\u0001\u0014\b\u0001\u000b\u0001\f"+
		"\u0001\u0015\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004#\b\u0004\n\u0004\f\u0004&\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0000\u0000\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0001\u0001\u0000"+
		"\u0004\u0006)\u0000\u000e\u0001\u0000\u0000\u0000\u0002\u0013\u0001\u0000"+
		"\u0000\u0000\u0004\u0017\u0001\u0000\u0000\u0000\u0006\u001c\u0001\u0000"+
		"\u0000\u0000\b\u001f\u0001\u0000\u0000\u0000\n\'\u0001\u0000\u0000\u0000"+
		"\f,\u0001\u0000\u0000\u0000\u000e\u000f\u0003\u0002\u0001\u0000\u000f"+
		"\u0010\u0003\u0006\u0003\u0000\u0010\u0011\u0005\u0000\u0000\u0001\u0011"+
		"\u0001\u0001\u0000\u0000\u0000\u0012\u0014\u0003\u0004\u0002\u0000\u0013"+
		"\u0012\u0001\u0000\u0000\u0000\u0014\u0015\u0001\u0000\u0000\u0000\u0015"+
		"\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016"+
		"\u0003\u0001\u0000\u0000\u0000\u0017\u0018\u0005\u0001\u0000\u0000\u0018"+
		"\u0019\u0005\u0007\u0000\u0000\u0019\u001a\u0005\u0002\u0000\u0000\u001a"+
		"\u001b\u0003\b\u0004\u0000\u001b\u0005\u0001\u0000\u0000\u0000\u001c\u001d"+
		"\u0005\u0003\u0000\u0000\u001d\u001e\u0003\b\u0004\u0000\u001e\u0007\u0001"+
		"\u0000\u0000\u0000\u001f$\u0003\n\u0005\u0000 !\u0005\n\u0000\u0000!#"+
		"\u0003\n\u0005\u0000\" \u0001\u0000\u0000\u0000#&\u0001\u0000\u0000\u0000"+
		"$\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%\t\u0001\u0000\u0000"+
		"\u0000&$\u0001\u0000\u0000\u0000\'(\u0005\u0007\u0000\u0000()\u0005\t"+
		"\u0000\u0000)*\u0005\b\u0000\u0000*+\u0003\f\u0006\u0000+\u000b\u0001"+
		"\u0000\u0000\u0000,-\u0007\u0000\u0000\u0000-\r\u0001\u0000\u0000\u0000"+
		"\u0002\u0015$";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}