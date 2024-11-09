package day_21_Java8_StreamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//The collect() method is commonly used to convert a stream into a collection, such as a List, Set, or Map
public class _5StreamWithCollect {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Collect even numbers into a list
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0) //Filters even numbers.
                                           .collect(Collectors.toList()); //Collects the filtered stream into a List

        System.out.println(evenNumbers); // Output: [2, 4, 6, 8, 10]
	}

}
