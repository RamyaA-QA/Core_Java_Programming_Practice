package day3_Operators;

public class SwappingOfTwoNumbers {
	public static void main(String[] args) {
		
		int a=10, b=20;
		
		System.out.println("Before swapping values are:"+a+" "+b);
		
		// Approach1 : Using third variable
		
		/*int c=a; // c=10
		a=b; //10=20
		b=c; //20=10
		*/
		
		// Approach2: Use + and - without using third variable
		/*a=a+b; // a=10+20=30; a=30
		b=a-b; // b=30-20=10; b=10
		a=a-b; // a=30-10 =20
		*/
		
		//Approach3: Use * and / without using third variable
		// Here, a and b values should not be zero
		
		/*a=a*b; // a=10*20=200
		b=a/b;   //b=200/20=10
		a=a/b;   //a=200/10=20
		*/
		
		//Approach4: bitwise XOR (^)
		
		/*a=a^b; // a=10^20 =30
		b=a^b; // b=30^20=10
		a=a^b; // a=30^10=20
		*/
		
		//Approach5: Single statement
		b=a+b-(a=b); // b=30-20=10
		System.out.println("After swapping values are:"+a+" "+b);
		
		
	}
	
}


