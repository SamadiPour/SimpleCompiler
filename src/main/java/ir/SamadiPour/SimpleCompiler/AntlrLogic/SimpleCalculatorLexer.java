package ir.SamadiPour.SimpleCompiler.AntlrLogic;
// Generated from SimpleCalculator.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleCalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, DIGITS=29, ALPHABET=30, ALPHABETS=31, 
		WS=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "DIGITS", "ALPHABET", "ALPHABETS", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'while'", "'for'", "'print'", "'!'", "'{'", 
			"'}'", "'('", "')'", "';'", "'='", "':'", "'+'", "'-'", "'/'", "'*'", 
			"'^'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'.'", "'_'", "'true'", 
			"'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "DIGITS", "ALPHABET", "ALPHABETS", "WS"
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


	public SimpleCalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleCalculator.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u00a4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\6\36\u0096\n\36\r\36\16\36\u0097\3\37\3"+
		"\37\3 \6 \u009d\n \r \16 \u009e\3!\3!\3!\3!\2\2\"\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"\3\2\5\3\2\62;"+
		"\4\2C\\c|\5\2\13\f\17\17\"\"\2\u00a5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\3C\3\2\2\2\5F\3\2\2\2\7K\3\2\2\2\tQ\3\2\2\2\13U\3\2\2\2\r[\3\2\2"+
		"\2\17]\3\2\2\2\21_\3\2\2\2\23a\3\2\2\2\25c\3\2\2\2\27e\3\2\2\2\31g\3\2"+
		"\2\2\33i\3\2\2\2\35k\3\2\2\2\37m\3\2\2\2!o\3\2\2\2#q\3\2\2\2%s\3\2\2\2"+
		"\'u\3\2\2\2)w\3\2\2\2+y\3\2\2\2-|\3\2\2\2/\177\3\2\2\2\61\u0082\3\2\2"+
		"\2\63\u0085\3\2\2\2\65\u0087\3\2\2\2\67\u0089\3\2\2\29\u008e\3\2\2\2;"+
		"\u0095\3\2\2\2=\u0099\3\2\2\2?\u009c\3\2\2\2A\u00a0\3\2\2\2CD\7k\2\2D"+
		"E\7h\2\2E\4\3\2\2\2FG\7g\2\2GH\7n\2\2HI\7u\2\2IJ\7g\2\2J\6\3\2\2\2KL\7"+
		"y\2\2LM\7j\2\2MN\7k\2\2NO\7n\2\2OP\7g\2\2P\b\3\2\2\2QR\7h\2\2RS\7q\2\2"+
		"ST\7t\2\2T\n\3\2\2\2UV\7r\2\2VW\7t\2\2WX\7k\2\2XY\7p\2\2YZ\7v\2\2Z\f\3"+
		"\2\2\2[\\\7#\2\2\\\16\3\2\2\2]^\7}\2\2^\20\3\2\2\2_`\7\177\2\2`\22\3\2"+
		"\2\2ab\7*\2\2b\24\3\2\2\2cd\7+\2\2d\26\3\2\2\2ef\7=\2\2f\30\3\2\2\2gh"+
		"\7?\2\2h\32\3\2\2\2ij\7<\2\2j\34\3\2\2\2kl\7-\2\2l\36\3\2\2\2mn\7/\2\2"+
		"n \3\2\2\2op\7\61\2\2p\"\3\2\2\2qr\7,\2\2r$\3\2\2\2st\7`\2\2t&\3\2\2\2"+
		"uv\7>\2\2v(\3\2\2\2wx\7@\2\2x*\3\2\2\2yz\7>\2\2z{\7?\2\2{,\3\2\2\2|}\7"+
		"@\2\2}~\7?\2\2~.\3\2\2\2\177\u0080\7?\2\2\u0080\u0081\7?\2\2\u0081\60"+
		"\3\2\2\2\u0082\u0083\7#\2\2\u0083\u0084\7?\2\2\u0084\62\3\2\2\2\u0085"+
		"\u0086\7\60\2\2\u0086\64\3\2\2\2\u0087\u0088\7a\2\2\u0088\66\3\2\2\2\u0089"+
		"\u008a\7v\2\2\u008a\u008b\7t\2\2\u008b\u008c\7w\2\2\u008c\u008d\7g\2\2"+
		"\u008d8\3\2\2\2\u008e\u008f\7h\2\2\u008f\u0090\7c\2\2\u0090\u0091\7n\2"+
		"\2\u0091\u0092\7u\2\2\u0092\u0093\7g\2\2\u0093:\3\2\2\2\u0094\u0096\t"+
		"\2\2\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098<\3\2\2\2\u0099\u009a\t\3\2\2\u009a>\3\2\2\2\u009b"+
		"\u009d\t\3\2\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009e\u009f\3\2\2\2\u009f@\3\2\2\2\u00a0\u00a1\t\4\2\2\u00a1\u00a2"+
		"\3\2\2\2\u00a2\u00a3\b!\2\2\u00a3B\3\2\2\2\5\2\u0097\u009e\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}