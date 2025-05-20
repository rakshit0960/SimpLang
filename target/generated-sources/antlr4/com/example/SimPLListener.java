// Generated from com/example/SimPL.g4 by ANTLR 4.13.1
package com.example;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimPLParser}.
 */
public interface SimPLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimPLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SimPLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimPLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SimPLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimPLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SimPLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimPLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SimPLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimPLParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(SimPLParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimPLParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(SimPLParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimPLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SimPLParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimPLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SimPLParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimPLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SimPLParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimPLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SimPLParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimPLParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(SimPLParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimPLParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(SimPLParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimPLParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(SimPLParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimPLParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(SimPLParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimPLParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(SimPLParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimPLParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(SimPLParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimPLParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(SimPLParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimPLParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(SimPLParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimPLParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(SimPLParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimPLParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(SimPLParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimPLParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(SimPLParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimPLParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(SimPLParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimPLParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(SimPLParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimPLParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(SimPLParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimPLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SimPLParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimPLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SimPLParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimPLParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(SimPLParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimPLParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(SimPLParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimPLParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(SimPLParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimPLParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(SimPLParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link SimPLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(SimPLParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link SimPLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(SimPLParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallExpr}
	 * labeled alternative in {@link SimPLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpr(SimPLParser.FunctionCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallExpr}
	 * labeled alternative in {@link SimPLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpr(SimPLParser.FunctionCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link SimPLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(SimPLParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link SimPLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(SimPLParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityExpr}
	 * labeled alternative in {@link SimPLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(SimPLParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityExpr}
	 * labeled alternative in {@link SimPLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(SimPLParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link SimPLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpr(SimPLParser.ComparisonExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link SimPLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpr(SimPLParser.ComparisonExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link SimPLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpr(SimPLParser.IdentifierExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link SimPLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpr(SimPLParser.IdentifierExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link SimPLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpr(SimPLParser.LiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link SimPLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpr(SimPLParser.LiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link SimPLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(SimPLParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link SimPLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(SimPLParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link SimPLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(SimPLParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link SimPLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(SimPLParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link SimPLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(SimPLParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link SimPLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(SimPLParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link SimPLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(SimPLParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link SimPLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(SimPLParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegateExpr}
	 * labeled alternative in {@link SimPLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNegateExpr(SimPLParser.NegateExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegateExpr}
	 * labeled alternative in {@link SimPLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNegateExpr(SimPLParser.NegateExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link SimPLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(SimPLParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link SimPLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(SimPLParser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link SimPLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(SimPLParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link SimPLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(SimPLParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link SimPLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(SimPLParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link SimPLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(SimPLParser.StringLiteralContext ctx);
}