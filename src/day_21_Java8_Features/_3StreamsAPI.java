package day_21_Java8_Features;

import java.util.Arrays;
import java.util.List;

/*
 * The Streams API in Java 8 allows you to process sequences of elements in a functional style. 
 * You can filter, map, reduce, and collect data in a streamlined manner.
 */

public class _3StreamsAPI {
	public static void main(String[] args) {
        List<String> names = Arrays.asList("Ramya", "Srihari", "Rama", "Aadhvi");

        // Filter names starting with 'R' and print them
        names.stream()
             .filter(name -> name.startsWith("R"))
             .forEach(System.out::println); //:: operator is used for method references
    }
}
