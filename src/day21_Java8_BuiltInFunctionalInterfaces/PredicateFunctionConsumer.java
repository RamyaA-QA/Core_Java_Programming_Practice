package day21_Java8_BuiltInFunctionalInterfaces;

import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;

/*
 * 1. Predicate<T>: Represents a boolean-valued function of one argument. Often used for filtering operations.
      Abstract method: boolean test(T t)
 * 2. Function<T, R>: Represents a function that takes one argument and returns a result.
      Abstract method: R apply(T t)
 * 3. Consumer<T>: Represents an operation that takes one argument and returns no result. It's commonly used to perform actions like printing or logging.
      Abstract method: void accept(T t)
 * 4. Supplier<T>: Represents a supplier of results. It does not take any arguments and returns a result.
      Abstract method: T get()
 */
public class PredicateFunctionConsumer {

	public static void main(String[] args) {

		// Predicate to check if an integer is even
        Predicate<Integer> isEven = n -> n % 2 == 0;

        // Function to convert an integer to a string
        Function<Integer, String> numberToString = n -> "Number: " + n;

        // Consumer to print a string
        Consumer<String> printMessage = message -> System.out.println(message);

        // Process a number
        int number = 8;

        if (isEven.test(number)) {  // Check if the number is even
            String message = numberToString.apply(number);  // Convert number to string
            printMessage.accept(message);  // Print the message
        }
	}

}
