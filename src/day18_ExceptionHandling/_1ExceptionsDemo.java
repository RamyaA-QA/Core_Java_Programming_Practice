package day18_ExceptionHandling;

import java.util.Scanner;

public class _1ExceptionsDemo {

	public static void main(String[] args) {

		System.out.println("Program is started");
		
		Scanner sc=new Scanner(System.in);
		
		//Example: 1  ArithmeticException
		/*
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		System.out.println(100/num);//java.lang.ArithmeticException
		
		System.out.println("Program is completed");
		System.out.println("Program is exited");
		*/
		
		// Example:2  ArrayIndexOutOfBoundsException
		
		/*
		int a[]=new int[5];
		
		System.out.println("Enter the position (0-4):");
		int pos=sc.nextInt();
		
		System.out.println("Enter a value:");
		int value=sc.nextInt();
		
		a[pos]=value;
		
		System.out.println(a[pos]); //java.lang.ArrayIndexOutOfBoundsException
		*/
		
		//Example:3  NumberFormatException
		
		/*
		
		String s="Ramya";
		int num=Integer.parseInt(s);
		System.out.println(num); // java.lang.NumberFormatException
		
		System.out.println("Program is completed");
		System.out.println("Program is exited");
		
		*/
		
		// Example:4   NullPointerException
		
		String s1=null;
		System.out.println(s1.length()); //java.lang.NullPointerException
		
		System.out.println("Program is completed");
		System.out.println("Program is exited");
	}

}
