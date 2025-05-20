# SimPL Language Interpreter

SimPL (Simple Programming Language) is a lightweight, statically-typed programming language interpreter built using ANTLR4 and Java. This project demonstrates the implementation of a basic programming language with focus on readability and simplicity.

## Project Overview

SimPL is designed as an educational tool to understand language interpretation concepts including:
- Lexical analysis and parsing using ANTLR4
- Abstract Syntax Tree (AST) generation
- Visitor pattern for AST traversal and interpretation
- Type checking and variable management
- Runtime evaluation of expressions

## Architecture

The interpreter is structured into several key components:

1. **Lexer & Parser** (ANTLR4 Generated)
   - Tokenizes input code
   - Generates parse tree based on grammar rules
   - Handles syntax validation

2. **Visitor Implementation** (`SimPLEvaluatorVisitor.java`)
   - Traverses the parse tree
   - Manages variable scope and type checking
   - Executes program statements
   - Handles runtime operations

3. **Main Application** (`App.java`)
   - Handles file input processing
   - Orchestrates lexing, parsing, and interpretation
   - Manages program execution flow

## Features

- Variable declarations with types (int, boolean, string)
- Arithmetic operations (+, -, *, /, %)
- String concatenation
- Print statements
- Type checking
- Runtime error handling

## Usage

The interpreter reads code from a file named `test.simpl` in the current directory. To run the interpreter:

```bash
java -jar target/PlangInterpreter-1.0-SNAPSHOT-jar-with-dependencies.jar
```

Make sure you have a `test.simpl` file in the same directory before running the program.

## Example Program

Create a file named `test.simpl` with your SimPL code. For example:

```
var name: string = "World";
var count: int = 3;
print("Hello, " + name);
print(count * 2);
```

## Language Syntax

- Variable declaration: `var name: type = value;`
- Print statement: `print(expression);`
- Types: `int`, `boolean`, `string`
- Operators:
  - Arithmetic: `+`, `-`, `*`, `/`, `%`
  - String concatenation: `+`

## Development Setup

1. Prerequisites:
   - Java JDK 17 or higher
   - Maven
   - ANTLR4 Plugin

2. Build and run:
```bash
mvn clean package && java -jar target/PlangInterpreter-1.0-SNAPSHOT-jar-with-dependencies.jar
```

## Project Structure

```
PlangInterpreter/
├── src/
│   ├── main/
│   │   ├── antlr4/          # ANTLR4 grammar files
│   │   └── java/
│   │       └── com/
│   │           └── example/  # Java source files
│   └── test/                 # Test cases
├── pom.xml                   # Maven configuration
└── test.simpl               # Example input file
```

## Future Enhancements

Potential areas for expansion include:
- Control flow statements (if/else, loops)
- Function definitions and calls
- Advanced type system
- Standard library functions
- Error recovery and debugging tools
