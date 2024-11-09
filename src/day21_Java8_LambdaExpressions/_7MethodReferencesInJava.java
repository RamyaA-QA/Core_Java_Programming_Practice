package day21_Java8_LambdaExpressions;

import java.util.Arrays;
import java.util.List;

/*
 * Method references allow you to reuse existing methods in lambda expressions. 
 * They are a shorthand notation for lambda expressions that call an existing method.
 */
public class _7MethodReferencesInJava {
	public static void main(String[] args) {
        List<String> names = Arrays.asList("Ramya", "Srihari", "Aadhvi", "Rama");

        // Using Method Reference to print each name
        names.forEach(System.out::println);//System.out::println is a method reference that refers to the println method of System.out.
    }
}
