package day_21_Java8_Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Collectors are used to collect the result of Stream operations into different forms like List, Set, Map, etc.
 */
public class _8Collectors {
	public static void main(String[] args) {
        List<String> names = Arrays.asList("Ramya", "Srihari", "Rama", "Aadhvi");

        // Collect names starting with 'R' into a List
        List<String> jNames = names.stream()
                                   .filter(name -> name.startsWith("R"))
                                   .collect(Collectors.toList());

        System.out.println(jNames);
    }
}
