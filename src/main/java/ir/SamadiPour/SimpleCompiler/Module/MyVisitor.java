package ir.SamadiPour.SimpleCompiler.Module;

import ir.SamadiPour.SimpleCompiler.AntlrLogic.SimpleCalculatorBaseVisitor;
import ir.SamadiPour.SimpleCompiler.AntlrLogic.SimpleCalculatorLexer;
import ir.SamadiPour.SimpleCompiler.AntlrLogic.SimpleCalculatorParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * @author SamadiPour
 */
public class MyVisitor extends SimpleCalculatorBaseVisitor<String> {

    private HashMap<String, String> memory = new HashMap<>();
    private static ArrayList<String> textResult = new ArrayList<>();


    public static ArrayList<String> doYourMagic(ANTLRInputStream input) {
        textResult.clear();
        SimpleCalculatorLexer lexer = new SimpleCalculatorLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SimpleCalculatorParser parser = new SimpleCalculatorParser(tokens);
        SimpleCalculatorParser.ProgramContext tree = parser.program();
        SimpleCalculatorBaseVisitor<String> visitor = new MyVisitor();
        tree.accept(visitor);
        return textResult;
    }

    @Override
    public String visitProgram(SimpleCalculatorParser.ProgramContext ctx) {
        visit(ctx.statements());
        return null;
    }

    @Override
    public String visitStatements(SimpleCalculatorParser.StatementsContext ctx) {
        for (SimpleCalculatorParser.StatementContext temp : ctx.statement()) {
            visit(temp);
        }
        return null;
    }

    @Override
    public String visitAssignment(SimpleCalculatorParser.AssignmentContext ctx) {
        String variable = visit(ctx.identifier());
        String value = visit(ctx.expr());
        memory.put(variable, value);
        return null;
    }

    @Override
    public String visitBeginend(SimpleCalculatorParser.BeginendContext ctx) {
        visit(ctx.statements());
        return null;
    }

    @Override
    public String visitIf(SimpleCalculatorParser.IfContext ctx) {
        boolean result = visit(ctx.expr()).equals("true");
        if (result)
            visit(ctx.statement());
        return null;
    }

    @Override
    public String visitIfelse(SimpleCalculatorParser.IfelseContext ctx) {
        boolean result = visit(ctx.expr()).equals("true");
        if (result)
            visit(ctx.statement(0));
        else
            visit(ctx.statement(1));
        return null;
    }

    @Override
    public String visitWhile(SimpleCalculatorParser.WhileContext ctx) {
        while (visit(ctx.expr()).equals("true")) {
            visit(ctx.statement());
        }
        return null;
    }

    @Override
    public String visitFor(SimpleCalculatorParser.ForContext ctx) {
        //assigning variable
        String variable = visit(ctx.identifier());
        String value = visit(ctx.number(0));
        memory.put(variable, value);

        //for loop
        double startValue = Double.parseDouble(value);
        double targetValue = Double.parseDouble(visit(ctx.number(1)));
        while (startValue <= targetValue) {
            visit(ctx.statement());
            startValue++;
            memory.put(variable, String.valueOf(startValue));
        }
        return null;
    }

    @Override
    public String visitPrint(SimpleCalculatorParser.PrintContext ctx) {
        String variable = visit(ctx.identifier());
        textResult.add(memory.get(variable));
        return null;
    }

    @Override
    public String visitNot(SimpleCalculatorParser.NotContext ctx) {
        boolean result;
        String value = visit(ctx.expr());
        if (value.matches("\\d+(\\.\\d+)*")) {
            result = Double.parseDouble(value) != 0;
        } else result = value.equals("true");

        if (result)
            return "false";
        return "true";
    }

    @Override
    public String visitComplexExpr(SimpleCalculatorParser.ComplexExprContext ctx) {
        return visit(ctx.complexExp());
    }

    @Override
    public String visitBool(SimpleCalculatorParser.BoolContext ctx) {
        return visit(ctx.boolea());
    }

    @Override
    public String visitNum(SimpleCalculatorParser.NumContext ctx) {
        return visit(ctx.number());
    }

    @Override
    public String visitId(SimpleCalculatorParser.IdContext ctx) {
        String variable = visit(ctx.identifier());
        return memory.get(variable);
    }

    @Override
    public String visitParanthesis(SimpleCalculatorParser.ParanthesisContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public String visitBinopr(SimpleCalculatorParser.BinoprContext ctx) {
        String operator = visit(ctx.binop());

        boolean result;
        try {
            double firstExpr = Double.parseDouble(visit(ctx.expr(0)));
            double SecondExpr = Double.parseDouble(visit(ctx.expr(1)));

            switch (operator) {
                case "<":
                    result = firstExpr < SecondExpr;
                    break;
                case ">":
                    result = firstExpr > SecondExpr;
                    break;
                case "<=":
                    result = firstExpr <= SecondExpr;
                    break;
                case ">=":
                    result = firstExpr >= SecondExpr;
                    break;
                case "==":
                    result = firstExpr == SecondExpr;
                    break;
                case "!=":
                    result = firstExpr != SecondExpr;
                    break;
                default:
                    return null;
            }
            return result ? "true" : "false";
        } catch (Exception e) {
            System.err.println("don't compare boolean!!!");
        }
        return null;
    }

    @Override
    public String visitComplexExp(SimpleCalculatorParser.ComplexExpContext ctx) {
        //first Div_Multi
        double result = Double.parseDouble(visit(ctx.div_multi(0)));

        //getting rest of them
        for (int i = 0; i < ctx.plus_minusOP().size(); i++) {
            String operation = visit(ctx.plus_minusOP(i));
            double second = Double.parseDouble(visit(ctx.div_multi(i + 1)));
            switch (operation) {
                case "+":
                    result += second;
                    break;
                case "-":
                    result -= second;
                    break;
            }
        }
        return String.valueOf(result);
    }

    @Override
    public String visitDiv_multi(SimpleCalculatorParser.Div_multiContext ctx) {
        //first Pow
        double result = Double.parseDouble(visit(ctx.pow(0)));

        //getting rest of them
        for (int i = 0; i < ctx.div_multiOP().size(); i++) {
            String operation = visit(ctx.div_multiOP(i));
            double second = Double.parseDouble(visit(ctx.pow(i + 1)));
            switch (operation) {
                case "/":
                    result /= second;
                    break;
                case "*":
                    result *= second;
                    break;
            }
        }
        return String.valueOf(result);
    }

    @Override
    public String visitPow(SimpleCalculatorParser.PowContext ctx) {
        double result;
        if (ctx.power().size() == 0) {
            result = Double.parseDouble(visit(ctx.fact(0)));
        } else {
            result = Math.pow(Double.parseDouble(visit(ctx.fact(ctx.power().size() - 1)))
                    , Double.parseDouble(visit(ctx.fact(ctx.power().size()))));
            if (ctx.power().size() > 1) {
                for (int i = ctx.power().size() - 1; i > 0; i--) {
                    result = Math.pow(Double.parseDouble(visit(ctx.fact(i - 1)))
                            , result);
                }
            }
        }
        return String.valueOf(result);
    }

    @Override
    public String visitParan(SimpleCalculatorParser.ParanContext ctx) {
        return visit(ctx.complexExp());
    }

    @Override
    public String visitIdd(SimpleCalculatorParser.IddContext ctx) {
        String variable = visit(ctx.identifier());
        return memory.get(variable);
    }

    @Override
    public String visitNumm(SimpleCalculatorParser.NummContext ctx) {
        return visit(ctx.number());
    }

    @Override
    public String visitOpenBracket(SimpleCalculatorParser.OpenBracketContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitCloseBracket(SimpleCalculatorParser.CloseBracketContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitOpneParan(SimpleCalculatorParser.OpneParanContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitCloseParan(SimpleCalculatorParser.CloseParanContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitSemicolon(SimpleCalculatorParser.SemicolonContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitEqual(SimpleCalculatorParser.EqualContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitColon(SimpleCalculatorParser.ColonContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitPlus_minusOP(SimpleCalculatorParser.Plus_minusOPContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitDiv_multiOP(SimpleCalculatorParser.Div_multiOPContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitPower(SimpleCalculatorParser.PowerContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitBinop(SimpleCalculatorParser.BinopContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitNumber(SimpleCalculatorParser.NumberContext ctx) {
        return String.valueOf(Double.parseDouble(ctx.getText()));
    }

    @Override
    public String visitIdentifier(SimpleCalculatorParser.IdentifierContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitBoolea(SimpleCalculatorParser.BooleaContext ctx) {
        return ctx.getText();
    }
}
