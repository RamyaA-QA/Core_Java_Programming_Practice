package day6_Arrays;

/*
 * Array: is a collection of elements of same data type (Homogeneous data)
 * We can store multiple values into a single variable.
 * 
 * Types of arrays:
 * 		1. Single dimensional
 * 		2. Two dimensional/Multi dimensional
 */

public class _1SingleDimensionalArray {

	public static void main(String[] args) {
		
		/* 1. Declare an array
		 * 2. Add values into array
		 * 3. Find size of an array
		 * 4. Read single value from an array
		 * 5. Read multiple values from an array
		 */
		
		// Declare an array
		// Approach1
		
		int a[] =new int[5];
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
				
		// Approach2
		
		int b[]= {100,200,300,400,500,600,700};
		
		//Find length of an array
		System.out.println("Length of an array A:"+a.length);
		System.out.println("Length of an array B:"+b.length);
		
		// Read single value from an array
		System.out.println("Value of an array A index of 4:"+a[4]);// 4 is an index
		System.out.println("Value of an array B index of 2:"+b[2]);// 2 is an index (index starts from 0)
		
		int c[]= {};
		System.out.println("Length of an array C:"+c.length);
		
		// Reading all values from an array
		
		//Normal for loop
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		// Enhanced for loop or for .. each loop
		
		for(int x:b)
		{
			System.out.println(x);
		}

	}

}
