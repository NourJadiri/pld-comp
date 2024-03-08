grammar ifcc;

axiom : prog EOF ;

prog : 'int' 'main' '(' ')' '{' stmts* return_stmt'}' ;



var_decl: 'int' (VAR',')*VAR ';' # simpleDeclaration
        ;

var_assign : 'int' VAR '=' (CONST | VAR) ';' # affectationWithDeclaration
           | VAR '=' (CONST | VAR) ';' # simpleAffectation
           ;

stmts : (var_decl | var_assign);
return_stmt: RETURN (CONST | VAR) ';' ;

RETURN : 'return' ;
CONST : [0-9]+ ;
VAR : [a-zA-Z_][a-zA-Z0-9_]* ;
COMMENT : '/*' .*? '*/' -> skip ;
DIRECTIVE : '#' .*? '\n' -> skip ;
WS    : [ \t\r\n] -> channel(HIDDEN);
