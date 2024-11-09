package day_21_Java8_Features;

import java.util.Optional;

/*
 * The Optional class is used to handle null values gracefully and avoid NullPointerException. 
 * It provides methods like isPresent(), ifPresent(), orElse(), and orElseThrow() to check and retrieve values.
 */
public class _5OptionalClass {

	public static void main(String[] args) {
		
		// Create an Optional object that contains a value
        Optional<String> optionalName = Optional.ofNullable("Ramya");

        // If value is present, print it, otherwise print a default value
        System.out.println(optionalName.orElse("Default Name"));

        // If present, execute the code inside ifPresent
        optionalName.ifPresent(name -> System.out.println("Name is: " + name));
	}

}
