package day7_Arrays_Examples;

import java.util.Arrays;

public class _4SortingStringsInArray {

	public static void main(String[] args) {

		char s[]= {'D','C','B','A'};
		
		System.out.println("Before sorting....."+Arrays.toString(s));
		
		Arrays.sort(s);
		
		System.out.println("After sorting....."+Arrays.toString(s));

	}

}
