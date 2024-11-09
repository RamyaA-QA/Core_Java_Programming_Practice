package day_21_Java8_StreamsAPI;

import java.util.Arrays;
import java.util.List;

/*
 * 
Java Streams, introduced in Java 8, provide a powerful and functional-style way to process sequences of elements (such as collections). 
The Stream API allows for operations like filtering, mapping, and reducing in a declarative way, supporting both sequential and parallel execution.
 */

public class _1StreamExWithFilterAndForEach {
	public static void main(String[] args) {
        List<String> names = Arrays.asList("Ramya", "Srihari", "Aadhvi", "Rama");

        // Stream pipeline: filter names starting with "R" and print them
        names.stream()  // Converts the list into a stream.
             .filter(name -> name.startsWith("R")) //Filters the names that start with "R"
             .forEach(System.out::println); //Terminal operation that prints the names.
    }
}
