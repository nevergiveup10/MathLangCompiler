// Generated from D:/BSUIR/3 курс/6 семестр/яѕ»—/compiler examples/compiler-master/src/main/java/compiler/grammar\mathGrammar.g4 by ANTLR 4.8

package compiler.grammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mathGrammarParser}.
 */
public interface mathGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mathGrammarParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(mathGrammarParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link mathGrammarParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(mathGrammarParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link mathGrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(mathGrammarParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link mathGrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(mathGrammarParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link mathGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(mathGrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link mathGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(mathGrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link mathGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(mathGrammarParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mathGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(mathGrammarParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code call}
	 * labeled alternative in {@link mathGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCall(mathGrammarParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code call}
	 * labeled alternative in {@link mathGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCall(mathGrammarParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModMulDiv}
	 * labeled alternative in {@link mathGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterModMulDiv(mathGrammarParser.ModMulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModMulDiv}
	 * labeled alternative in {@link mathGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitModMulDiv(mathGrammarParser.ModMulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatExpr}
	 * labeled alternative in {@link mathGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFloatExpr(mathGrammarParser.FloatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatExpr}
	 * labeled alternative in {@link mathGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFloatExpr(mathGrammarParser.FloatExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prim}
	 * labeled alternative in {@link mathGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPrim(mathGrammarParser.PrimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prim}
	 * labeled alternative in {@link mathGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPrim(mathGrammarParser.PrimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link mathGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(mathGrammarParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link mathGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(mathGrammarParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intExrp}
	 * labeled alternative in {@link mathGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntExrp(mathGrammarParser.IntExrpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intExrp}
	 * labeled alternative in {@link mathGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntExrp(mathGrammarParser.IntExrpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeConversion}
	 * labeled alternative in {@link mathGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTypeConversion(mathGrammarParser.TypeConversionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeConversion}
	 * labeled alternative in {@link mathGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTypeConversion(mathGrammarParser.TypeConversionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unary}
	 * labeled alternative in {@link mathGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary(mathGrammarParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary}
	 * labeled alternative in {@link mathGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary(mathGrammarParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link mathGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(mathGrammarParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link mathGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(mathGrammarParser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link mathGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(mathGrammarParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link mathGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(mathGrammarParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link mathGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(mathGrammarParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link mathGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(mathGrammarParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link mathGrammarParser#create}.
	 * @param ctx the parse tree
	 */
	void enterCreate(mathGrammarParser.CreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link mathGrammarParser#create}.
	 * @param ctx the parse tree
	 */
	void exitCreate(mathGrammarParser.CreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link mathGrammarParser#create_int}.
	 * @param ctx the parse tree
	 */
	void enterCreate_int(mathGrammarParser.Create_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link mathGrammarParser#create_int}.
	 * @param ctx the parse tree
	 */
	void exitCreate_int(mathGrammarParser.Create_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link mathGrammarParser#create_const_int}.
	 * @param ctx the parse tree
	 */
	void enterCreate_const_int(mathGrammarParser.Create_const_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link mathGrammarParser#create_const_int}.
	 * @param ctx the parse tree
	 */
	void exitCreate_const_int(mathGrammarParser.Create_const_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link mathGrammarParser#create_float}.
	 * @param ctx the parse tree
	 */
	void enterCreate_float(mathGrammarParser.Create_floatContext ctx);
	/**
	 * Exit a parse tree produced by {@link mathGrammarParser#create_float}.
	 * @param ctx the parse tree
	 */
	void exitCreate_float(mathGrammarParser.Create_floatContext ctx);
	/**
	 * Enter a parse tree produced by {@link mathGrammarParser#create_const_float}.
	 * @param ctx the parse tree
	 */
	void enterCreate_const_float(mathGrammarParser.Create_const_floatContext ctx);
	/**
	 * Exit a parse tree produced by {@link mathGrammarParser#create_const_float}.
	 * @param ctx the parse tree
	 */
	void exitCreate_const_float(mathGrammarParser.Create_const_floatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nameObjectInt}
	 * labeled alternative in {@link mathGrammarParser#name_object_int}.
	 * @param ctx the parse tree
	 */
	void enterNameObjectInt(mathGrammarParser.NameObjectIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nameObjectInt}
	 * labeled alternative in {@link mathGrammarParser#name_object_int}.
	 * @param ctx the parse tree
	 */
	void exitNameObjectInt(mathGrammarParser.NameObjectIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nameObjectFloat}
	 * labeled alternative in {@link mathGrammarParser#name_object_float}.
	 * @param ctx the parse tree
	 */
	void enterNameObjectFloat(mathGrammarParser.NameObjectFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nameObjectFloat}
	 * labeled alternative in {@link mathGrammarParser#name_object_float}.
	 * @param ctx the parse tree
	 */
	void exitNameObjectFloat(mathGrammarParser.NameObjectFloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link mathGrammarParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(mathGrammarParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link mathGrammarParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(mathGrammarParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link mathGrammarParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(mathGrammarParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link mathGrammarParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(mathGrammarParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link mathGrammarParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(mathGrammarParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link mathGrammarParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(mathGrammarParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link mathGrammarParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(mathGrammarParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link mathGrammarParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(mathGrammarParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link mathGrammarParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void enterFor_stat(mathGrammarParser.For_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link mathGrammarParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void exitFor_stat(mathGrammarParser.For_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forCond}
	 * labeled alternative in {@link mathGrammarParser#condition_for}.
	 * @param ctx the parse tree
	 */
	void enterForCond(mathGrammarParser.ForCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forCond}
	 * labeled alternative in {@link mathGrammarParser#condition_for}.
	 * @param ctx the parse tree
	 */
	void exitForCond(mathGrammarParser.ForCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link mathGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(mathGrammarParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link mathGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(mathGrammarParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code checkType}
	 * labeled alternative in {@link mathGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCheckType(mathGrammarParser.CheckTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code checkType}
	 * labeled alternative in {@link mathGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCheckType(mathGrammarParser.CheckTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mathGrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(mathGrammarParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link mathGrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(mathGrammarParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printId}
	 * labeled alternative in {@link mathGrammarParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrintId(mathGrammarParser.PrintIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printId}
	 * labeled alternative in {@link mathGrammarParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrintId(mathGrammarParser.PrintIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printInt}
	 * labeled alternative in {@link mathGrammarParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrintInt(mathGrammarParser.PrintIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printInt}
	 * labeled alternative in {@link mathGrammarParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrintInt(mathGrammarParser.PrintIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printFloat}
	 * labeled alternative in {@link mathGrammarParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrintFloat(mathGrammarParser.PrintFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printFloat}
	 * labeled alternative in {@link mathGrammarParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrintFloat(mathGrammarParser.PrintFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pretty_print}
	 * labeled alternative in {@link mathGrammarParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void enterPretty_print(mathGrammarParser.Pretty_printContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pretty_print}
	 * labeled alternative in {@link mathGrammarParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void exitPretty_print(mathGrammarParser.Pretty_printContext ctx);
	/**
	 * Enter a parse tree produced by {@link mathGrammarParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(mathGrammarParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link mathGrammarParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(mathGrammarParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link mathGrammarParser#param_call}.
	 * @param ctx the parse tree
	 */
	void enterParam_call(mathGrammarParser.Param_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link mathGrammarParser#param_call}.
	 * @param ctx the parse tree
	 */
	void exitParam_call(mathGrammarParser.Param_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramCallArg}
	 * labeled alternative in {@link mathGrammarParser#arg_call}.
	 * @param ctx the parse tree
	 */
	void enterParamCallArg(mathGrammarParser.ParamCallArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramCallArg}
	 * labeled alternative in {@link mathGrammarParser#arg_call}.
	 * @param ctx the parse tree
	 */
	void exitParamCallArg(mathGrammarParser.ParamCallArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramCallArgs}
	 * labeled alternative in {@link mathGrammarParser#arg_call}.
	 * @param ctx the parse tree
	 */
	void enterParamCallArgs(mathGrammarParser.ParamCallArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramCallArgs}
	 * labeled alternative in {@link mathGrammarParser#arg_call}.
	 * @param ctx the parse tree
	 */
	void exitParamCallArgs(mathGrammarParser.ParamCallArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code voidFunction}
	 * labeled alternative in {@link mathGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void enterVoidFunction(mathGrammarParser.VoidFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code voidFunction}
	 * labeled alternative in {@link mathGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void exitVoidFunction(mathGrammarParser.VoidFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnFunction}
	 * labeled alternative in {@link mathGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void enterReturnFunction(mathGrammarParser.ReturnFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnFunction}
	 * labeled alternative in {@link mathGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void exitReturnFunction(mathGrammarParser.ReturnFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mathGrammarParser#stat_block_with_return}.
	 * @param ctx the parse tree
	 */
	void enterStat_block_with_return(mathGrammarParser.Stat_block_with_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link mathGrammarParser#stat_block_with_return}.
	 * @param ctx the parse tree
	 */
	void exitStat_block_with_return(mathGrammarParser.Stat_block_with_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link mathGrammarParser#return_id}.
	 * @param ctx the parse tree
	 */
	void enterReturn_id(mathGrammarParser.Return_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link mathGrammarParser#return_id}.
	 * @param ctx the parse tree
	 */
	void exitReturn_id(mathGrammarParser.Return_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link mathGrammarParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(mathGrammarParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link mathGrammarParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(mathGrammarParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramArg}
	 * labeled alternative in {@link mathGrammarParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterParamArg(mathGrammarParser.ParamArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramArg}
	 * labeled alternative in {@link mathGrammarParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitParamArg(mathGrammarParser.ParamArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramArgs}
	 * labeled alternative in {@link mathGrammarParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterParamArgs(mathGrammarParser.ParamArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramArgs}
	 * labeled alternative in {@link mathGrammarParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitParamArgs(mathGrammarParser.ParamArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link mathGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(mathGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mathGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(mathGrammarParser.TypeContext ctx);
}