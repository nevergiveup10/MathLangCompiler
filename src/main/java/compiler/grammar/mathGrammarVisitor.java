// Generated from D:/BSUIR/3 курс/6 семестр/яѕ»—/compiler examples/compiler-master/src/main/java/compiler/grammar\mathGrammar.g4 by ANTLR 4.8

package compiler.grammar;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link mathGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface mathGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link mathGrammarParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(mathGrammarParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathGrammarParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(mathGrammarParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathGrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(mathGrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathGrammarParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(mathGrammarParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code call}
	 * labeled alternative in {@link mathGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(mathGrammarParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModMulDiv}
	 * labeled alternative in {@link mathGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModMulDiv(mathGrammarParser.ModMulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatExpr}
	 * labeled alternative in {@link mathGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatExpr(mathGrammarParser.FloatExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prim}
	 * labeled alternative in {@link mathGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrim(mathGrammarParser.PrimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link mathGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(mathGrammarParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intExrp}
	 * labeled alternative in {@link mathGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExrp(mathGrammarParser.IntExrpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeConversion}
	 * labeled alternative in {@link mathGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConversion(mathGrammarParser.TypeConversionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unary}
	 * labeled alternative in {@link mathGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(mathGrammarParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link mathGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpr(mathGrammarParser.PowExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link mathGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(mathGrammarParser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link mathGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(mathGrammarParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathGrammarParser#create}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate(mathGrammarParser.CreateContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathGrammarParser#create_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_int(mathGrammarParser.Create_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathGrammarParser#create_const_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_const_int(mathGrammarParser.Create_const_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathGrammarParser#create_float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_float(mathGrammarParser.Create_floatContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathGrammarParser#create_const_float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_const_float(mathGrammarParser.Create_const_floatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nameObjectInt}
	 * labeled alternative in {@link mathGrammarParser#name_object_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameObjectInt(mathGrammarParser.NameObjectIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nameObjectFloat}
	 * labeled alternative in {@link mathGrammarParser#name_object_float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameObjectFloat(mathGrammarParser.NameObjectFloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathGrammarParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(mathGrammarParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathGrammarParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(mathGrammarParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathGrammarParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(mathGrammarParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathGrammarParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(mathGrammarParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathGrammarParser#for_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stat(mathGrammarParser.For_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forCond}
	 * labeled alternative in {@link mathGrammarParser#condition_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCond(mathGrammarParser.ForCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link mathGrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(mathGrammarParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkType}
	 * labeled alternative in {@link mathGrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckType(mathGrammarParser.CheckTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathGrammarParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(mathGrammarParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printId}
	 * labeled alternative in {@link mathGrammarParser#print_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintId(mathGrammarParser.PrintIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printInt}
	 * labeled alternative in {@link mathGrammarParser#print_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintInt(mathGrammarParser.PrintIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printFloat}
	 * labeled alternative in {@link mathGrammarParser#print_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintFloat(mathGrammarParser.PrintFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pretty_print}
	 * labeled alternative in {@link mathGrammarParser#print_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPretty_print(mathGrammarParser.Pretty_printContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathGrammarParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(mathGrammarParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathGrammarParser#param_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_call(mathGrammarParser.Param_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramCallArg}
	 * labeled alternative in {@link mathGrammarParser#arg_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamCallArg(mathGrammarParser.ParamCallArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramCallArgs}
	 * labeled alternative in {@link mathGrammarParser#arg_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamCallArgs(mathGrammarParser.ParamCallArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code voidFunction}
	 * labeled alternative in {@link mathGrammarParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidFunction(mathGrammarParser.VoidFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnFunction}
	 * labeled alternative in {@link mathGrammarParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnFunction(mathGrammarParser.ReturnFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathGrammarParser#stat_block_with_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block_with_return(mathGrammarParser.Stat_block_with_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathGrammarParser#return_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_id(mathGrammarParser.Return_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathGrammarParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(mathGrammarParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramArg}
	 * labeled alternative in {@link mathGrammarParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamArg(mathGrammarParser.ParamArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramArgs}
	 * labeled alternative in {@link mathGrammarParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamArgs(mathGrammarParser.ParamArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(mathGrammarParser.TypeContext ctx);
}