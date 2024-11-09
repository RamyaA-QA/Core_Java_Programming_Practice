package day_21_Java8_Features;

import java.util.Arrays;
import java.util.List;

/*
 * Java 8 introduced the concept of parallel streams, which allows for parallel processing of data.
 */
public class _9ParallelStreams {
	public static void main(String[] args) {
        List<String> names = Arrays.asList("Ramya", "Srihari", "Aadhvi", "Rama");

        // Process the stream in parallel
        names.parallelStream()
             .forEach(name -> System.out.println(name + " " + Thread.currentThread().getName()));
    }
}
