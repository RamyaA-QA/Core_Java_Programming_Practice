package day7_Arrays_Examples;

import java.util.Arrays;

public class _3SortingElementsInArray {

	public static void main(String[] args) {

		int a[]= {100,400,300,600,200,500};
		
		System.out.println("Before sorting....");
		System.out.println(Arrays.toString(a));//[100,400,300,600,200,500]
		
		Arrays.sort(a);// Sort elements in array
		
		System.out.println("After sorting....");
		System.out.println(Arrays.toString(a)); // [100, 200, 300, 400, 500, 600]
		
		/*
		 * for (int value:a) { System.out.println(value); }
		 */
	}

}
