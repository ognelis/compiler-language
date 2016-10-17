grammar MyLang;

file    :   (declaration | funDeclaration)+
        ;

declaration
        : 'val'     valDeclaration
        | 'var'     varDeclaration
        ;


varDeclaration
        :  ID ':' typeDeclaration ('=' expression)? ';'
        ;

valDeclaration
        :  ID ':' typeDeclaration ('=' expression)? ';'
        ;

hashTable
        : '[' ('bool' | 'string' | 'float' | 'int') ',' ('bool' | 'string' | 'float' | 'int') ']'
        ;

typeDeclaration
        :  typeDeclaration '[' INT ']' | hashTable | 'bool' | 'string' | 'float' | 'int' | 'void';

INT
        : DIGIT+
        ;

FLOAT
        : DIGIT+ '.' DIGIT*
        | '.' DIGIT+
        ;

STRING
        : '\'' LETTER+ '\''
        ;

BOOL
        : 'true' | 'false'
        ;

funDeclaration
        : 'def'  ID '('formalParameters?')' ':' typeDeclaration block
        ;

formalParameters
        :   formalParameter (',' formalParameter)*
        ;

formalParameter
        :  ID ':' typeDeclaration
        ;

block
        :  '{' statement* '}'
        ;

statement
        :   block
        |   declaration
        |   IF '('expression')' statement (ELSE statement)?
        |   WHILE '(' expression ')' statement
        |   RETURN expression? ';'
        |   expression '=' expression  ';'
        |   expression ';'
        ;



expression
        :   ID '(' expressionList? ')'
        |   expression '[' expression ']'
        |   expression ('==' | '!=') expression
        |   expression ('<' | '<=' | '>' | '>=') expression
        |   '-' expression
        |   '!' expression
        |   expression '&&' expression
        |   expression '||' expression
        |   expression ('*' | '/') expression
        |   expression ('+' | '-') expression
        |   ID
        |   INT
        |   FLOAT
        |   STRING
        |   BOOL
        |   '(' expression ')'
        ;


IF      : 'if';
ELSE    : 'else';
WHILE   : 'while';
RETURN  : 'return';


expressionList
        :   expression (',' expression)*;

ID      : LETTER (LETTER | [0-9])*;
fragment
LETTER  :   [a-zA-Z_];
DIGIT   :   [0-9]+;
WS      :   [ \t\n\r]+ -> skip ;

SL_COMMENT
        :   '//' .*? '\n' -> skip
        ;

