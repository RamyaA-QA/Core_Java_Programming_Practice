package day21_Java8_LambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
 * The Predicate<T> functional interface represents a boolean-valued function of one argument. 
 * It is commonly used with streams for filtering.
 */
public class _6LambdaWithPredicateFunctionalInterface {
	
	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Lambda with Predicate to filter even numbers
        Predicate<Integer> isEven = n -> n % 2 == 0;

        List<Integer> evenNumbers = numbers.stream()
                                           .filter(isEven)
                                           .collect(Collectors.toList());

        System.out.println(evenNumbers);  // Outputs: [2, 4, 6, 8, 10]
    }
}
