package com.example;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.*;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        CharStream input;

        try {
            String source = Files.readString(Paths.get("test.simpl"));
            input = CharStreams.fromString(source);
        } catch (IOException e) {
            System.err.println("Error reading test.simpl file: " + e.getMessage());
            System.err.println("Please ensure test.simpl exists in the current directory.");
            return;
        }

        SimPLLexer lexer = new SimPLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        tokens.reset(); // Reset the tokens stream to start from the beginning

        SimPLParser parser = new SimPLParser(tokens);
        ParseTree tree = parser.program(); // 'program' is the start rule in your grammar

        // Print Parse Tree
        // System.out.println("\nParse Tree (Lisp format):");
        // System.out.println(tree.toStringTree(parser));

        // Create and run visitor
        SimPLEvaluatorVisitor visitor = new SimPLEvaluatorVisitor();
        visitor.visit(tree);
    }
}