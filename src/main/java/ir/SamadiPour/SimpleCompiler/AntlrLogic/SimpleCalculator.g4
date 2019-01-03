grammar SimpleCalculator;

program: statements ;

statements: (statement)+ ;

statement: identifier equal expr semicolon                                				#assignment
        | openBracket statements closeBracket                              				#beginend
        | 'if' opneParan expr closeParan statement                        	  			#if
        | 'if' opneParan expr closeParan statement 'else' statement          			#ifelse
        | 'while' opneParan expr closeParan statement                          			#while
        | 'for' opneParan identifier equal number colon number closeParan statement 	#for
        | 'print' identifier semicolon                                 					#print 
        ;
		
expr: expr binop expr                                            	#binopr
		| '!' expr                                                  #not
		| opneParan expr closeParan                                 #paranthesis
		| identifier                                                #id
		| number                                                    #num
		| boolea                                                    #bool
		| complexExp 							 					#complexExpr 
		; 
	
complexExp	: div_multi ( plus_minusOP div_multi )* ;                             
div_multi	: pow  ( div_multiOP pow )* ;			         
pow 		: fact ( power fact )* ;					 
fact		: opneParan complexExp closeParan						 #paran
				| identifier										 #idd
				| number											 #numm
				;
	

openBracket	 : '{';
closeBracket : '}';
opneParan	 : '(';
closeParan	 : ')';
semicolon	 : ';';
equal 		 : '=';
colon 		 : ':';
	
	
plus_minusOP : '+' | '-'; 
div_multiOP  : '/' | '*';
power		 : '^' ;
binop 		 : '<' | '>' | '<=' | '>='  | '==' | '!=' ; 
number 		 : ('+' | '-')? DIGITS ('.' DIGITS)? ;
identifier 	 : ALPHABET ('_' | ALPHABET | DIGITS)* ;
boolea 		 : 'true' | 'false' ;
DIGITS 		 : [0-9]+ ;
ALPHABET 	 : [a-zA-Z] ;
ALPHABETS	 : [a-zA-Z]+ ;

WS: [ \t\r\n] -> channel(HIDDEN) ;