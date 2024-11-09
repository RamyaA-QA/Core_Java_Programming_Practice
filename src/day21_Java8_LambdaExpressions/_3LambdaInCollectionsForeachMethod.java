package day21_Java8_LambdaExpressions;

import java.util.Arrays;
import java.util.List;

/*
 * The forEach method of the Iterable interface accepts a lambda expression. 
 * This can be used to iterate over a collection more concisely.
 */
public class _3LambdaInCollectionsForeachMethod {
	public static void main(String[] args) {
        List<String> names = Arrays.asList("Srihari", "Ramya", "Aadhvi", "Ram");

        // Using Lambda with forEach
        names.forEach(name -> System.out.println(name));// passed to the forEach method, which prints each element in the list.
    }
}
