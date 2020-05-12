package compiler.visitor;

import compiler.grammar.mathGrammarBaseVisitor;
import compiler.grammar.mathGrammarParser;
import compiler.visitor.exceptions.NotDefinedVariable;
import compiler.visitor.exceptions.NotValidCast;
import org.antlr.v4.runtime.ParserRuleContext;

import javax.print.DocFlavor;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static compiler.config.Config.COMPILE_PACKAGE_NAME;


public class setVisitor extends mathGrammarBaseVisitor<String> {
    private String className;
    private Map<String, Type> globalVariable = new HashMap<>();
    private Map<String, Type> localVariable = new HashMap<>();
    private Map<String, Type> functionNames = new HashMap<>();

    public setVisitor(String fileName) {
        String fileNameForClass = getStringWithFirstCapital(fileName);
        this.className = replaceDot(fileNameForClass);
    }

    private String getStringWithFirstCapital(String string) {
        return string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
    }

    private String replaceDot(String string) {
        return string.replaceAll("[.]", "_");
    }

    private boolean isGlobal(ParserRuleContext ctx) {
        return ctx.getParent().getParent() instanceof mathGrammarParser.ParseContext;
    }

    private void addVariableToList(ParserRuleContext ctx, String name, Type type) {
        if (isGlobal(ctx)) {
            globalVariable.put(name, type);
        } else {
            localVariable.put(name, type);
        }
    }

    private void addToLocalVariableList(String name, Type type) {
        localVariable.put(name, type);
    }

    private void clearLocalVariableList() {
        localVariable.clear();
    }

    private void addToFunctionList(String name, Type type) {
        functionNames.put(name, type);
    }

    private void checkVariable(String name) {
        if (!(globalVariable.containsKey(name) || localVariable.containsKey(name))) {
            try {
                throw new NotDefinedVariable("Variable " + name + " is not defined");
            } catch (NotDefinedVariable notDefinedVariable) {
                logError(notDefinedVariable.getMessage());
                System.exit(-1);
            }
        }
    }

    private void checkFunction(String name) {
        if (!(functionNames.containsKey(name))) {
            try {
                throw new NotDefinedVariable("Function " + name + " is not defined");
            } catch (NotDefinedVariable notDefinedVariable) {
                logError(notDefinedVariable.getMessage());
                System.exit(-2);
            }
        }
    }

    private void checkCast(String name, Type needType) {
        try {
            if (localVariable.containsKey(name)) {
                if (!(localVariable.get(name).equals(needType))) {
                    throw new NotValidCast("Variable " + name + " need have type " + needType);
                }
            } else {
                if (!(globalVariable.get(name).equals(needType))) {
                    throw new NotValidCast("Variable " + name + " need have type " + needType);
                }
            }
        } catch (NotValidCast notValidCast) {
            logError(notValidCast.getMessage());
            System.exit(-3);
        }
    }

    private void logError(String message) {
        System.out.println("Compilation Error: " + message);
    }

    private void checkCastFunction(String name, Type needType) {
        if (!(functionNames.get(name).equals(needType))) {
            try {
                throw new NotValidCast("Function " + name + " need have type " + needType);
            } catch (NotValidCast notValidCast) {
                notValidCast.printStackTrace();
                System.exit(-4);
            }
        }

    }

    private Type getTypeVariable(String name) {
        if (localVariable.containsKey(name)) {
            return localVariable.get(name);
        } else {
            return globalVariable.get(name);
        }
    }

    private boolean notExistLocaleVariable(String name) {
        return !localVariable.containsKey(name);
    }

    @Override
    public String visitParse(mathGrammarParser.ParseContext ctx) {
        String buffer = "// program " + className + " compiled on " + new Date().toString() + "\n";
        buffer += "package " + COMPILE_PACKAGE_NAME + ";\n";
        buffer += "public class " + "Main" + " {\n";
        List<mathGrammarParser.CreateContext> createContextList = ctx.create();
        for (mathGrammarParser.CreateContext aCreateContextList : createContextList) {
            buffer += "static " + this.visit(aCreateContextList);
            buffer += "\n";
        }
        List<mathGrammarParser.FunctionContext> functionContextList = ctx.function();
        for (mathGrammarParser.FunctionContext aFunctionContextList : functionContextList) {
            buffer += this.visit(aFunctionContextList);
            buffer += "\n";
        }
        buffer += this.visit(ctx.main());
        buffer += "}\n";
        return buffer;
    }

    @Override
    public String visitMain(mathGrammarParser.MainContext ctx) {
        clearLocalVariableList();
        return "public static void main(String[]args) throws Exception{\n" +
                this.visit(ctx.start()) +
                "}\n";
    }

    @Override
    public String visitStart(mathGrammarParser.StartContext ctx) {
        String buffer = "";
        for (int children = 0; children < ctx.getChildCount(); children++) {
            buffer += "";
            buffer += this.visit(ctx.getChild(children));
            buffer += "\n";
        }
        return buffer;
    }


    @Override
    public String visitCreate_int(mathGrammarParser.Create_intContext ctx) {
        String name = ctx.ID().getText();
        String newVariable = "";
        if (notExistLocaleVariable(name)) {
            addVariableToList(ctx, name, Type.INTEGER);
            newVariable = Type.INTEGER.toString() + " ";
        }
        String nameObject = visit(ctx.expr());
        return newVariable + name + " = " + nameObject + ";";
    }

    @Override
    public String visitCreate_const_int(mathGrammarParser.Create_const_intContext ctx) {
        String newInt = visit(ctx.create_int());
        return "final" + " " + newInt;
    }

    @Override
    public String visitCreate_float(mathGrammarParser.Create_floatContext ctx) {
        String name = ctx.ID().getText();
        String newVariable = "";
        if (notExistLocaleVariable(name)) {
            addVariableToList(ctx, name, Type.FLOAT);
            newVariable = Type.FLOAT.toString() + " ";
        }
        String nameObject = visit(ctx.expr());
        return newVariable + name + " = " + nameObject + ";";
    }

    @Override
    public String visitCreate_const_float(mathGrammarParser.Create_const_floatContext ctx) {
        String newfloat = visit(ctx.create_float());
        return "final" + " " + newfloat;
    }

    @Override
    public String visitForCond(mathGrammarParser.ForCondContext ctx) {
        String id1 = ctx.ID(0).getText();
        //    addToLocalVariableList(left, Type.ELEMENT);
        String id2 = ctx.ID(1).getText();
        String expression = visit(ctx.expr());
        String condition = visit(ctx.condition());
        //     checkVariable(right);
        //    checkCast(right, Type.SET);
        switch (ctx.oper.getType()) {
            case mathGrammarParser.INCR:
                return id1 + "=" + expression + "; " + condition + "; " + id2 + "++";

            case mathGrammarParser.DECR:
                return id1 + "=" + expression + "; " + condition + "; " + id2 + "--";
            default:
                throw new RuntimeException("Unknown operator: " + ctx.oper.getText());

        }
    }


    @Override
    public String visitPretty_print(mathGrammarParser.Pretty_printContext ctx) {
        String variableName = ctx.ID().getText();
        checkVariable(variableName);

        return variableName + ".pretty()";
    }


    @Override
    public String visitNameObjectInt(mathGrammarParser.NameObjectIntContext ctx) {

        return ctx.INT().getText();

    }

    public String visitNameObjectFloat(mathGrammarParser.NameObjectFloatContext ctx) {

        return ctx.FLOAT().getText();

    }


    @Override
    public String visitPrint(mathGrammarParser.PrintContext ctx) {
        return "System.out.println(" + this.visit(ctx.print_expr()) + ");";
    }


    @Override
    public String visitPrintId(mathGrammarParser.PrintIdContext ctx) {
        String name = ctx.ID().toString();
        checkVariable(name);
        return name;
    }

    @Override
    public String visitPrintInt(mathGrammarParser.PrintIntContext ctx) {
        return ctx.INT().getText();
    }

    @Override
    public String visitPrintFloat(mathGrammarParser.PrintFloatContext ctx) {
        return ctx.FLOAT().getText();
    }


    @Override
    public String visitStat_block(mathGrammarParser.Stat_blockContext ctx) {
        Map<String, Type> beforeStatBlock = new HashMap(localVariable);
        String block = "{\n" + this.visit(ctx.start()) + "}";
        localVariable = beforeStatBlock;
        return block;
    }


    @Override
    public String visitIf_stat(mathGrammarParser.If_statContext ctx) {
        String buffer = "";
        List<mathGrammarParser.Condition_blockContext> conditions = ctx.condition_block();
        for (int index = 0; index < conditions.size(); index++) {
            String conditionString = this.visit(conditions.get(index).condition());
            String negation = "";
            if (conditions.get(index).NEGATION() != null) {
                negation = "!";
            }
            buffer += "if (" + negation + conditionString + ")";
            buffer += this.visit(conditions.get(index).stat_block());
            if ((index + 1) < conditions.size()) {
                buffer += "else ";
            }
        }
        if (ctx.stat_block() != null) {
            buffer += "else" + this.visit(ctx.stat_block());
        }
        return buffer;
    }

    @Override
    public String visitCondition_block(mathGrammarParser.Condition_blockContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitEqualityExpr(mathGrammarParser.EqualityExprContext ctx) {
        String left = ctx.ID().getText();
        //checkVariable(left);
        String right = visit(ctx.expr());
        //  checkVariable(right);
        switch (ctx.op.getType()) {
            case mathGrammarParser.EQ:
                return left + "==" + right;
            case mathGrammarParser.NEQ:
                return left + "!=" + right;
            case mathGrammarParser.OANGLEBR:
                return left + "<" + right;
            case mathGrammarParser.CANGLEBR:
                return left + ">" + right;
            case mathGrammarParser.EQOANGLEBR:
                return left + "<=" + right;
            case mathGrammarParser.EQCANGLEBR:
                return left + ">=" + right;
            default:
                throw new RuntimeException("Unknown operator: " + ctx.op.getText());
        }
    }


    @Override
    public String visitCheckType(mathGrammarParser.CheckTypeContext ctx) {
        String left = ctx.ID().getText();
        checkVariable(left);
        String right = ctx.type().getText();
        right = getStringWithFirstCapital(right);
        return left + ".getClass().getSimpleName().equals(\"" + right + "\")";
    }

    @Override
    public String visitWhile_stat(mathGrammarParser.While_statContext ctx) {
        return "while (" + this.visit(ctx.condition_block().condition()) + ")" +
                this.visit(ctx.condition_block().stat_block());
    }


    @Override
    public String visitFor_stat(mathGrammarParser.For_statContext ctx) {
        String cond = visit(ctx.condition_for());
        String forBlock = "for (" + cond + ")" + this.visit(ctx.stat_block());
        return forBlock;
    }


    @Override
    public String visitVoidFunction(mathGrammarParser.VoidFunctionContext ctx) {
        clearLocalVariableList();
        String name = ctx.ID().getText();
        addToFunctionList(name, Type.VOID);
        return "private static void " + name + this.visit(ctx.param()) + this.visit(ctx.stat_block());
    }

    @Override
    public String visitReturnFunction(mathGrammarParser.ReturnFunctionContext ctx) {
        clearLocalVariableList();
        String name = ctx.ID().getText();
        String returnType = ctx.type().getText();
        if (returnType.equals("integer")) {
            returnType = "int";
        }
 //           returnType = getStringWithFirstCapital(returnType);
            addToFunctionList(name, Type.getTypeByString(returnType));
            return "private static " + returnType + " " + name +
                    this.visit(ctx.param()) +
                    this.visit(ctx.stat_block_with_return());
        }


    @Override
    public String visitStat_block_with_return(mathGrammarParser.Stat_block_with_returnContext ctx) {
        return "{\n" + this.visit(ctx.start()) + this.visit(ctx.return_id()) + "}";
    }

    @Override
    public String visitReturn_id(mathGrammarParser.Return_idContext ctx) {
        String id = ctx.ID().getText();
        checkVariable(id);
        mathGrammarParser.ReturnFunctionContext context = (mathGrammarParser.ReturnFunctionContext) ctx.getParent().getParent();
        checkCast(id, Type.getTypeByString(getStringWithFirstCapital(context.type().getText())));
        return "return " + id + ";\n";
    }

    @Override
    public String visitFunction_call(mathGrammarParser.Function_callContext ctx) {
        String name = ctx.ID().getText();
        checkFunction(name);
        return name + this.visit(ctx.param_call());
    }

    @Override
    public String visitCall(mathGrammarParser.CallContext ctx) {
        String name = ctx.ID().getText();
        String arg = visit(ctx.expr());
        checkFunction(name);
        return name + "(" + arg + ")" ;
    }

    @Override
    public String visitParam_call(mathGrammarParser.Param_callContext ctx) {
        String args = "";
        if (ctx.arg_call() != null) {
            args = this.visit(ctx.arg_call());
        }
        return "(" + args + ");";
    }

    @Override
    public String visitParamCallArgs(mathGrammarParser.ParamCallArgsContext ctx) {
        String name = ctx.ID().getText();
        checkVariable(name);
        return name + ", " + this.visit(ctx.arg_call());
    }

    @Override
    public String visitParamCallArg(mathGrammarParser.ParamCallArgContext ctx) {
        String name = ctx.ID().getText();
        checkVariable(name);
        return name;
    }

    @Override
    public String visitParam(mathGrammarParser.ParamContext ctx) {
        String args = "";
        if (ctx.arg() != null) {
            args = this.visit(ctx.arg());
        }
        return "(" + args + ")";
    }

    @Override
    public String visitParamArgs(mathGrammarParser.ParamArgsContext ctx) {
        String type = ctx.type().getText();
        type = getStringWithFirstCapital(type);
        String name = ctx.ID().getText();
        addToLocalVariableList(name, Type.getTypeByString(type));
        return type + " " + name + ", " + this.visit(ctx.arg());
    }

    @Override
    public String visitParamArg(mathGrammarParser.ParamArgContext ctx) {
        String type = ctx.type().getText();
        type = getStringWithFirstCapital(type);
        String name = ctx.ID().getText();
        addToLocalVariableList(name, Type.getTypeByString(type));
        if (type.equals("Integer")) {
            return "int" + " " + name;
        } else return type + " " + name;
    }

    @Override
    public String visitAddSub(mathGrammarParser.AddSubContext ctx) {
        String left = visit(ctx.expr(0));  // get value of left subexpression
        String right = visit(ctx.expr(1)); // get value of right subexpression
        if (ctx.op.getType() == mathGrammarParser.ADD) return left + "+" + right;
        return left + "-" + right; // must be SUB
    }

    @Override
    public String visitUnary(mathGrammarParser.UnaryContext ctx) {
        String buff = visit(ctx.expr());
        if (ctx.op.getType() == mathGrammarParser.ADD) return "+" + buff;
        return "-" + buff;
    }

    @Override
    public String visitPowExpr(mathGrammarParser.PowExprContext ctx) {
        String left = visit(ctx.expr(0));  // get value of left subexpression
        String right = visit(ctx.expr(1)); // get value of right subexpression
        return left + "^" + right;
    }

    @Override
    public String visitAssignExpr(mathGrammarParser.AssignExprContext ctx) {
        String left = ctx.ID().getText();
        ;  // get value of left subexpression
        String right = visit(ctx.expr()); // get value of right subexpression
        return left + "=" + right + ";";
    }

    @Override
    public String visitPrim(mathGrammarParser.PrimContext ctx) {
        String buff = visit(ctx.expr());
        return "(" + buff + ")";
    }

    @Override
    public String visitModMulDiv(mathGrammarParser.ModMulDivContext ctx) {
        String left = visit(ctx.expr(0));  // get value of left subexpression
        String right = visit(ctx.expr(1)); // get value of right subexpression
        if (ctx.op.getType() == mathGrammarParser.MOD) return left + " %" + right;
        if (ctx.op.getType() == mathGrammarParser.MUL) return left + "*" + right;
        return left + "/" + right; // must be DIV
    }


    @Override
    public String visitFloatExpr(mathGrammarParser.FloatExprContext ctx) {
        String buff = this.visit(ctx.name_object_float());
        return buff + "f";
    }

    @Override
    public String visitIntExrp(mathGrammarParser.IntExrpContext ctx) {
        String buff = this.visit(ctx.name_object_int());
        return buff;
    }

    @Override
    public String visitIdExpr(mathGrammarParser.IdExprContext ctx) {
        String name = ctx.ID().getText();
        return name;
    }


    @Override
    public String visitTypeConversion(mathGrammarParser.TypeConversionContext ctx) {
        String type = "";
        String buffer = visit(ctx.expr());
        if (ctx.tp.getType() == mathGrammarParser.FLOAT_TYPE) type = "float";
        else type = "int";
        return "(" + type + ")" + buffer;
    }
}
