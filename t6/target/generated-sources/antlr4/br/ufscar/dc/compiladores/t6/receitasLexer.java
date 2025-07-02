// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.t6;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class receitasLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		RECEITA=1, REQUER=2, INGREDIENTES=3, UN=4, G=5, ML=6, NOME=7, NUMERO=8, 
		DOIS_PONTOS=9, VIRGULA=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"RECEITA", "REQUER", "INGREDIENTES", "UN", "G", "ML", "NOME", "NUMERO", 
			"DOIS_PONTOS", "VIRGULA", "WS"
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
			null, "RECEITA", "REQUER", "INGREDIENTES", "UN", "G", "ML", "NOME", "NUMERO", 
			"DOIS_PONTOS", "VIRGULA", "WS"
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


	public receitasLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "receitas.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000bP\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0004\u0006=\b\u0006\u000b\u0006\f\u0006>\u0001\u0007\u0004\u0007B\b"+
		"\u0007\u000b\u0007\f\u0007C\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0004"+
		"\nK\b\n\u000b\n\f\nL\u0001\n\u0001\n\u0000\u0000\u000b\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0001\u0000\u0003\u0002\u0000__az\u0001\u00000"+
		"9\u0003\u0000\t\n\r\r  R\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0001\u0017\u0001\u0000"+
		"\u0000\u0000\u0003\u001f\u0001\u0000\u0000\u0000\u0005&\u0001\u0000\u0000"+
		"\u0000\u00073\u0001\u0000\u0000\u0000\t6\u0001\u0000\u0000\u0000\u000b"+
		"8\u0001\u0000\u0000\u0000\r<\u0001\u0000\u0000\u0000\u000fA\u0001\u0000"+
		"\u0000\u0000\u0011E\u0001\u0000\u0000\u0000\u0013G\u0001\u0000\u0000\u0000"+
		"\u0015J\u0001\u0000\u0000\u0000\u0017\u0018\u0005r\u0000\u0000\u0018\u0019"+
		"\u0005e\u0000\u0000\u0019\u001a\u0005c\u0000\u0000\u001a\u001b\u0005e"+
		"\u0000\u0000\u001b\u001c\u0005i\u0000\u0000\u001c\u001d\u0005t\u0000\u0000"+
		"\u001d\u001e\u0005a\u0000\u0000\u001e\u0002\u0001\u0000\u0000\u0000\u001f"+
		" \u0005r\u0000\u0000 !\u0005e\u0000\u0000!\"\u0005q\u0000\u0000\"#\u0005"+
		"u\u0000\u0000#$\u0005e\u0000\u0000$%\u0005r\u0000\u0000%\u0004\u0001\u0000"+
		"\u0000\u0000&\'\u0005i\u0000\u0000\'(\u0005n\u0000\u0000()\u0005g\u0000"+
		"\u0000)*\u0005r\u0000\u0000*+\u0005e\u0000\u0000+,\u0005d\u0000\u0000"+
		",-\u0005i\u0000\u0000-.\u0005e\u0000\u0000./\u0005n\u0000\u0000/0\u0005"+
		"t\u0000\u000001\u0005e\u0000\u000012\u0005s\u0000\u00002\u0006\u0001\u0000"+
		"\u0000\u000034\u0005u\u0000\u000045\u0005n\u0000\u00005\b\u0001\u0000"+
		"\u0000\u000067\u0005g\u0000\u00007\n\u0001\u0000\u0000\u000089\u0005m"+
		"\u0000\u00009:\u0005l\u0000\u0000:\f\u0001\u0000\u0000\u0000;=\u0007\u0000"+
		"\u0000\u0000<;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000><\u0001"+
		"\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?\u000e\u0001\u0000\u0000"+
		"\u0000@B\u0007\u0001\u0000\u0000A@\u0001\u0000\u0000\u0000BC\u0001\u0000"+
		"\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000D\u0010"+
		"\u0001\u0000\u0000\u0000EF\u0005:\u0000\u0000F\u0012\u0001\u0000\u0000"+
		"\u0000GH\u0005,\u0000\u0000H\u0014\u0001\u0000\u0000\u0000IK\u0007\u0002"+
		"\u0000\u0000JI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LJ\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000"+
		"NO\u0006\n\u0000\u0000O\u0016\u0001\u0000\u0000\u0000\u0004\u0000>CL\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}