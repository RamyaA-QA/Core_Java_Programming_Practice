package day_21_Java8_StreamsAPI;

import java.util.Arrays;
import java.util.List;

// You can sort a stream using the sorted() method.
public class _3StreamsWithSorted {
	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 9, 1, 4, 7);

        // Sort in ascending order
        System.out.println("Ascending:");
        numbers.stream()
               .sorted()  //Sorts the elements in natural order (ascending).
               .forEach(System.out::println);

        // Sort in descending order
        System.out.println("Descending:");
        numbers.stream()
               .sorted((a, b) -> b - a)  //Sorts the elements in reverse order (descending).
               .forEach(System.out::println);
    }
}
