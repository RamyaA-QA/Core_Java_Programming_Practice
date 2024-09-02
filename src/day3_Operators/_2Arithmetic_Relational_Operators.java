package day3_Operators;

public class _2Arithmetic_Relational_Operators {

	public static void main(String[] args) {
		
		// Arithmetic operators + - * / %
		
		int a=20, b=10;
		
		System.out.println("Sum of A and B is:" +(a+b));
		System.out.println("Diff of A and B is:" +(a-b));
		System.out.println("Multiplication of A and B is:" +(a*b));
		System.out.println("Division of A and B is:" +(a/b));
		System.out.println("Modulo division of A and B is:" +(a%b));
		
		// Relational/comparision opeartors >  >=  <  <=  !=  ==
		// Returns boolean value true/false
		
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<b);
		System.out.println(a<=b);
		
		b=20;
		System.out.println(a<=b);
		System.out.println(a>=b);
		
		System.out.println(a!=b);
		System.out.println(a==b);
		
		boolean res=a>b;
		System.out.println(res);
		
		// Logical operators  &&  ||  !
		// Returns boolean value - true/false
		// Works between 2 boolean values
		
		boolean x=true;
		boolean y=false;
		
		System.out.println(x && y);
		System.out.println(x||y);
		System.out.println(!x);
		System.out.println(!y);
		
		boolean b1=10>20;
		System.out.println(b1);
		
		boolean b2=20>10;
		System.out.println(b2);
		
		System.out.println(b1 && b2);
		System.out.println(b1 || b2);
		
	}

}
