
grammar HTPL;

parse
 : MAIN_TAG_START block MAIN_TAG_END EOF
 ;


block
 : ( statement | functionDecl )* ( Return expression ';' )?
 ;


functionDecl
: '<' Identifier  functionParam? '>' block '<' '/' Identifier '>'
;

functionParam
: idList?
;

idList
: Identifier ( ',' Identifier )*
;

statement
 : assignment
 | functionCall
 | ifStatement
 | repeatStatement
 ;


 repeatStatement
 :  repeatFixed
 |  repeatWithVar
 |  repeatWhile
 ;

repeatWhile
: '<' 'repeat' 'while' expression '>' block '<' '/' 'repeat' '>'
;

repeatWithVar
: '<' 'repeat' Identifier repeatFrom repeatTo repeatStep?'>' block '<' '/' 'repeat' '>'
;

repeatFrom
: ',' expression
;

repeatTo
: ',' expression
;

repeatStep
: ',' expression
;



repeatFixed
:   '<' 'repeat' expression '>' block '<' '/' 'repeat' '>'
;


assignment
 : '<' Identifier indexes? '=' expression '/' '>'
 ;


ifStatement
 : ifStat elseIfStat* elseStat?
 ;

ifStat
 : '<if'  expression  '>' block '</if>'
 ;

elseIfStat
 : '<elif'  expression  '>' block  '</elif>'
 ;

elseStat
 : '<else>'  block '</else>'
 ;

functionCall
 : '<' Identifier  exprList? '/' '>' #identifierFunctionCall
 | '<' OUT  expression  '/' '>'      #printFunctionCall
 | '<' Assert  expression  '/' '>'    #assertFunctionCall
 | '<' Size  expression '/' '>'       #sizeFunctionCall
 | '<' INPUT  expression '/' '>'       #takeInputFunctionCall
 ;



expression
 : '-' expression                                       #unaryMinusExpression
 | '!' expression                                       #notExpression
 | <assoc=right> expression '^' expression              #powerExpression
 | expression op=( '*' | '/' | '%' ) expression         #multExpression
 | expression op=( '+' | '-' ) expression               #addExpression
 | expression op=( '>=' | '<=' | '>' | '<' ) expression #compExpression
 | expression op=( '==' | '!=' ) expression             #eqExpression
 | expression '&&' expression                           #andExpression
 | expression '||' expression                           #orExpression
 | expression '?' expression ':' expression             #ternaryExpression
 | expression In expression                             #inExpression
 | Number                                               #numberExpression
 | Bool                                                 #boolExpression
 | Null                                                 #nullExpression
 | functionCall indexes?                                #functionCallExpression
 | list indexes?                                        #listExpression
 | Identifier indexes?                                  #identifierExpression
 | String indexes?                                      #stringExpression
 | '(' expression ')' indexes?                          #expressionExpression
 ;



indexes
 : ( '[' expression ']' )+
 ;

list
: '[' exprList? ']'
;

exprList
: expression ( ',' expression )*
;



MAIN_TAG_START : '<' 'htpl' '>';
MAIN_TAG_END : '<' '/' 'htpl' '>';
OUT: 'out';
INPUT : 'inp';
Null   : 'null';
Return : 'return';
Assert: 'assert';
Size: 'size';
In : 'in';

Or       : '||';
And      : '&&';
Equals   : '==';
NEquals  : '!=';
GTEquals : '>=';
LTEquals : '<=';
Pow      : '^';
Excl     : '!';
GT       : '>';
LT       : '<';
Add      : '+';
Subtract : '-';
Multiply : '*';
Divide   : '/';
Modulus  : '%';
OBrace   : '{';
CBrace   : '}';
OBracket : '[';
CBracket : ']';
OParen   : '(';
CParen   : ')';
SColon   : ';';
Assign   : '=';
Comma    : ',';
QMark    : '?';
Colon    : ':';






Bool
 : 'true'
 | 'false'
 ;

Number
 : Int ( '.' Digit* )?
 ;

Identifier
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;

String
 : ["] ( ~["\r\n\\] | '\\' ~[\r\n] )* ["]
 | ['] ( ~['\r\n\\] | '\\' ~[\r\n] )* [']
 ;
Comment
 : ( '//' ~[\r\n]* | '<!--' .*? '-->' ) -> skip
 ;
Space
 : [ \t\r\n\u000C] -> skip
 ;
fragment Int
 : [1-9] Digit*
 | '0'
 ;

fragment Digit
 : [0-9]
 ;



