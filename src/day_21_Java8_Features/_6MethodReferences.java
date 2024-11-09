package day_21_Java8_Features;

import java.util.Arrays;
import java.util.List;

/*
 * Method references are a shorthand for calling methods already defined elsewhere. 
 * They can be used to refer to static methods, instance methods, or constructors.
 */
public class _6MethodReferences {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ramya", "Srihari", "Aadhvi", "Ram");

		// Using method reference instead of lambda expression
		names.forEach(System.out::println);
	}
}
