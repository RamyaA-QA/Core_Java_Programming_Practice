package day5_Control_Statements;

/*
 * Which loop is preferred to use:
 * 
 * 1. If you know the number of iterations in advance, the for loop is often the most suitable.
 * 2. If you want to execute the loop atleast once, the do-while loop is appropriate.
 * 3. If you are uncertain about the number of iterations and the loop termination is based on a condition, the while loop is a good choice.
 * 
 * Ex:
 * Bike: Source, Destination, fuel - For loop
 * Bus: Do while
 * Flight: While
 * 
 * Control Statements:
 * 
 * 1. Conditional statements: if, if-else, Nested if else, switch case
 * 2. Looping/Iterative statements: while, do-while,for loop
 * 3. Jumping statements: Break, Continue
 */

public class _1WhileLoop {

	public static void main(String[] args) {
		
		// Print 1 to 10 numbers
		
		int i=1; //Initialization
		
		while(i<=10) // Condition
		{
			System.out.println(i);
			i++; // Increment
		}
		
		// Print Hello message 10 times
		
		int j=1;
		
		while(j<=10)
		{
			System.out.println("Hello");
			j++;
		}
		
		// Print even numbers between 1 to 10 numbers - Approach1
		
		int k=2;
		
		while(k<=10)
		{
			System.out.println(k);
			k=k+2;
		}
		
		// Print even numbers between 1 to 10 numbers - Approach2
		
		int x=2;
		
		while(x<=10)
		{
			if(x%2==0)
			{
			System.out.println(x);
			}
			x++;
		}
		
		// Print combination of even and odd numbers
		
		int y=1;
		
		while(y<=10)
		{
			if(y%2==0)
			{
				System.out.println("Even:" +y);
			}
			else
			{
				System.out.println("Odd:"+y);
			}
			y++;
		}
		
		// Print 10 to 1 numbers
		
		int z=10;
		
		while(z>0)
		{
			System.out.println(z);
			z--;
		}
	}

}
