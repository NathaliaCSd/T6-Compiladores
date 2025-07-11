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
		RECEITA=1, REQUER=2, INGREDIENTES=3, UN=4, G=5, ML=6, ID=7, NUMERO=8, 
		DOIS_PONTOS=9, VIRGULA=10, WS=11, COMENTARIO=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"RECEITA", "REQUER", "INGREDIENTES", "UN", "G", "ML", "ID", "NUMERO", 
			"DOIS_PONTOS", "VIRGULA", "WS", "COMENTARIO"
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
		"\u0004\u0000\f`\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0004\u0006?\b\u0006\u000b\u0006\f\u0006@\u0001"+
		"\u0007\u0004\u0007D\b\u0007\u000b\u0007\f\u0007E\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0004\nM\b\n\u000b\n\f\nN\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0005\u000bU\b\u000b\n\u000b\f\u000bX\t\u000b\u0001\u000b"+
		"\u0003\u000b[\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0000\u0000\f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0001"+
		"\u0000\u0004\u0002\u0000__az\u0001\u000009\u0003\u0000\t\n\r\r  \u0002"+
		"\u0000\n\n\r\rd\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0001\u0019\u0001\u0000\u0000\u0000\u0003!\u0001\u0000\u0000\u0000"+
		"\u0005(\u0001\u0000\u0000\u0000\u00075\u0001\u0000\u0000\u0000\t8\u0001"+
		"\u0000\u0000\u0000\u000b:\u0001\u0000\u0000\u0000\r>\u0001\u0000\u0000"+
		"\u0000\u000fC\u0001\u0000\u0000\u0000\u0011G\u0001\u0000\u0000\u0000\u0013"+
		"I\u0001\u0000\u0000\u0000\u0015L\u0001\u0000\u0000\u0000\u0017R\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0005r\u0000\u0000\u001a\u001b\u0005e\u0000"+
		"\u0000\u001b\u001c\u0005c\u0000\u0000\u001c\u001d\u0005e\u0000\u0000\u001d"+
		"\u001e\u0005i\u0000\u0000\u001e\u001f\u0005t\u0000\u0000\u001f \u0005"+
		"a\u0000\u0000 \u0002\u0001\u0000\u0000\u0000!\"\u0005r\u0000\u0000\"#"+
		"\u0005e\u0000\u0000#$\u0005q\u0000\u0000$%\u0005u\u0000\u0000%&\u0005"+
		"e\u0000\u0000&\'\u0005r\u0000\u0000\'\u0004\u0001\u0000\u0000\u0000()"+
		"\u0005i\u0000\u0000)*\u0005n\u0000\u0000*+\u0005g\u0000\u0000+,\u0005"+
		"r\u0000\u0000,-\u0005e\u0000\u0000-.\u0005d\u0000\u0000./\u0005i\u0000"+
		"\u0000/0\u0005e\u0000\u000001\u0005n\u0000\u000012\u0005t\u0000\u0000"+
		"23\u0005e\u0000\u000034\u0005s\u0000\u00004\u0006\u0001\u0000\u0000\u0000"+
		"56\u0005u\u0000\u000067\u0005n\u0000\u00007\b\u0001\u0000\u0000\u0000"+
		"89\u0005g\u0000\u00009\n\u0001\u0000\u0000\u0000:;\u0005m\u0000\u0000"+
		";<\u0005l\u0000\u0000<\f\u0001\u0000\u0000\u0000=?\u0007\u0000\u0000\u0000"+
		">=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000"+
		"\u0000@A\u0001\u0000\u0000\u0000A\u000e\u0001\u0000\u0000\u0000BD\u0007"+
		"\u0001\u0000\u0000CB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000"+
		"EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000F\u0010\u0001\u0000"+
		"\u0000\u0000GH\u0005:\u0000\u0000H\u0012\u0001\u0000\u0000\u0000IJ\u0005"+
		",\u0000\u0000J\u0014\u0001\u0000\u0000\u0000KM\u0007\u0002\u0000\u0000"+
		"LK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000"+
		"\u0000NO\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0006\n\u0000"+
		"\u0000Q\u0016\u0001\u0000\u0000\u0000RV\u0005$\u0000\u0000SU\b\u0003\u0000"+
		"\u0000TS\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000"+
		"\u0000\u0000VW\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001"+
		"\u0000\u0000\u0000Y[\u0005\r\u0000\u0000ZY\u0001\u0000\u0000\u0000Z[\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0005\n\u0000\u0000]"+
		"^\u0001\u0000\u0000\u0000^_\u0006\u000b\u0000\u0000_\u0018\u0001\u0000"+
		"\u0000\u0000\u0006\u0000@ENVZ\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}