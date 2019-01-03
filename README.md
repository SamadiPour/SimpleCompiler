# SimpleCompiler
JAVAFX SimpleCompiler Project


![Alt Text](https://i.ibb.co/GvypqtG/screenshot.png)


Sample input:
```
a = 1;
for (b = 2 : 10){
  a = a * b + 2;
  print a;
}
```

Grammer:
```
program: statements ;

statements: (statement)+ ;

statement: identifier = expr;
        | { statements }
        | 'if' ( expr ) statement
        | 'if' ( expr ) statement 'else' statement
        | 'while' ( expr ) statement
        | 'for' ( identifier = number : number ) statement
        | 'print' identifier;
        ;
		
expr: expr binop expr
		| '!' expr
		| opneParan expr closeParan
		| identifier
		| number
		| boolea
		| complexExp
		; 

complexExp	: div_multi ( plus_minusOP div_multi )* ;
div_multi	: pow  ( div_multiOP pow )* ;
pow 		: fact ( power fact )* ;
fact		: ( complexExp )
				| identifier
				| number
				;

plus_minusOP : '+' | '-'; 
div_multiOP  : '/' | '*';
power		 : '^' ;
binop 		 : '<' | '>' | '<=' | '>='  | '==' | '!=' ;

```


thanks to @Benny Coder on youtube for UI and dragger code :smile:
