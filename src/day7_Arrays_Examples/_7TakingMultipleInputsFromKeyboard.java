package day7_Arrays_Examples;

import java.util.Scanner;

public class _7TakingMultipleInputsFromKeyboard {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		/*System.out.println("Enter first Number:");
		int num1=sc.nextInt();
		
		System.out.println("Enter second Number:");
		int num2=sc.nextInt();
		
		System.out.println("Addition of two numbers:"+(num1+num2));
		*/
		
		System.out.println("Enter Name:");
		String name=sc.next();
		System.out.println("Your name is:" +name);
		
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		System.out.println("Your age is:" +age);
		
		System.out.println("Enter unknown value:");
		Object value=sc.next();
		System.out.println("Unknown value is:" +value);
	}

}
