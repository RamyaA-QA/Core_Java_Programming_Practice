package day4_Conditions;

import java.util.Scanner;

public class _9LargestOf3Numbers {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Number:");
		int a=sc.nextInt();
		
		System.out.println("Enter Second Number:");
		int b=sc.nextInt();
		
		System.out.println("Enter Third Number:");
		int c=sc.nextInt();
		
		//Approach1
		/*
		if(a>b && a>c)
		{
			System.out.println(a+ " is largest number");
		}
		
		if(b>a && b>c)
		{
			System.out.println(b+ " is largest number");
		}
		
		else
		{
			System.out.println(c+ " is largest number");
		}
		*/
		
		//Approach2 - Ternary operator
		
		//int largest1=a>b?a:b; // Largest of a and b
		//int largest2=c>largest1?c:largest1; // Largest of c and largest1
		
		int largest=c>(a>b?a:b)?c:(a>b?a:b);
		
		System.out.println(largest +" is largest number");
		

	}

}
