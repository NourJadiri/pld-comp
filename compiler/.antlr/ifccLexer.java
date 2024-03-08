// Generated from /home/meljadiri/Documents/4A/PLD_COMP/pld-comp/compiler/ifcc.g4 by ANTLR 4.13.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		RETURN=10, CONST=11, VAR=12, COMMENT=13, DIRECTIVE=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"RETURN", "CONST", "VAR", "COMMENT", "DIRECTIVE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'main'", "'('", "')'", "'{'", "'}'", "','", "';'", "'='", 
			"'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "RETURN", 
			"CONST", "VAR", "COMMENT", "DIRECTIVE", "WS"
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
		"\u0004\u0000\u000ff\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0004\n?\b\n\u000b\n\f\n@\u0001"+
		"\u000b\u0001\u000b\u0005\u000bE\b\u000b\n\u000b\f\u000bH\t\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0005\fN\b\f\n\f\f\fQ\t\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0005\rZ\b\r\n\r\f\r]\t\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0002"+
		"O[\u0000\u000f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u0001\u0000\u0004\u0001\u000009\u0003\u0000"+
		"AZ__az\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  i\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0001\u001f\u0001\u0000\u0000\u0000\u0003#\u0001\u0000\u0000\u0000\u0005"+
		"(\u0001\u0000\u0000\u0000\u0007*\u0001\u0000\u0000\u0000\t,\u0001\u0000"+
		"\u0000\u0000\u000b.\u0001\u0000\u0000\u0000\r0\u0001\u0000\u0000\u0000"+
		"\u000f2\u0001\u0000\u0000\u0000\u00114\u0001\u0000\u0000\u0000\u00136"+
		"\u0001\u0000\u0000\u0000\u0015>\u0001\u0000\u0000\u0000\u0017B\u0001\u0000"+
		"\u0000\u0000\u0019I\u0001\u0000\u0000\u0000\u001bW\u0001\u0000\u0000\u0000"+
		"\u001db\u0001\u0000\u0000\u0000\u001f \u0005i\u0000\u0000 !\u0005n\u0000"+
		"\u0000!\"\u0005t\u0000\u0000\"\u0002\u0001\u0000\u0000\u0000#$\u0005m"+
		"\u0000\u0000$%\u0005a\u0000\u0000%&\u0005i\u0000\u0000&\'\u0005n\u0000"+
		"\u0000\'\u0004\u0001\u0000\u0000\u0000()\u0005(\u0000\u0000)\u0006\u0001"+
		"\u0000\u0000\u0000*+\u0005)\u0000\u0000+\b\u0001\u0000\u0000\u0000,-\u0005"+
		"{\u0000\u0000-\n\u0001\u0000\u0000\u0000./\u0005}\u0000\u0000/\f\u0001"+
		"\u0000\u0000\u000001\u0005,\u0000\u00001\u000e\u0001\u0000\u0000\u0000"+
		"23\u0005;\u0000\u00003\u0010\u0001\u0000\u0000\u000045\u0005=\u0000\u0000"+
		"5\u0012\u0001\u0000\u0000\u000067\u0005r\u0000\u000078\u0005e\u0000\u0000"+
		"89\u0005t\u0000\u00009:\u0005u\u0000\u0000:;\u0005r\u0000\u0000;<\u0005"+
		"n\u0000\u0000<\u0014\u0001\u0000\u0000\u0000=?\u0007\u0000\u0000\u0000"+
		">=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000"+
		"\u0000@A\u0001\u0000\u0000\u0000A\u0016\u0001\u0000\u0000\u0000BF\u0007"+
		"\u0001\u0000\u0000CE\u0007\u0002\u0000\u0000DC\u0001\u0000\u0000\u0000"+
		"EH\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000"+
		"\u0000G\u0018\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000IJ\u0005"+
		"/\u0000\u0000JK\u0005*\u0000\u0000KO\u0001\u0000\u0000\u0000LN\t\u0000"+
		"\u0000\u0000ML\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OP\u0001"+
		"\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000PR\u0001\u0000\u0000\u0000"+
		"QO\u0001\u0000\u0000\u0000RS\u0005*\u0000\u0000ST\u0005/\u0000\u0000T"+
		"U\u0001\u0000\u0000\u0000UV\u0006\f\u0000\u0000V\u001a\u0001\u0000\u0000"+
		"\u0000W[\u0005#\u0000\u0000XZ\t\u0000\u0000\u0000YX\u0001\u0000\u0000"+
		"\u0000Z]\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000[Y\u0001\u0000"+
		"\u0000\u0000\\^\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^_\u0005"+
		"\n\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0006\r\u0000\u0000a\u001c"+
		"\u0001\u0000\u0000\u0000bc\u0007\u0003\u0000\u0000cd\u0001\u0000\u0000"+
		"\u0000de\u0006\u000e\u0001\u0000e\u001e\u0001\u0000\u0000\u0000\u0005"+
		"\u0000@FO[\u0002\u0006\u0000\u0000\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}