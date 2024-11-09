package day_21_Java8_Features;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* A concise way to write anonymous methods, enabling functional programming.
 * Syntax: (Parameter) -> expression (OR)
 * (parameters) -> { statements; }
 *  */

public class _1LamdaExpression {

	public static void main(String[] args) {
		  // Without Lambda (pre-Java 8)

	    List<String> names = Arrays.asList("Srihari", "Ramya", "Aadhvi");
	    Collections.sort(names, new Comparator<String>() {
	        @Override
	        public int compare(String a, String b) {
	            return a.compareTo(b);
	        }
	    });
	    
	    System.out.println(names);
	
	 // With Lambda (Java 8)
	    Collections.sort(names, (a, b) -> a.compareTo(b));
	    
	    
		 // Without Lambda Expression (Pre-Java 8)
		    new Thread(new Runnable() {
		        @Override
		        public void run() {
		            System.out.println("Pre-Java 8!");
		        }
		    }).start();
	    
	 // With Lambda Expression (Java 8)
	    new Thread(() -> System.out.println("Java 8!")).start();
	}

}
