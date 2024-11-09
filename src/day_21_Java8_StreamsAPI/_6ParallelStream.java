package day_21_Java8_StreamsAPI;

import java.util.Arrays;
import java.util.List;

/*
 * Java Streams can run in parallel to take advantage of multi-core processors. By using parallelStream(), 
 * you can process data in parallel for improved performance.
 */
public class _6ParallelStream {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// Print each number in parallel
		numbers.parallelStream() // Executes the stream operations in parallel across multiple threads.
				.forEach(n -> System.out.println(Thread.currentThread().getName() + " - " + n)); // Each number is printed by different threads in parallel.
	}
}


