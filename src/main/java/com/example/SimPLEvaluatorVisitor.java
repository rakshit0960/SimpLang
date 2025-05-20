package com.example;

import java.util.HashMap;
import java.util.Map;

public class SimPLEvaluatorVisitor extends SimPLBaseVisitor<Object> {
    private Map<String, Object> variables = new HashMap<>();

    @Override
    public Object visitProgram(SimPLParser.ProgramContext ctx) {
        Object lastValue = null;
        for (SimPLParser.StatementContext stmt : ctx.statement()) {
            lastValue = visit(stmt);
        }
        return lastValue;
    }

    @Override
    public Object visitVariableDeclaration(SimPLParser.VariableDeclarationContext ctx) {
        String name = ctx.ID().getText();
        Object value = null;

        if (ctx.expression() != null) {
            value = visit(ctx.expression());
        }

        variables.put(name, value);
        return value;
    }

    @Override
    public Object visitPrintStatement(SimPLParser.PrintStatementContext ctx) {
        Object value = visit(ctx.expression());
        System.out.println("Output: " + value);
        return value;
    }

    @Override
    public Object visitIdentifierExpr(SimPLParser.IdentifierExprContext ctx) {
        String name = ctx.ID().getText();
        if (!variables.containsKey(name)) {
            throw new RuntimeException("Variable not found: " + name);
        }
        return variables.get(name);
    }

    @Override
    public Object visitIntLiteral(SimPLParser.IntLiteralContext ctx) {
        return Integer.parseInt(ctx.INT_LITERAL().getText());
    }

    @Override
    public Object visitBooleanLiteral(SimPLParser.BooleanLiteralContext ctx) {
        return Boolean.parseBoolean(ctx.BOOLEAN_LITERAL().getText());
    }

    @Override
    public Object visitStringLiteral(SimPLParser.StringLiteralContext ctx) {
        String text = ctx.STRING_LITERAL().getText();
        return text.substring(1, text.length() - 1); // Remove quotes
    }

    @Override
    public Object visitAddSubExpr(SimPLParser.AddSubExprContext ctx) {
        Object left = visit(ctx.expression(0));
        Object right = visit(ctx.expression(1));

        if (left instanceof Integer && right instanceof Integer) {
            if (ctx.getChild(1).getText().equals("+")) {
                return (Integer)left + (Integer)right;
            } else {
                return (Integer)left - (Integer)right;
            }
        }
        throw new RuntimeException("Invalid operands for +/-: " + left + ", " + right);
    }
}