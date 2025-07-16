// Generated from c:/UFSCar/Compiladores/T6/T6-Compiladores/t6/src/main/antlr4/br/ufscar/dc/compiladores/t6/Receitas.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ReceitasLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, RECEITA=4, REQUER=5, INGREDIENTES=6, RENDIMENTO=7, 
		TEMPO=8, UN=9, G=10, ML=11, NOME=12, NUMERO=13, DOIS_PONTOS=14, VIRGULA=15, 
		EQUAL=16, PASSO=17, WS=18, COMENTARIO=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "RECEITA", "REQUER", "INGREDIENTES", "RENDIMENTO", 
			"TEMPO", "UN", "G", "ML", "NOME", "NUMERO", "DOIS_PONTOS", "VIRGULA", 
			"EQUAL", "PASSO", "WS", "COMENTARIO"
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


	public ReceitasLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Receitas.g4"; }

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
		"\u0004\u0000\u0013\u00a2\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0004\u000by\b\u000b\u000b\u000b\f\u000b"+
		"z\u0001\f\u0004\f~\b\f\u000b\f\f\f\u007f\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0004\u0010\u008a"+
		"\b\u0010\u000b\u0010\f\u0010\u008b\u0001\u0011\u0004\u0011\u008f\b\u0011"+
		"\u000b\u0011\f\u0011\u0090\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u0097\b\u0012\n\u0012\f\u0012\u009a\t\u0012\u0001\u0012\u0003"+
		"\u0012\u009d\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0000"+
		"\u0000\u0013\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\u0001\u0000\u0004"+
		"\u0002\u0000__az\u0001\u000009\u0002\u0000\n\n\r\r\u0003\u0000\t\n\r\r"+
		"  \u00a7\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000\u0000\u0003/\u0001\u0000"+
		"\u0000\u0000\u00053\u0001\u0000\u0000\u0000\u0007B\u0001\u0000\u0000\u0000"+
		"\tJ\u0001\u0000\u0000\u0000\u000bQ\u0001\u0000\u0000\u0000\r^\u0001\u0000"+
		"\u0000\u0000\u000fi\u0001\u0000\u0000\u0000\u0011o\u0001\u0000\u0000\u0000"+
		"\u0013r\u0001\u0000\u0000\u0000\u0015t\u0001\u0000\u0000\u0000\u0017x"+
		"\u0001\u0000\u0000\u0000\u0019}\u0001\u0000\u0000\u0000\u001b\u0081\u0001"+
		"\u0000\u0000\u0000\u001d\u0083\u0001\u0000\u0000\u0000\u001f\u0085\u0001"+
		"\u0000\u0000\u0000!\u0087\u0001\u0000\u0000\u0000#\u008e\u0001\u0000\u0000"+
		"\u0000%\u0094\u0001\u0000\u0000\u0000\'(\u0005p\u0000\u0000()\u0005o\u0000"+
		"\u0000)*\u0005r\u0000\u0000*+\u0005c\u0000\u0000+,\u0005o\u0000\u0000"+
		",-\u0005e\u0000\u0000-.\u0005s\u0000\u0000.\u0002\u0001\u0000\u0000\u0000"+
		"/0\u0005m\u0000\u000001\u0005i\u0000\u000012\u0005n\u0000\u00002\u0004"+
		"\u0001\u0000\u0000\u000034\u0005s\u0000\u000045\u0005u\u0000\u000056\u0005"+
		"b\u0000\u000067\u0005s\u0000\u000078\u0005t\u0000\u000089\u0005i\u0000"+
		"\u00009:\u0005t\u0000\u0000:;\u0005u\u0000\u0000;<\u0005i\u0000\u0000"+
		"<=\u0005c\u0000\u0000=>\u0005o\u0000\u0000>?\u0005e\u0000\u0000?@\u0005"+
		"s\u0000\u0000@A\u0005:\u0000\u0000A\u0006\u0001\u0000\u0000\u0000BC\u0005"+
		"r\u0000\u0000CD\u0005e\u0000\u0000DE\u0005c\u0000\u0000EF\u0005e\u0000"+
		"\u0000FG\u0005i\u0000\u0000GH\u0005t\u0000\u0000HI\u0005a\u0000\u0000"+
		"I\b\u0001\u0000\u0000\u0000JK\u0005r\u0000\u0000KL\u0005e\u0000\u0000"+
		"LM\u0005q\u0000\u0000MN\u0005u\u0000\u0000NO\u0005e\u0000\u0000OP\u0005"+
		"r\u0000\u0000P\n\u0001\u0000\u0000\u0000QR\u0005i\u0000\u0000RS\u0005"+
		"n\u0000\u0000ST\u0005g\u0000\u0000TU\u0005r\u0000\u0000UV\u0005e\u0000"+
		"\u0000VW\u0005d\u0000\u0000WX\u0005i\u0000\u0000XY\u0005e\u0000\u0000"+
		"YZ\u0005n\u0000\u0000Z[\u0005t\u0000\u0000[\\\u0005e\u0000\u0000\\]\u0005"+
		"s\u0000\u0000]\f\u0001\u0000\u0000\u0000^_\u0005r\u0000\u0000_`\u0005"+
		"e\u0000\u0000`a\u0005n\u0000\u0000ab\u0005d\u0000\u0000bc\u0005i\u0000"+
		"\u0000cd\u0005m\u0000\u0000de\u0005e\u0000\u0000ef\u0005n\u0000\u0000"+
		"fg\u0005t\u0000\u0000gh\u0005o\u0000\u0000h\u000e\u0001\u0000\u0000\u0000"+
		"ij\u0005t\u0000\u0000jk\u0005e\u0000\u0000kl\u0005m\u0000\u0000lm\u0005"+
		"p\u0000\u0000mn\u0005o\u0000\u0000n\u0010\u0001\u0000\u0000\u0000op\u0005"+
		"u\u0000\u0000pq\u0005n\u0000\u0000q\u0012\u0001\u0000\u0000\u0000rs\u0005"+
		"g\u0000\u0000s\u0014\u0001\u0000\u0000\u0000tu\u0005m\u0000\u0000uv\u0005"+
		"l\u0000\u0000v\u0016\u0001\u0000\u0000\u0000wy\u0007\u0000\u0000\u0000"+
		"xw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000"+
		"\u0000z{\u0001\u0000\u0000\u0000{\u0018\u0001\u0000\u0000\u0000|~\u0007"+
		"\u0001\u0000\u0000}|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000"+
		"\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000"+
		"\u0080\u001a\u0001\u0000\u0000\u0000\u0081\u0082\u0005:\u0000\u0000\u0082"+
		"\u001c\u0001\u0000\u0000\u0000\u0083\u0084\u0005,\u0000\u0000\u0084\u001e"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0005=\u0000\u0000\u0086 \u0001\u0000"+
		"\u0000\u0000\u0087\u0089\u0005-\u0000\u0000\u0088\u008a\b\u0002\u0000"+
		"\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000"+
		"\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000"+
		"\u0000\u008c\"\u0001\u0000\u0000\u0000\u008d\u008f\u0007\u0003\u0000\u0000"+
		"\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000"+
		"\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000"+
		"\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0006\u0011\u0000\u0000"+
		"\u0093$\u0001\u0000\u0000\u0000\u0094\u0098\u0005$\u0000\u0000\u0095\u0097"+
		"\b\u0002\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u009a\u0001"+
		"\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001"+
		"\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098\u0001"+
		"\u0000\u0000\u0000\u009b\u009d\u0005\r\u0000\u0000\u009c\u009b\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0005\n\u0000\u0000\u009f\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0006\u0012\u0000\u0000\u00a1&\u0001\u0000\u0000\u0000"+
		"\u0007\u0000z\u007f\u008b\u0090\u0098\u009c\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}