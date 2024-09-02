package day4_Conditions;

import java.util.Scanner;

public class _10Smallestof3Numbers {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Number:");
		int a=sc.nextInt();
		
		System.out.println("Enter Second Number:");
		int b=sc.nextInt();
		
		System.out.println("Enter Third Number:");
		int c=sc.nextInt();
		
		
		if(a<b && a<c)
		{
			System.out.println(a+ " is smallest number");
		}
		
		if(b<a && b<c)
		{
			System.out.println(b+ " is smallest number");
		}
		
		else
		{
			System.out.println(c+ " is smallest number");
		}

	}

}
