package day_21_Java8_StreamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//You can group elements in a stream using Collectors.groupingBy()

public class _7GroupingDataWithCollectorsGroupingBy {
	public static void main(String[] args) {
        List<String> names = Arrays.asList("Ramya", "Aadhvi", "Srihari", "Seshamma", "Rangaiah", "Theekshi");

        // Group names by their length
        Map<Integer, List<String>> groupedByLength = names.stream()
                                                          .collect(Collectors.groupingBy(String::length));//Groups the strings based on their length.

        System.out.println(groupedByLength);
        // Output: {5=[Ramya], 6=[Aadhvi], 7=[Srihari], 8=[Seshamma, Rangaiah, Theekshi]}
    }
}
