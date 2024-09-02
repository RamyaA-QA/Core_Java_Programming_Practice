package day3_Operators;
/*
 * Opeartor: is a symbol which will perform an operation.
 * Types of operators:
 * 		1. Arithmetic Opeartors: _,-,*,/,%
 * 		2. Relational/comparision Operators: <,>,<=,>=,==,!=
 * 		3. Logical operators: &&, ||, !
 * 		4. Increment/Decrement Operators: ++, --
 * 		5. Assignment Operators: =, +=, -=,*=, /=,%=
 * 		6. Conditional/ternary operator: ?:
 * 
 * Unary Operators: ++	--	+=	-=	*=	/=	=	!
 * Binary Operators: +	-	*	/	%	>	>=	<	<=	!=	==	&&	||
 * Ternary Operators: ?:
 */

public class _1AssignmentOperators {

	public static void main(String[] args) {
		
		// Assignment =   +=  -=  *=  /=  %=
		
		int a=10;
		a=a+5;
		System.out.println(a);
		
		int b=10;
		b-=5;
		System.out.println(b);
		
		int c=10;
		c*=2;
		System.out.println(c);
		
		int d=10;
		d=d/2;
		System.out.println(d);
		
		int e=20;
		e=e%2;
		System.out.println(e);
		

	}

}
