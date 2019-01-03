package ir.SamadiPour.SimpleCompiler.AntlrLogic;
// Generated from SimpleCalculator.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleCalculatorParser}.
 */
public interface SimpleCalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleCalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SimpleCalculatorParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SimpleCalculatorParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCalculatorParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(SimpleCalculatorParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCalculatorParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(SimpleCalculatorParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link SimpleCalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SimpleCalculatorParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link SimpleCalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SimpleCalculatorParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code beginend}
	 * labeled alternative in {@link SimpleCalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBeginend(SimpleCalculatorParser.BeginendContext ctx);
	/**
	 * Exit a parse tree produced by the {@code beginend}
	 * labeled alternative in {@link SimpleCalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBeginend(SimpleCalculatorParser.BeginendContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link SimpleCalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIf(SimpleCalculatorParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link SimpleCalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIf(SimpleCalculatorParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifelse}
	 * labeled alternative in {@link SimpleCalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfelse(SimpleCalculatorParser.IfelseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifelse}
	 * labeled alternative in {@link SimpleCalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfelse(SimpleCalculatorParser.IfelseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link SimpleCalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile(SimpleCalculatorParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link SimpleCalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile(SimpleCalculatorParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for}
	 * labeled alternative in {@link SimpleCalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFor(SimpleCalculatorParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for}
	 * labeled alternative in {@link SimpleCalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFor(SimpleCalculatorParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link SimpleCalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint(SimpleCalculatorParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link SimpleCalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint(SimpleCalculatorParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not}
	 * labeled alternative in {@link SimpleCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(SimpleCalculatorParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not}
	 * labeled alternative in {@link SimpleCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(SimpleCalculatorParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code complexExpr}
	 * labeled alternative in {@link SimpleCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterComplexExpr(SimpleCalculatorParser.ComplexExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code complexExpr}
	 * labeled alternative in {@link SimpleCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitComplexExpr(SimpleCalculatorParser.ComplexExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link SimpleCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBool(SimpleCalculatorParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link SimpleCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBool(SimpleCalculatorParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code num}
	 * labeled alternative in {@link SimpleCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNum(SimpleCalculatorParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code num}
	 * labeled alternative in {@link SimpleCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNum(SimpleCalculatorParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link SimpleCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(SimpleCalculatorParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link SimpleCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(SimpleCalculatorParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paranthesis}
	 * labeled alternative in {@link SimpleCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParanthesis(SimpleCalculatorParser.ParanthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paranthesis}
	 * labeled alternative in {@link SimpleCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParanthesis(SimpleCalculatorParser.ParanthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binopr}
	 * labeled alternative in {@link SimpleCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinopr(SimpleCalculatorParser.BinoprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binopr}
	 * labeled alternative in {@link SimpleCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinopr(SimpleCalculatorParser.BinoprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCalculatorParser#complexExp}.
	 * @param ctx the parse tree
	 */
	void enterComplexExp(SimpleCalculatorParser.ComplexExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCalculatorParser#complexExp}.
	 * @param ctx the parse tree
	 */
	void exitComplexExp(SimpleCalculatorParser.ComplexExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCalculatorParser#div_multi}.
	 * @param ctx the parse tree
	 */
	void enterDiv_multi(SimpleCalculatorParser.Div_multiContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCalculatorParser#div_multi}.
	 * @param ctx the parse tree
	 */
	void exitDiv_multi(SimpleCalculatorParser.Div_multiContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCalculatorParser#pow}.
	 * @param ctx the parse tree
	 */
	void enterPow(SimpleCalculatorParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCalculatorParser#pow}.
	 * @param ctx the parse tree
	 */
	void exitPow(SimpleCalculatorParser.PowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paran}
	 * labeled alternative in {@link SimpleCalculatorParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterParan(SimpleCalculatorParser.ParanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paran}
	 * labeled alternative in {@link SimpleCalculatorParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitParan(SimpleCalculatorParser.ParanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idd}
	 * labeled alternative in {@link SimpleCalculatorParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterIdd(SimpleCalculatorParser.IddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idd}
	 * labeled alternative in {@link SimpleCalculatorParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitIdd(SimpleCalculatorParser.IddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numm}
	 * labeled alternative in {@link SimpleCalculatorParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterNumm(SimpleCalculatorParser.NummContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numm}
	 * labeled alternative in {@link SimpleCalculatorParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitNumm(SimpleCalculatorParser.NummContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCalculatorParser#openBracket}.
	 * @param ctx the parse tree
	 */
	void enterOpenBracket(SimpleCalculatorParser.OpenBracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCalculatorParser#openBracket}.
	 * @param ctx the parse tree
	 */
	void exitOpenBracket(SimpleCalculatorParser.OpenBracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCalculatorParser#closeBracket}.
	 * @param ctx the parse tree
	 */
	void enterCloseBracket(SimpleCalculatorParser.CloseBracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCalculatorParser#closeBracket}.
	 * @param ctx the parse tree
	 */
	void exitCloseBracket(SimpleCalculatorParser.CloseBracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCalculatorParser#opneParan}.
	 * @param ctx the parse tree
	 */
	void enterOpneParan(SimpleCalculatorParser.OpneParanContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCalculatorParser#opneParan}.
	 * @param ctx the parse tree
	 */
	void exitOpneParan(SimpleCalculatorParser.OpneParanContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCalculatorParser#closeParan}.
	 * @param ctx the parse tree
	 */
	void enterCloseParan(SimpleCalculatorParser.CloseParanContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCalculatorParser#closeParan}.
	 * @param ctx the parse tree
	 */
	void exitCloseParan(SimpleCalculatorParser.CloseParanContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCalculatorParser#semicolon}.
	 * @param ctx the parse tree
	 */
	void enterSemicolon(SimpleCalculatorParser.SemicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCalculatorParser#semicolon}.
	 * @param ctx the parse tree
	 */
	void exitSemicolon(SimpleCalculatorParser.SemicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCalculatorParser#equal}.
	 * @param ctx the parse tree
	 */
	void enterEqual(SimpleCalculatorParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCalculatorParser#equal}.
	 * @param ctx the parse tree
	 */
	void exitEqual(SimpleCalculatorParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCalculatorParser#colon}.
	 * @param ctx the parse tree
	 */
	void enterColon(SimpleCalculatorParser.ColonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCalculatorParser#colon}.
	 * @param ctx the parse tree
	 */
	void exitColon(SimpleCalculatorParser.ColonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCalculatorParser#plus_minusOP}.
	 * @param ctx the parse tree
	 */
	void enterPlus_minusOP(SimpleCalculatorParser.Plus_minusOPContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCalculatorParser#plus_minusOP}.
	 * @param ctx the parse tree
	 */
	void exitPlus_minusOP(SimpleCalculatorParser.Plus_minusOPContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCalculatorParser#div_multiOP}.
	 * @param ctx the parse tree
	 */
	void enterDiv_multiOP(SimpleCalculatorParser.Div_multiOPContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCalculatorParser#div_multiOP}.
	 * @param ctx the parse tree
	 */
	void exitDiv_multiOP(SimpleCalculatorParser.Div_multiOPContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCalculatorParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(SimpleCalculatorParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCalculatorParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(SimpleCalculatorParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCalculatorParser#binop}.
	 * @param ctx the parse tree
	 */
	void enterBinop(SimpleCalculatorParser.BinopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCalculatorParser#binop}.
	 * @param ctx the parse tree
	 */
	void exitBinop(SimpleCalculatorParser.BinopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCalculatorParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(SimpleCalculatorParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCalculatorParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(SimpleCalculatorParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCalculatorParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SimpleCalculatorParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCalculatorParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SimpleCalculatorParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCalculatorParser#boolea}.
	 * @param ctx the parse tree
	 */
	void enterBoolea(SimpleCalculatorParser.BooleaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCalculatorParser#boolea}.
	 * @param ctx the parse tree
	 */
	void exitBoolea(SimpleCalculatorParser.BooleaContext ctx);
}