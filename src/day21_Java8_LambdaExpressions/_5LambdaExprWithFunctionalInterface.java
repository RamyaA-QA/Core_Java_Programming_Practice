package day21_Java8_LambdaExpressions;

/*
 * You can create your own functional interface and use a lambda expression to provide its implementation.
 */

//Step 1: Define a Functional Interface

	@FunctionalInterface
	interface MathOperation {
	    int operate(int a, int b);
	}
	
public class _5LambdaExprWithFunctionalInterface {

	//Step 2: Use a Lambda Expression with the Functional Interface
	
	public static void main(String[] args) {
        // Lambda expression for addition
        MathOperation addition = (a, b) -> a + b;

        // Lambda expression for multiplication
        MathOperation multiplication = (a, b) -> a * b;

        System.out.println("Addition: " + addition.operate(10, 5));  // Outputs: 15
        System.out.println("Multiplication: " + multiplication.operate(10, 5));  // Outputs: 50
    }
}
