package day11_Constructor;
/*
 * Method: Block or group of statements which will perform certain task.
 * 			We have to call the method through object.
 * 
 * 1. No params			No return value
 * 2. No params			return value
 * 3. Takes params		No return value
 * 4. Takes params		return value
 * 
 * How many ways we can store data into variables?
 * 
 * 		1. By using object reference variable
 * 		2. Method
 * 		3. Constructor
 * 
 * Method:
 * 1. Method name can be anything
 * 2. Method may or maynot return a value
 * 3. If method not return any value then specify void
 * 4.
 */


public class ConstructorDemo {
	
	int x,y;
	
	ConstructorDemo()// default constructor
	{
		x=100;
		y=200;
	}

	ConstructorDemo(int a, int b)// Parameterised constructor
	{
		x=a;
		y=b;
	}
	
	void sum()
	{
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		//ConstructorDemo cd=new ConstructorDemo();
		
		ConstructorDemo cd=new ConstructorDemo(10,20);
		cd.sum();
	}
}
