package day21_Java8_LambdaExpressions;

import java.util.Comparator;

//You can pass multiple parameters in a lambda expression.
public class _2LambdaExpWithMultipleParams {
	
	public static void main(String[] args) {
		
	//Without Lambda (Anonymous Class):
	
	Comparator<Integer> comparator = new Comparator<Integer>() {
	    @Override
	    public int compare(Integer a, Integer b) {
	        return a.compareTo(b);
	    }
	};
	
	
	//Using Lambda Expression
	
	Comparator<Integer> comparator1 = (a, b) -> a.compareTo(b);

	// Testing the comparator
	System.out.println(comparator1.compare(5, 3)); // Outputs: 1
	System.out.println(comparator1.compare(3, 5)); // Outputs: -1
}

}