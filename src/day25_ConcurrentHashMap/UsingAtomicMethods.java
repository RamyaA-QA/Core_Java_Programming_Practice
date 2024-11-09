package day25_ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

//Using atomic methods provided by ConcurrentHashMap to ensure safe updates to the map
public class UsingAtomicMethods {
	public static void main(String[] args) {
       
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Insert initial values
        map.put("Ramya", 50);
        map.put("Srihari", 60);

        // Use putIfAbsent() - Only adds if the key is not already present
        map.putIfAbsent("Ramya", 100);  // "Ramya" is already present, so it won't change
        map.putIfAbsent("Aadhvi", 70);  // "Aadhvi" is not present, so it will be added

        // Use computeIfAbsent() - Compute a value if the key is absent
        map.computeIfAbsent("Rama", k -> 80);  // "Rama" is absent, so it computes and adds the value 80

        // Use replace() - Replaces the value only if the old value matches
        map.replace("Srihari", 60, 65);  // Replaces Srihari's value from 60 to 65

        // Printing the map
        System.out.println(map);
    }
}
