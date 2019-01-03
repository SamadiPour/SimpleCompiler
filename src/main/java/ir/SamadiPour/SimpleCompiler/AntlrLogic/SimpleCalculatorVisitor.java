// Generated from SimpleCalculator.g4 by ANTLR 4.7.2
package ir.SamadiPour.SimpleCompiler.AntlrLogic;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleCalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleCalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleCalculatorParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SimpleCalculatorParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCalculatorParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(SimpleCalculatorParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link SimpleCalculatorParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SimpleCalculatorParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code beginend}
	 * labeled alternative in {@link SimpleCalculatorParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeginend(SimpleCalculatorParser.BeginendContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link SimpleCalculatorParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(SimpleCalculatorParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifelse}
	 * labeled alternative in {@link SimpleCalculatorParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelse(SimpleCalculatorParser.IfelseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link SimpleCalculatorParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(SimpleCalculatorParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for}
	 * labeled alternative in {@link SimpleCalculatorParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(SimpleCalculatorParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print}
	 * labeled alternative in {@link SimpleCalculatorParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(SimpleCalculatorParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link SimpleCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(SimpleCalculatorParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code complexExpr}
	 * labeled alternative in {@link SimpleCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexExpr(SimpleCalculatorParser.ComplexExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link SimpleCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(SimpleCalculatorParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code num}
	 * labeled alternative in {@link SimpleCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(SimpleCalculatorParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link SimpleCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(SimpleCalculatorParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paranthesis}
	 * labeled alternative in {@link SimpleCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParanthesis(SimpleCalculatorParser.ParanthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binopr}
	 * labeled alternative in {@link SimpleCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinopr(SimpleCalculatorParser.BinoprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCalculatorParser#complexExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexExp(SimpleCalculatorParser.ComplexExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCalculatorParser#div_multi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv_multi(SimpleCalculatorParser.Div_multiContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCalculatorParser#pow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(SimpleCalculatorParser.PowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paran}
	 * labeled alternative in {@link SimpleCalculatorParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParan(SimpleCalculatorParser.ParanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idd}
	 * labeled alternative in {@link SimpleCalculatorParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdd(SimpleCalculatorParser.IddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numm}
	 * labeled alternative in {@link SimpleCalculatorParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumm(SimpleCalculatorParser.NummContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCalculatorParser#openBracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenBracket(SimpleCalculatorParser.OpenBracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCalculatorParser#closeBracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseBracket(SimpleCalculatorParser.CloseBracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCalculatorParser#opneParan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpneParan(SimpleCalculatorParser.OpneParanContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCalculatorParser#closeParan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseParan(SimpleCalculatorParser.CloseParanContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCalculatorParser#semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemicolon(SimpleCalculatorParser.SemicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCalculatorParser#equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(SimpleCalculatorParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCalculatorParser#colon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColon(SimpleCalculatorParser.ColonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCalculatorParser#plus_minusOP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus_minusOP(SimpleCalculatorParser.Plus_minusOPContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCalculatorParser#div_multiOP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv_multiOP(SimpleCalculatorParser.Div_multiOPContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCalculatorParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(SimpleCalculatorParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCalculatorParser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinop(SimpleCalculatorParser.BinopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCalculatorParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(SimpleCalculatorParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCalculatorParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SimpleCalculatorParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCalculatorParser#boolea}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolea(SimpleCalculatorParser.BooleaContext ctx);
}