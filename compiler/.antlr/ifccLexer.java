// Generated from /home/meljadiri/Documents/4A/PLD_COMP/TP_perso/compiler/ifcc.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ifccLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, TYPE=8, INT=9, 
		CHAR=10, FLOAT=11, DOUBLE=12, RETURN=13, CONST=14, ID=15, COMMENT=16, 
		DIRECTIVE=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "TYPE", "INT", 
			"CHAR", "FLOAT", "DOUBLE", "RETURN", "CONST", "ID", "COMMENT", "DIRECTIVE", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'('", "')'", "'{'", "'}'", "';'", "'='", null, "'int'", 
			"'char'", "'float'", "'double'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "TYPE", "INT", "CHAR", 
			"FLOAT", "DOUBLE", "RETURN", "CONST", "ID", "COMMENT", "DIRECTIVE", "WS"
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


	public ifccLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ifcc.g4"; }

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
		"\u0004\u0000\u0012\u0082\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007;\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0004\r[\b\r\u000b\r\f\r\\"+
		"\u0001\u000e\u0001\u000e\u0005\u000ea\b\u000e\n\u000e\f\u000ed\t\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000fj\b\u000f"+
		"\n\u000f\f\u000fm\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0005\u0010v\b\u0010\n\u0010\f\u0010"+
		"y\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0002kw\u0000\u0012\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012\u0001\u0000\u0004\u0001\u000009\u0003\u0000AZ__az\u0004"+
		"\u000009AZ__az\u0003\u0000\t\n\r\r  \u0088\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0001%\u0001\u0000\u0000\u0000\u0003*\u0001\u0000\u0000"+
		"\u0000\u0005,\u0001\u0000\u0000\u0000\u0007.\u0001\u0000\u0000\u0000\t"+
		"0\u0001\u0000\u0000\u0000\u000b2\u0001\u0000\u0000\u0000\r4\u0001\u0000"+
		"\u0000\u0000\u000f:\u0001\u0000\u0000\u0000\u0011<\u0001\u0000\u0000\u0000"+
		"\u0013@\u0001\u0000\u0000\u0000\u0015E\u0001\u0000\u0000\u0000\u0017K"+
		"\u0001\u0000\u0000\u0000\u0019R\u0001\u0000\u0000\u0000\u001bZ\u0001\u0000"+
		"\u0000\u0000\u001d^\u0001\u0000\u0000\u0000\u001fe\u0001\u0000\u0000\u0000"+
		"!s\u0001\u0000\u0000\u0000#~\u0001\u0000\u0000\u0000%&\u0005m\u0000\u0000"+
		"&\'\u0005a\u0000\u0000\'(\u0005i\u0000\u0000()\u0005n\u0000\u0000)\u0002"+
		"\u0001\u0000\u0000\u0000*+\u0005(\u0000\u0000+\u0004\u0001\u0000\u0000"+
		"\u0000,-\u0005)\u0000\u0000-\u0006\u0001\u0000\u0000\u0000./\u0005{\u0000"+
		"\u0000/\b\u0001\u0000\u0000\u000001\u0005}\u0000\u00001\n\u0001\u0000"+
		"\u0000\u000023\u0005;\u0000\u00003\f\u0001\u0000\u0000\u000045\u0005="+
		"\u0000\u00005\u000e\u0001\u0000\u0000\u00006;\u0003\u0011\b\u00007;\u0003"+
		"\u0013\t\u00008;\u0003\u0015\n\u00009;\u0003\u0017\u000b\u0000:6\u0001"+
		"\u0000\u0000\u0000:7\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000"+
		":9\u0001\u0000\u0000\u0000;\u0010\u0001\u0000\u0000\u0000<=\u0005i\u0000"+
		"\u0000=>\u0005n\u0000\u0000>?\u0005t\u0000\u0000?\u0012\u0001\u0000\u0000"+
		"\u0000@A\u0005c\u0000\u0000AB\u0005h\u0000\u0000BC\u0005a\u0000\u0000"+
		"CD\u0005r\u0000\u0000D\u0014\u0001\u0000\u0000\u0000EF\u0005f\u0000\u0000"+
		"FG\u0005l\u0000\u0000GH\u0005o\u0000\u0000HI\u0005a\u0000\u0000IJ\u0005"+
		"t\u0000\u0000J\u0016\u0001\u0000\u0000\u0000KL\u0005d\u0000\u0000LM\u0005"+
		"o\u0000\u0000MN\u0005u\u0000\u0000NO\u0005b\u0000\u0000OP\u0005l\u0000"+
		"\u0000PQ\u0005e\u0000\u0000Q\u0018\u0001\u0000\u0000\u0000RS\u0005r\u0000"+
		"\u0000ST\u0005e\u0000\u0000TU\u0005t\u0000\u0000UV\u0005u\u0000\u0000"+
		"VW\u0005r\u0000\u0000WX\u0005n\u0000\u0000X\u001a\u0001\u0000\u0000\u0000"+
		"Y[\u0007\u0000\u0000\u0000ZY\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000"+
		"\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]\u001c\u0001"+
		"\u0000\u0000\u0000^b\u0007\u0001\u0000\u0000_a\u0007\u0002\u0000\u0000"+
		"`_\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000"+
		"\u0000bc\u0001\u0000\u0000\u0000c\u001e\u0001\u0000\u0000\u0000db\u0001"+
		"\u0000\u0000\u0000ef\u0005/\u0000\u0000fg\u0005*\u0000\u0000gk\u0001\u0000"+
		"\u0000\u0000hj\t\u0000\u0000\u0000ih\u0001\u0000\u0000\u0000jm\u0001\u0000"+
		"\u0000\u0000kl\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000ln\u0001"+
		"\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000no\u0005*\u0000\u0000op\u0005"+
		"/\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0006\u000f\u0000\u0000r \u0001"+
		"\u0000\u0000\u0000sw\u0005#\u0000\u0000tv\t\u0000\u0000\u0000ut\u0001"+
		"\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"wu\u0001\u0000\u0000\u0000xz\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000"+
		"\u0000z{\u0005\n\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0006\u0010\u0000"+
		"\u0000}\"\u0001\u0000\u0000\u0000~\u007f\u0007\u0003\u0000\u0000\u007f"+
		"\u0080\u0001\u0000\u0000\u0000\u0080\u0081\u0006\u0011\u0001\u0000\u0081"+
		"$\u0001\u0000\u0000\u0000\u0006\u0000:\\bkw\u0002\u0006\u0000\u0000\u0000"+
		"\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}