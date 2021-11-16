// Generated from D:/Study/CUHK/Year 2 Term 1/CSCI 2100/HAPL/src/com/fsapps/HAPL\HAPL.g4 by ANTLR 4.9.2
package com.fsapps.HAPL;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HAPLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, MAIN_TAG_START=9, 
		MAIN_TAG_END=10, OUT=11, INPUT=12, Null=13, Return=14, Assert=15, Size=16, 
		In=17, Or=18, And=19, Equals=20, NEquals=21, GTEquals=22, LTEquals=23, 
		Pow=24, Excl=25, GT=26, LT=27, Add=28, Subtract=29, Multiply=30, Divide=31, 
		Modulus=32, OBrace=33, CBrace=34, OBracket=35, CBracket=36, OParen=37, 
		CParen=38, SColon=39, Assign=40, Comma=41, QMark=42, Colon=43, Bool=44, 
		Number=45, Identifier=46, String=47, Comment=48, Space=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "MAIN_TAG_START", 
			"MAIN_TAG_END", "OUT", "INPUT", "Null", "Return", "Assert", "Size", "In", 
			"Or", "And", "Equals", "NEquals", "GTEquals", "LTEquals", "Pow", "Excl", 
			"GT", "LT", "Add", "Subtract", "Multiply", "Divide", "Modulus", "OBrace", 
			"CBrace", "OBracket", "CBracket", "OParen", "CParen", "SColon", "Assign", 
			"Comma", "QMark", "Colon", "Bool", "Number", "Identifier", "String", 
			"Comment", "Space", "Int", "Digit"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'repeat'", "'while'", "'<if'", "'</if>'", "'<elif'", "'</elif>'", 
			"'<else>'", "'</else>'", null, null, "'out'", "'inp'", "'null'", "'return'", 
			"'assert'", "'size'", "'in'", "'||'", "'&&'", "'=='", "'!='", "'>='", 
			"'<='", "'^'", "'!'", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'{'", "'}'", "'['", "']'", "'('", "')'", "';'", "'='", "','", "'?'", 
			"':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "MAIN_TAG_START", 
			"MAIN_TAG_END", "OUT", "INPUT", "Null", "Return", "Assert", "Size", "In", 
			"Or", "And", "Equals", "NEquals", "GTEquals", "LTEquals", "Pow", "Excl", 
			"GT", "LT", "Add", "Subtract", "Multiply", "Divide", "Modulus", "OBrace", 
			"CBrace", "OBracket", "CBracket", "OParen", "CParen", "SColon", "Assign", 
			"Comma", "QMark", "Colon", "Bool", "Number", "Identifier", "String", 
			"Comment", "Space"
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


	public HAPLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HAPL.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u0165\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3"+
		"!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3"+
		",\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0115\n-\3.\3.\3.\7.\u011a\n.\f.\16.\u011d"+
		"\13.\5.\u011f\n.\3/\3/\7/\u0123\n/\f/\16/\u0126\13/\3\60\3\60\3\60\3\60"+
		"\7\60\u012c\n\60\f\60\16\60\u012f\13\60\3\60\3\60\3\60\3\60\3\60\7\60"+
		"\u0136\n\60\f\60\16\60\u0139\13\60\3\60\5\60\u013c\n\60\3\61\3\61\3\61"+
		"\3\61\7\61\u0142\n\61\f\61\16\61\u0145\13\61\3\61\3\61\3\61\3\61\7\61"+
		"\u014b\n\61\f\61\16\61\u014e\13\61\3\61\3\61\5\61\u0152\n\61\3\61\3\61"+
		"\3\62\3\62\3\62\3\62\3\63\3\63\7\63\u015c\n\63\f\63\16\63\u015f\13\63"+
		"\3\63\5\63\u0162\n\63\3\64\3\64\3\u014c\2\65\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+U,W-Y.[/]\60_\61a\62c\63e\2g\2\3\2\f\5\2C\\aac|\6\2\62;C\\aac|\3\2$$"+
		"\6\2\f\f\17\17$$^^\4\2\f\f\17\17\3\2))\6\2\f\f\17\17))^^\5\2\13\f\16\17"+
		"\"\"\3\2\63;\3\2\62;\2\u0170\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3i\3\2\2\2\5p\3\2\2\2\7v"+
		"\3\2\2\2\tz\3\2\2\2\13\u0080\3\2\2\2\r\u0086\3\2\2\2\17\u008e\3\2\2\2"+
		"\21\u0095\3\2\2\2\23\u009d\3\2\2\2\25\u00a5\3\2\2\2\27\u00ae\3\2\2\2\31"+
		"\u00b2\3\2\2\2\33\u00b6\3\2\2\2\35\u00bb\3\2\2\2\37\u00c2\3\2\2\2!\u00c9"+
		"\3\2\2\2#\u00ce\3\2\2\2%\u00d1\3\2\2\2\'\u00d4\3\2\2\2)\u00d7\3\2\2\2"+
		"+\u00da\3\2\2\2-\u00dd\3\2\2\2/\u00e0\3\2\2\2\61\u00e3\3\2\2\2\63\u00e5"+
		"\3\2\2\2\65\u00e7\3\2\2\2\67\u00e9\3\2\2\29\u00eb\3\2\2\2;\u00ed\3\2\2"+
		"\2=\u00ef\3\2\2\2?\u00f1\3\2\2\2A\u00f3\3\2\2\2C\u00f5\3\2\2\2E\u00f7"+
		"\3\2\2\2G\u00f9\3\2\2\2I\u00fb\3\2\2\2K\u00fd\3\2\2\2M\u00ff\3\2\2\2O"+
		"\u0101\3\2\2\2Q\u0103\3\2\2\2S\u0105\3\2\2\2U\u0107\3\2\2\2W\u0109\3\2"+
		"\2\2Y\u0114\3\2\2\2[\u0116\3\2\2\2]\u0120\3\2\2\2_\u013b\3\2\2\2a\u0151"+
		"\3\2\2\2c\u0155\3\2\2\2e\u0161\3\2\2\2g\u0163\3\2\2\2ij\7t\2\2jk\7g\2"+
		"\2kl\7r\2\2lm\7g\2\2mn\7c\2\2no\7v\2\2o\4\3\2\2\2pq\7y\2\2qr\7j\2\2rs"+
		"\7k\2\2st\7n\2\2tu\7g\2\2u\6\3\2\2\2vw\7>\2\2wx\7k\2\2xy\7h\2\2y\b\3\2"+
		"\2\2z{\7>\2\2{|\7\61\2\2|}\7k\2\2}~\7h\2\2~\177\7@\2\2\177\n\3\2\2\2\u0080"+
		"\u0081\7>\2\2\u0081\u0082\7g\2\2\u0082\u0083\7n\2\2\u0083\u0084\7k\2\2"+
		"\u0084\u0085\7h\2\2\u0085\f\3\2\2\2\u0086\u0087\7>\2\2\u0087\u0088\7\61"+
		"\2\2\u0088\u0089\7g\2\2\u0089\u008a\7n\2\2\u008a\u008b\7k\2\2\u008b\u008c"+
		"\7h\2\2\u008c\u008d\7@\2\2\u008d\16\3\2\2\2\u008e\u008f\7>\2\2\u008f\u0090"+
		"\7g\2\2\u0090\u0091\7n\2\2\u0091\u0092\7u\2\2\u0092\u0093\7g\2\2\u0093"+
		"\u0094\7@\2\2\u0094\20\3\2\2\2\u0095\u0096\7>\2\2\u0096\u0097\7\61\2\2"+
		"\u0097\u0098\7g\2\2\u0098\u0099\7n\2\2\u0099\u009a\7u\2\2\u009a\u009b"+
		"\7g\2\2\u009b\u009c\7@\2\2\u009c\22\3\2\2\2\u009d\u009e\7>\2\2\u009e\u009f"+
		"\7j\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7r\2\2\u00a1\u00a2\7n\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a4\7@\2\2\u00a4\24\3\2\2\2\u00a5\u00a6\7>\2\2"+
		"\u00a6\u00a7\7\61\2\2\u00a7\u00a8\7j\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa"+
		"\7r\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\7@\2\2\u00ad"+
		"\26\3\2\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7w\2\2\u00b0\u00b1\7v\2\2\u00b1"+
		"\30\3\2\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7p\2\2\u00b4\u00b5\7r\2\2\u00b5"+
		"\32\3\2\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b8\7w\2\2\u00b8\u00b9\7n\2\2\u00b9"+
		"\u00ba\7n\2\2\u00ba\34\3\2\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7g\2\2\u00bd"+
		"\u00be\7v\2\2\u00be\u00bf\7w\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7p\2\2"+
		"\u00c1\36\3\2\2\2\u00c2\u00c3\7c\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5\7"+
		"u\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7v\2\2\u00c8 "+
		"\3\2\2\2\u00c9\u00ca\7u\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7|\2\2\u00cc"+
		"\u00cd\7g\2\2\u00cd\"\3\2\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0\7p\2\2\u00d0"+
		"$\3\2\2\2\u00d1\u00d2\7~\2\2\u00d2\u00d3\7~\2\2\u00d3&\3\2\2\2\u00d4\u00d5"+
		"\7(\2\2\u00d5\u00d6\7(\2\2\u00d6(\3\2\2\2\u00d7\u00d8\7?\2\2\u00d8\u00d9"+
		"\7?\2\2\u00d9*\3\2\2\2\u00da\u00db\7#\2\2\u00db\u00dc\7?\2\2\u00dc,\3"+
		"\2\2\2\u00dd\u00de\7@\2\2\u00de\u00df\7?\2\2\u00df.\3\2\2\2\u00e0\u00e1"+
		"\7>\2\2\u00e1\u00e2\7?\2\2\u00e2\60\3\2\2\2\u00e3\u00e4\7`\2\2\u00e4\62"+
		"\3\2\2\2\u00e5\u00e6\7#\2\2\u00e6\64\3\2\2\2\u00e7\u00e8\7@\2\2\u00e8"+
		"\66\3\2\2\2\u00e9\u00ea\7>\2\2\u00ea8\3\2\2\2\u00eb\u00ec\7-\2\2\u00ec"+
		":\3\2\2\2\u00ed\u00ee\7/\2\2\u00ee<\3\2\2\2\u00ef\u00f0\7,\2\2\u00f0>"+
		"\3\2\2\2\u00f1\u00f2\7\61\2\2\u00f2@\3\2\2\2\u00f3\u00f4\7\'\2\2\u00f4"+
		"B\3\2\2\2\u00f5\u00f6\7}\2\2\u00f6D\3\2\2\2\u00f7\u00f8\7\177\2\2\u00f8"+
		"F\3\2\2\2\u00f9\u00fa\7]\2\2\u00faH\3\2\2\2\u00fb\u00fc\7_\2\2\u00fcJ"+
		"\3\2\2\2\u00fd\u00fe\7*\2\2\u00feL\3\2\2\2\u00ff\u0100\7+\2\2\u0100N\3"+
		"\2\2\2\u0101\u0102\7=\2\2\u0102P\3\2\2\2\u0103\u0104\7?\2\2\u0104R\3\2"+
		"\2\2\u0105\u0106\7.\2\2\u0106T\3\2\2\2\u0107\u0108\7A\2\2\u0108V\3\2\2"+
		"\2\u0109\u010a\7<\2\2\u010aX\3\2\2\2\u010b\u010c\7v\2\2\u010c\u010d\7"+
		"t\2\2\u010d\u010e\7w\2\2\u010e\u0115\7g\2\2\u010f\u0110\7h\2\2\u0110\u0111"+
		"\7c\2\2\u0111\u0112\7n\2\2\u0112\u0113\7u\2\2\u0113\u0115\7g\2\2\u0114"+
		"\u010b\3\2\2\2\u0114\u010f\3\2\2\2\u0115Z\3\2\2\2\u0116\u011e\5e\63\2"+
		"\u0117\u011b\7\60\2\2\u0118\u011a\5g\64\2\u0119\u0118\3\2\2\2\u011a\u011d"+
		"\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011f\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011e\u0117\3\2\2\2\u011e\u011f\3\2\2\2\u011f\\\3\2\2\2"+
		"\u0120\u0124\t\2\2\2\u0121\u0123\t\3\2\2\u0122\u0121\3\2\2\2\u0123\u0126"+
		"\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125^\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0127\u012d\t\4\2\2\u0128\u012c\n\5\2\2\u0129\u012a\7^"+
		"\2\2\u012a\u012c\n\6\2\2\u012b\u0128\3\2\2\2\u012b\u0129\3\2\2\2\u012c"+
		"\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2"+
		"\2\2\u012f\u012d\3\2\2\2\u0130\u013c\t\4\2\2\u0131\u0137\t\7\2\2\u0132"+
		"\u0136\n\b\2\2\u0133\u0134\7^\2\2\u0134\u0136\n\6\2\2\u0135\u0132\3\2"+
		"\2\2\u0135\u0133\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013c\t\7"+
		"\2\2\u013b\u0127\3\2\2\2\u013b\u0131\3\2\2\2\u013c`\3\2\2\2\u013d\u013e"+
		"\7\61\2\2\u013e\u013f\7\61\2\2\u013f\u0143\3\2\2\2\u0140\u0142\n\6\2\2"+
		"\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144"+
		"\3\2\2\2\u0144\u0152\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0147\7\61\2\2"+
		"\u0147\u0148\7,\2\2\u0148\u014c\3\2\2\2\u0149\u014b\13\2\2\2\u014a\u0149"+
		"\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014d\3\2\2\2\u014c\u014a\3\2\2\2\u014d"+
		"\u014f\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0150\7,\2\2\u0150\u0152\7\61"+
		"\2\2\u0151\u013d\3\2\2\2\u0151\u0146\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\u0154\b\61\2\2\u0154b\3\2\2\2\u0155\u0156\t\t\2\2\u0156\u0157\3\2\2\2"+
		"\u0157\u0158\b\62\2\2\u0158d\3\2\2\2\u0159\u015d\t\n\2\2\u015a\u015c\5"+
		"g\64\2\u015b\u015a\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u0162\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0162\7\62"+
		"\2\2\u0161\u0159\3\2\2\2\u0161\u0160\3\2\2\2\u0162f\3\2\2\2\u0163\u0164"+
		"\t\13\2\2\u0164h\3\2\2\2\21\2\u0114\u011b\u011e\u0124\u012b\u012d\u0135"+
		"\u0137\u013b\u0143\u014c\u0151\u015d\u0161\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}