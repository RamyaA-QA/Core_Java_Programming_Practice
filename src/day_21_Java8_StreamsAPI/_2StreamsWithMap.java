package day_21_Java8_StreamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//The map() operation is used to transform each element of the stream.
public class _2StreamsWithMap {
	public static void main(String[] args) {
        List<String> names = Arrays.asList("Rama", "Ramya", "Srihari", "Aadhvi");

        // Convert all names to uppercase and collect into a list
        List<String> upperCaseNames = names.stream()
                                           .map(String::toUpperCase) //Converts each string in the stream to uppercase.
                                           .collect(Collectors.toList()); //Collects the stream back into a list.

        System.out.println(upperCaseNames); // Output: [RAMA, RAMYA, SRIHARI, AADHVI]
    }
}
