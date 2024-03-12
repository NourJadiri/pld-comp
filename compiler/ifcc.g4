grammar ifcc;

axiom : prog EOF ;

prog : 'int' 'main' '(' ')' '{' stmt* return_stmt'}' ;

stmt : var_decl_stmt
        | var_assign_stmt
        | return_stmt;

var_decl_stmt : TYPE ID ';' ;
var_assign_stmt : ID '=' expr ';' ;

expr : term ; 

term : factor;

factor : CONST #const
        | ID #id
        | '(' expr ')' #parenthesis
        ;

return_stmt : RETURN expr ';' ;

TYPE : INT | CHAR | FLOAT | DOUBLE ;

INT : 'int' ;
CHAR : 'char' ;
FLOAT : 'float' ;
DOUBLE : 'double' ;

RETURN : 'return' ;
CONST : [0-9]+ ;
ID : [a-zA-Z_][a-zA-Z0-9_]* ;
COMMENT : '/*' .*? '*/' -> skip ;
DIRECTIVE : '#' .*? '\n' -> skip ;
WS    : [ \t\r\n] -> channel(HIDDEN);
