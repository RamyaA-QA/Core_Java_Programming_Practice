package day21_Java8_LambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Lambdas work beautifully with the Streams API introduced in Java 8, allowing you to perform operations like filter(), map(), and reduce() more elegantly.
 */
public class _4LambdaWithStreamsAPI {
	public static void main(String[] args) {
        List<String> names = Arrays.asList("Ramya", "Srihari", "Aadhvi", "Rama");

        // Using Lambda with Stream filter and collect
        List<String> filteredNames = names.stream()
                                          .filter(name -> name.startsWith("R"))
                                          .collect(Collectors.toList());

        System.out.println(filteredNames); // Outputs: [Ramya, Rama]
    }
}
