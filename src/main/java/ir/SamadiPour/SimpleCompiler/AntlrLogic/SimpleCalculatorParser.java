package ir.SamadiPour.SimpleCompiler.AntlrLogic;
// Generated from SimpleCalculator.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleCalculatorParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_statements = 1, RULE_statement = 2, RULE_expr = 3, 
		RULE_complexExp = 4, RULE_div_multi = 5, RULE_pow = 6, RULE_fact = 7, 
		RULE_openBracket = 8, RULE_closeBracket = 9, RULE_opneParan = 10, RULE_closeParan = 11, 
		RULE_semicolon = 12, RULE_equal = 13, RULE_colon = 14, RULE_plus_minusOP = 15, 
		RULE_div_multiOP = 16, RULE_power = 17, RULE_binop = 18, RULE_number = 19, 
		RULE_identifier = 20, RULE_boolea = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statements", "statement", "expr", "complexExp", "div_multi", 
			"pow", "fact", "openBracket", "closeBracket", "opneParan", "closeParan", 
			"semicolon", "equal", "colon", "plus_minusOP", "div_multiOP", "power", 
			"binop", "number", "identifier", "boolea"
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

	@Override
	public String getGrammarFileName() { return "SimpleCalculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleCalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCalculatorVisitor ) return ((SimpleCalculatorVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			statements();
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

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCalculatorVisitor ) return ((SimpleCalculatorVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				statement();
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << ALPHABET))) != 0) );
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintContext extends StatementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
		public PrintContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCalculatorVisitor ) return ((SimpleCalculatorVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BeginendContext extends StatementContext {
		public OpenBracketContext openBracket() {
			return getRuleContext(OpenBracketContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public CloseBracketContext closeBracket() {
			return getRuleContext(CloseBracketContext.class,0);
		}
		public BeginendContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterBeginend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitBeginend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCalculatorVisitor ) return ((SimpleCalculatorVisitor<? extends T>)visitor).visitBeginend(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentContext extends StatementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
		public AssignmentContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCalculatorVisitor ) return ((SimpleCalculatorVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForContext extends StatementContext {
		public OpneParanContext opneParan() {
			return getRuleContext(OpneParanContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public ColonContext colon() {
			return getRuleContext(ColonContext.class,0);
		}
		public CloseParanContext closeParan() {
			return getRuleContext(CloseParanContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCalculatorVisitor ) return ((SimpleCalculatorVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends StatementContext {
		public OpneParanContext opneParan() {
			return getRuleContext(OpneParanContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CloseParanContext closeParan() {
			return getRuleContext(CloseParanContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCalculatorVisitor ) return ((SimpleCalculatorVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends StatementContext {
		public OpneParanContext opneParan() {
			return getRuleContext(OpneParanContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CloseParanContext closeParan() {
			return getRuleContext(CloseParanContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCalculatorVisitor ) return ((SimpleCalculatorVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfelseContext extends StatementContext {
		public OpneParanContext opneParan() {
			return getRuleContext(OpneParanContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CloseParanContext closeParan() {
			return getRuleContext(CloseParanContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfelseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterIfelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitIfelse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCalculatorVisitor ) return ((SimpleCalculatorVisitor<? extends T>)visitor).visitIfelse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				identifier();
				setState(52);
				equal();
				setState(53);
				expr(0);
				setState(54);
				semicolon();
				}
				break;
			case 2:
				_localctx = new BeginendContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				openBracket();
				setState(57);
				statements();
				setState(58);
				closeBracket();
				}
				break;
			case 3:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				match(T__0);
				setState(61);
				opneParan();
				setState(62);
				expr(0);
				setState(63);
				closeParan();
				setState(64);
				statement();
				}
				break;
			case 4:
				_localctx = new IfelseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				match(T__0);
				setState(67);
				opneParan();
				setState(68);
				expr(0);
				setState(69);
				closeParan();
				setState(70);
				statement();
				setState(71);
				match(T__1);
				setState(72);
				statement();
				}
				break;
			case 5:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(74);
				match(T__2);
				setState(75);
				opneParan();
				setState(76);
				expr(0);
				setState(77);
				closeParan();
				setState(78);
				statement();
				}
				break;
			case 6:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(80);
				match(T__3);
				setState(81);
				opneParan();
				setState(82);
				identifier();
				setState(83);
				equal();
				setState(84);
				number();
				setState(85);
				colon();
				setState(86);
				number();
				setState(87);
				closeParan();
				setState(88);
				statement();
				}
				break;
			case 7:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(90);
				match(T__4);
				setState(91);
				identifier();
				setState(92);
				semicolon();
				}
				break;
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCalculatorVisitor ) return ((SimpleCalculatorVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComplexExprContext extends ExprContext {
		public ComplexExpContext complexExp() {
			return getRuleContext(ComplexExpContext.class,0);
		}
		public ComplexExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterComplexExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitComplexExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCalculatorVisitor ) return ((SimpleCalculatorVisitor<? extends T>)visitor).visitComplexExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolContext extends ExprContext {
		public BooleaContext boolea() {
			return getRuleContext(BooleaContext.class,0);
		}
		public BoolContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCalculatorVisitor ) return ((SimpleCalculatorVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumContext extends ExprContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCalculatorVisitor ) return ((SimpleCalculatorVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCalculatorVisitor ) return ((SimpleCalculatorVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParanthesisContext extends ExprContext {
		public OpneParanContext opneParan() {
			return getRuleContext(OpneParanContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CloseParanContext closeParan() {
			return getRuleContext(CloseParanContext.class,0);
		}
		public ParanthesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterParanthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitParanthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCalculatorVisitor ) return ((SimpleCalculatorVisitor<? extends T>)visitor).visitParanthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinoprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public BinoprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterBinopr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitBinopr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCalculatorVisitor ) return ((SimpleCalculatorVisitor<? extends T>)visitor).visitBinopr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(97);
				match(T__5);
				setState(98);
				expr(6);
				}
				break;
			case 2:
				{
				_localctx = new ParanthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				opneParan();
				setState(100);
				expr(0);
				setState(101);
				closeParan();
				}
				break;
			case 3:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103);
				identifier();
				}
				break;
			case 4:
				{
				_localctx = new NumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				number();
				}
				break;
			case 5:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				boolea();
				}
				break;
			case 6:
				{
				_localctx = new ComplexExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				complexExp();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BinoprContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(109);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(110);
					binop();
					setState(111);
					expr(8);
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ComplexExpContext extends ParserRuleContext {
		public List<Div_multiContext> div_multi() {
			return getRuleContexts(Div_multiContext.class);
		}
		public Div_multiContext div_multi(int i) {
			return getRuleContext(Div_multiContext.class,i);
		}
		public List<Plus_minusOPContext> plus_minusOP() {
			return getRuleContexts(Plus_minusOPContext.class);
		}
		public Plus_minusOPContext plus_minusOP(int i) {
			return getRuleContext(Plus_minusOPContext.class,i);
		}
		public ComplexExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterComplexExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitComplexExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCalculatorVisitor ) return ((SimpleCalculatorVisitor<? extends T>)visitor).visitComplexExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexExpContext complexExp() throws RecognitionException {
		ComplexExpContext _localctx = new ComplexExpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_complexExp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			div_multi();
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(119);
					plus_minusOP();
					setState(120);
					div_multi();
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class Div_multiContext extends ParserRuleContext {
		public List<PowContext> pow() {
			return getRuleContexts(PowContext.class);
		}
		public PowContext pow(int i) {
			return getRuleContext(PowContext.class,i);
		}
		public List<Div_multiOPContext> div_multiOP() {
			return getRuleContexts(Div_multiOPContext.class);
		}
		public Div_multiOPContext div_multiOP(int i) {
			return getRuleContext(Div_multiOPContext.class,i);
		}
		public Div_multiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div_multi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterDiv_multi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitDiv_multi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCalculatorVisitor ) return ((SimpleCalculatorVisitor<? extends T>)visitor).visitDiv_multi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Div_multiContext div_multi() throws RecognitionException {
		Div_multiContext _localctx = new Div_multiContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_div_multi);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			pow();
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(128);
					div_multiOP();
					setState(129);
					pow();
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class PowContext extends ParserRuleContext {
		public List<FactContext> fact() {
			return getRuleContexts(FactContext.class);
		}
		public FactContext fact(int i) {
			return getRuleContext(FactContext.class,i);
		}
		public List<PowerContext> power() {
			return getRuleContexts(PowerContext.class);
		}
		public PowerContext power(int i) {
			return getRuleContext(PowerContext.class,i);
		}
		public PowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterPow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitPow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCalculatorVisitor ) return ((SimpleCalculatorVisitor<? extends T>)visitor).visitPow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowContext pow() throws RecognitionException {
		PowContext _localctx = new PowContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pow);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			fact();
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(137);
					power();
					setState(138);
					fact();
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class FactContext extends ParserRuleContext {
		public FactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact; }
	 
		public FactContext() { }
		public void copyFrom(FactContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NummContext extends FactContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NummContext(FactContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterNumm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitNumm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCalculatorVisitor ) return ((SimpleCalculatorVisitor<? extends T>)visitor).visitNumm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParanContext extends FactContext {
		public OpneParanContext opneParan() {
			return getRuleContext(OpneParanContext.class,0);
		}
		public ComplexExpContext complexExp() {
			return getRuleContext(ComplexExpContext.class,0);
		}
		public CloseParanContext closeParan() {
			return getRuleContext(CloseParanContext.class,0);
		}
		public ParanContext(FactContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterParan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitParan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCalculatorVisitor ) return ((SimpleCalculatorVisitor<? extends T>)visitor).visitParan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IddContext extends FactContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IddContext(FactContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterIdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitIdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCalculatorVisitor ) return ((SimpleCalculatorVisitor<? extends T>)visitor).visitIdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactContext fact() throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fact);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				_localctx = new ParanContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				opneParan();
				setState(146);
				complexExp();
				setState(147);
				closeParan();
				}
				break;
			case ALPHABET:
				_localctx = new IddContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				identifier();
				}
				break;
			case T__13:
			case T__14:
			case DIGITS:
				_localctx = new NummContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				number();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class OpenBracketContext extends ParserRuleContext {
		public OpenBracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openBracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterOpenBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitOpenBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCalculatorVisitor ) return ((SimpleCalculatorVisitor<? extends T>)visitor).visitOpenBracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenBracketContext openBracket() throws RecognitionException {
		OpenBracketContext _localctx = new OpenBracketContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_openBracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__6);
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

	public static class CloseBracketContext extends ParserRuleContext {
		public CloseBracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeBracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterCloseBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitCloseBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCalculatorVisitor ) return ((SimpleCalculatorVisitor<? extends T>)visitor).visitCloseBracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseBracketContext closeBracket() throws RecognitionException {
		CloseBracketContext _localctx = new CloseBracketContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_closeBracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__7);
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

	public static class OpneParanContext extends ParserRuleContext {
		public OpneParanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opneParan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterOpneParan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitOpneParan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCalculatorVisitor ) return ((SimpleCalculatorVisitor<? extends T>)visitor).visitOpneParan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpneParanContext opneParan() throws RecognitionException {
		OpneParanContext _localctx = new OpneParanContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_opneParan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__8);
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

	public static class CloseParanContext extends ParserRuleContext {
		public CloseParanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeParan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterCloseParan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitCloseParan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCalculatorVisitor ) return ((SimpleCalculatorVisitor<? extends T>)visitor).visitCloseParan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseParanContext closeParan() throws RecognitionException {
		CloseParanContext _localctx = new CloseParanContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_closeParan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__9);
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

	public static class SemicolonContext extends ParserRuleContext {
		public SemicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterSemicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitSemicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCalculatorVisitor ) return ((SimpleCalculatorVisitor<? extends T>)visitor).visitSemicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SemicolonContext semicolon() throws RecognitionException {
		SemicolonContext _localctx = new SemicolonContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_semicolon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__10);
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

	public static class EqualContext extends ParserRuleContext {
		public EqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCalculatorVisitor ) return ((SimpleCalculatorVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualContext equal() throws RecognitionException {
		EqualContext _localctx = new EqualContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__11);
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

	public static class ColonContext extends ParserRuleContext {
		public ColonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterColon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitColon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCalculatorVisitor ) return ((SimpleCalculatorVisitor<? extends T>)visitor).visitColon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColonContext colon() throws RecognitionException {
		ColonContext _localctx = new ColonContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_colon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__12);
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

	public static class Plus_minusOPContext extends ParserRuleContext {
		public Plus_minusOPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus_minusOP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterPlus_minusOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitPlus_minusOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCalculatorVisitor ) return ((SimpleCalculatorVisitor<? extends T>)visitor).visitPlus_minusOP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Plus_minusOPContext plus_minusOP() throws RecognitionException {
		Plus_minusOPContext _localctx = new Plus_minusOPContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_plus_minusOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==T__14) ) {
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

	public static class Div_multiOPContext extends ParserRuleContext {
		public Div_multiOPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div_multiOP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterDiv_multiOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitDiv_multiOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCalculatorVisitor ) return ((SimpleCalculatorVisitor<? extends T>)visitor).visitDiv_multiOP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Div_multiOPContext div_multiOP() throws RecognitionException {
		Div_multiOPContext _localctx = new Div_multiOPContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_div_multiOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !(_la==T__15 || _la==T__16) ) {
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

	public static class PowerContext extends ParserRuleContext {
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCalculatorVisitor ) return ((SimpleCalculatorVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_power);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__17);
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

	public static class BinopContext extends ParserRuleContext {
		public BinopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterBinop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitBinop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCalculatorVisitor ) return ((SimpleCalculatorVisitor<? extends T>)visitor).visitBinop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinopContext binop() throws RecognitionException {
		BinopContext _localctx = new BinopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_binop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
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

	public static class NumberContext extends ParserRuleContext {
		public List<TerminalNode> DIGITS() { return getTokens(SimpleCalculatorParser.DIGITS); }
		public TerminalNode DIGITS(int i) {
			return getToken(SimpleCalculatorParser.DIGITS, i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCalculatorVisitor ) return ((SimpleCalculatorVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__14) {
				{
				setState(175);
				_la = _input.LA(1);
				if ( !(_la==T__13 || _la==T__14) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(178);
			match(DIGITS);
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(179);
				match(T__24);
				setState(180);
				match(DIGITS);
				}
				break;
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

	public static class IdentifierContext extends ParserRuleContext {
		public List<TerminalNode> ALPHABET() { return getTokens(SimpleCalculatorParser.ALPHABET); }
		public TerminalNode ALPHABET(int i) {
			return getToken(SimpleCalculatorParser.ALPHABET, i);
		}
		public List<TerminalNode> DIGITS() { return getTokens(SimpleCalculatorParser.DIGITS); }
		public TerminalNode DIGITS(int i) {
			return getToken(SimpleCalculatorParser.DIGITS, i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCalculatorVisitor ) return ((SimpleCalculatorVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_identifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(ALPHABET);
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(184);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << DIGITS) | (1L << ALPHABET))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class BooleaContext extends ParserRuleContext {
		public BooleaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolea; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterBoolea(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitBoolea(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCalculatorVisitor ) return ((SimpleCalculatorVisitor<? extends T>)visitor).visitBoolea(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleaContext boolea() throws RecognitionException {
		BooleaContext _localctx = new BooleaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_boolea);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_la = _input.LA(1);
			if ( !(_la==T__26 || _la==T__27) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00c3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\6\3\62"+
		"\n\3\r\3\16\3\63\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4a\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5n\n\5\3\5\3\5\3\5\3\5\7\5t\n\5\f\5"+
		"\16\5w\13\5\3\6\3\6\3\6\3\6\7\6}\n\6\f\6\16\6\u0080\13\6\3\7\3\7\3\7\3"+
		"\7\7\7\u0086\n\7\f\7\16\7\u0089\13\7\3\b\3\b\3\b\3\b\7\b\u008f\n\b\f\b"+
		"\16\b\u0092\13\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u009a\n\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\5\25\u00b3\n\25\3\25\3\25\3\25\5\25\u00b8\n"+
		"\25\3\26\3\26\7\26\u00bc\n\26\f\26\16\26\u00bf\13\26\3\27\3\27\3\27\2"+
		"\3\b\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\7\3\2\20\21\3"+
		"\2\22\23\3\2\25\32\4\2\34\34\37 \3\2\35\36\2\u00c1\2.\3\2\2\2\4\61\3\2"+
		"\2\2\6`\3\2\2\2\bm\3\2\2\2\nx\3\2\2\2\f\u0081\3\2\2\2\16\u008a\3\2\2\2"+
		"\20\u0099\3\2\2\2\22\u009b\3\2\2\2\24\u009d\3\2\2\2\26\u009f\3\2\2\2\30"+
		"\u00a1\3\2\2\2\32\u00a3\3\2\2\2\34\u00a5\3\2\2\2\36\u00a7\3\2\2\2 \u00a9"+
		"\3\2\2\2\"\u00ab\3\2\2\2$\u00ad\3\2\2\2&\u00af\3\2\2\2(\u00b2\3\2\2\2"+
		"*\u00b9\3\2\2\2,\u00c0\3\2\2\2./\5\4\3\2/\3\3\2\2\2\60\62\5\6\4\2\61\60"+
		"\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\5\3\2\2\2\65\66"+
		"\5*\26\2\66\67\5\34\17\2\678\5\b\5\289\5\32\16\29a\3\2\2\2:;\5\22\n\2"+
		";<\5\4\3\2<=\5\24\13\2=a\3\2\2\2>?\7\3\2\2?@\5\26\f\2@A\5\b\5\2AB\5\30"+
		"\r\2BC\5\6\4\2Ca\3\2\2\2DE\7\3\2\2EF\5\26\f\2FG\5\b\5\2GH\5\30\r\2HI\5"+
		"\6\4\2IJ\7\4\2\2JK\5\6\4\2Ka\3\2\2\2LM\7\5\2\2MN\5\26\f\2NO\5\b\5\2OP"+
		"\5\30\r\2PQ\5\6\4\2Qa\3\2\2\2RS\7\6\2\2ST\5\26\f\2TU\5*\26\2UV\5\34\17"+
		"\2VW\5(\25\2WX\5\36\20\2XY\5(\25\2YZ\5\30\r\2Z[\5\6\4\2[a\3\2\2\2\\]\7"+
		"\7\2\2]^\5*\26\2^_\5\32\16\2_a\3\2\2\2`\65\3\2\2\2`:\3\2\2\2`>\3\2\2\2"+
		"`D\3\2\2\2`L\3\2\2\2`R\3\2\2\2`\\\3\2\2\2a\7\3\2\2\2bc\b\5\1\2cd\7\b\2"+
		"\2dn\5\b\5\bef\5\26\f\2fg\5\b\5\2gh\5\30\r\2hn\3\2\2\2in\5*\26\2jn\5("+
		"\25\2kn\5,\27\2ln\5\n\6\2mb\3\2\2\2me\3\2\2\2mi\3\2\2\2mj\3\2\2\2mk\3"+
		"\2\2\2ml\3\2\2\2nu\3\2\2\2op\f\t\2\2pq\5&\24\2qr\5\b\5\nrt\3\2\2\2so\3"+
		"\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\t\3\2\2\2wu\3\2\2\2x~\5\f\7\2yz"+
		"\5 \21\2z{\5\f\7\2{}\3\2\2\2|y\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3"+
		"\2\2\2\177\13\3\2\2\2\u0080~\3\2\2\2\u0081\u0087\5\16\b\2\u0082\u0083"+
		"\5\"\22\2\u0083\u0084\5\16\b\2\u0084\u0086\3\2\2\2\u0085\u0082\3\2\2\2"+
		"\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\r\3"+
		"\2\2\2\u0089\u0087\3\2\2\2\u008a\u0090\5\20\t\2\u008b\u008c\5$\23\2\u008c"+
		"\u008d\5\20\t\2\u008d\u008f\3\2\2\2\u008e\u008b\3\2\2\2\u008f\u0092\3"+
		"\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\17\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0093\u0094\5\26\f\2\u0094\u0095\5\n\6\2\u0095\u0096\5"+
		"\30\r\2\u0096\u009a\3\2\2\2\u0097\u009a\5*\26\2\u0098\u009a\5(\25\2\u0099"+
		"\u0093\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\21\3\2\2"+
		"\2\u009b\u009c\7\t\2\2\u009c\23\3\2\2\2\u009d\u009e\7\n\2\2\u009e\25\3"+
		"\2\2\2\u009f\u00a0\7\13\2\2\u00a0\27\3\2\2\2\u00a1\u00a2\7\f\2\2\u00a2"+
		"\31\3\2\2\2\u00a3\u00a4\7\r\2\2\u00a4\33\3\2\2\2\u00a5\u00a6\7\16\2\2"+
		"\u00a6\35\3\2\2\2\u00a7\u00a8\7\17\2\2\u00a8\37\3\2\2\2\u00a9\u00aa\t"+
		"\2\2\2\u00aa!\3\2\2\2\u00ab\u00ac\t\3\2\2\u00ac#\3\2\2\2\u00ad\u00ae\7"+
		"\24\2\2\u00ae%\3\2\2\2\u00af\u00b0\t\4\2\2\u00b0\'\3\2\2\2\u00b1\u00b3"+
		"\t\2\2\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b7\7\37\2\2\u00b5\u00b6\7\33\2\2\u00b6\u00b8\7\37\2\2\u00b7\u00b5"+
		"\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8)\3\2\2\2\u00b9\u00bd\7 \2\2\u00ba\u00bc"+
		"\t\5\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be+\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\t\6\2\2"+
		"\u00c1-\3\2\2\2\r\63`mu~\u0087\u0090\u0099\u00b2\u00b7\u00bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}