package day7_Arrays_Examples;

import java.util.Arrays;
import java.util.Scanner;

public class _8ReadingAndWritingDataIntoArray {

	public static void main(String[] args) {

		int a[]=new int[5];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			//System.out.println("Enter a value:");
			System.out.println("Enter a value for the position "+i+":");
			a[i]=sc.nextInt();
		}
		
		System.out.println("Printing array elements....");
		
		System.out.println(Arrays.toString(a));

	}

}
