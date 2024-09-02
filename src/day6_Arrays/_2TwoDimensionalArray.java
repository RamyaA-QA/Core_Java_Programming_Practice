package day6_Arrays;

public class _2TwoDimensionalArray {

	public static void main(String[] args) {

		/* 1. Declare an array
		 * 2. Add values into array
		 * 3. Find size of an array
		 * 4. Read single value from an array
		 * 5. Read multiple values from an array
		 */
		
		// Declare an array
		// Approach1
		
		int a[][]=new int[3][2];
		
		a[0][0]=10;
		a[0][1]=20;
		
		a[1][0]=30;
		a[1][1]=40;
		
		a[2][0]=50;
		a[2][1]=60;
		
		// Approach2
		
		int b[][]= {  {100,200}, {300,400}, {500,600}  };
		
		// Find size of an array
		
		System.out.println("Length of an array A rows:" +a.length);
		System.out.println("Length of an array A Columns:" +a[0].length);
		
		System.out.println("Length of an array B rows:" +b.length);
		System.out.println("Length of an array B Columns:" +b[0].length);
		
		// Read single value from an array
		System.out.println("Value of an array A with row 1 and column 0:" + a[1][0]);// 4 is an index
		System.out.println("Value of an array B with row 1 and column 1:" + b[1][1]);// 2 is an index (index starts from 0)

		/*
		 * int c[][] = {}; System.out.println("Length of an array C:" + c.length);
		 * System.out.println("Length of an array C:" + c[0].length);
		 */
		
		// Reading all values from an array
		
		// Normal for loop

		/*
		 * for (int r = 0;r <=2; r++) { for(int c=0;c<=1;c++) {
		 * System.out.print(a[r][c]+"  "); } System.out.println(); }
		 */
		for (int r = 0;r <= a.length-1; r++) 
		{
			for(int c=0;c<=a[r].length-1;c++)
			{
			System.out.print(a[r][c]+"  ");
			}
			System.out.println();
		}	
		
		for (int r = 0;r <= b.length-1; r++) 
		{
			for(int c=0;c<=b[r].length-1;c++)
			{
			System.out.print(b[r][c]+"  ");
			}
			System.out.println();
		}
		
		// Enhanced for loop
		
		for(int arr[]:a)
		{
			for(int x:arr)
			{
				System.out.print(x +"  ");
			}
			System.out.println();
		}
		
		for(int arr[]:b)
		{
			for(int x:arr)
			{
				System.out.print(x +"  ");
			}
			System.out.println();
		}


	}

}
