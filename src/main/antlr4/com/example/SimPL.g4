grammar SimPL;
// Parser Rules
program: statement* EOF;

statement:
	variableDeclaration
	| assignment
	| printStatement
	| ifStatement
	| whileStatement
	| blockStatement
	| functionDeclaration
	| functionCall ';'
	| returnStatement;

variableDeclaration: 'var' ID (':' type)? ('=' expression)? ';';

type: 'int' | 'boolean' | 'string' | 'void';

assignment: ID '=' expression ';';

printStatement: 'print' '(' expression ')' ';';

ifStatement:
	'if' '(' expression ')' statement ('else' statement)?;

whileStatement: 'while' '(' expression ')' statement;

blockStatement: '{' statement* '}';

functionDeclaration:
	'function' ID '(' parameterList? ')' (':' type)? blockStatement;

parameterList: parameter (',' parameter)*;

parameter: ID ':' type;

functionCall: ID '(' argumentList? ')';

argumentList: expression (',' expression)*;

returnStatement: 'return' expression? ';';

expression:
	literal												# LiteralExpr
	| ID												# IdentifierExpr
	| functionCall										# FunctionCallExpr
	| '(' expression ')'								# ParenExpr
	| expression ('*' | '/' | '%') expression			# MulDivExpr
	| expression ('+' | '-') expression					# AddSubExpr
	| expression ('<' | '>' | '<=' | '>=') expression	# ComparisonExpr
	| expression ('==' | '!=') expression				# EqualityExpr
	| expression '&&' expression						# AndExpr
	| expression '||' expression						# OrExpr
	| '!' expression									# NotExpr
	| '-' expression									# NegateExpr;

literal:
	INT_LITERAL			# IntLiteral
	| BOOLEAN_LITERAL	# BooleanLiteral
	| STRING_LITERAL	# StringLiteral;

// Lexer Rules
INT_LITERAL: [0-9]+;
BOOLEAN_LITERAL: 'true' | 'false';
STRING_LITERAL: '"' (~["\r\n] | '\\"')* '"';

ID: [a-zA-Z_][a-zA-Z0-9_]*;
WS: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[\r\n]* -> skip;
MULTILINE_COMMENT: '/*' .*? '*/' -> skip;