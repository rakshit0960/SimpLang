package com.example;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class App {
    public static void main(String[] args) throws Exception {
        String source = """
            var x: int = 5;
            print(x + 2);
            """;

        CharStream input = CharStreams.fromString(source);
        SimPLLexer lexer = new SimPLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        tokens.reset(); // Reset the tokens stream to start from the beginning

        SimPLParser parser = new SimPLParser(tokens);
        ParseTree tree = parser.program(); // 'program' is the start rule in your grammar

        // Create and run visitor
        SimPLEvaluatorVisitor visitor = new SimPLEvaluatorVisitor();
        visitor.visit(tree);
    }
}