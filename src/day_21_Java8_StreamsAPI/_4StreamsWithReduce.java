package day_21_Java8_StreamsAPI;

import java.util.Arrays;
import java.util.List;

//The reduce() operation allows you to combine elements of the stream and produce a single result.

public class _4StreamsWithReduce {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Sum of all numbers using reduce()
        int sum = numbers.stream()
                         .reduce(0, (a, b) -> a + b); // Reduces the stream to a single value (sum of all numbers). 
        											  // 0 is the identity value, and (a, b) -> a + b is the accumulator that adds two numbers together.

        System.out.println("Sum: " + sum);  // Output: Sum: 15
	}

}
