package day2_DataTypes_Variables;

/*
 * Static variables are shared by all instances, while instance variables are unique to each object.
Static variables are accessed using the class name (e.g., ClassName.staticVariable), although they can also be accessed via an object (not recommended).
Memory efficiency: Static variables save memory by not creating copies for each object.
 */

public class Static_Variable {
	    // Static variable (class variable)
	    static int count = 0;

	    // Instance variable
	    int instanceVar = 0;

	    public Static_Variable() {
	        count++;  // Increment static variable
	        instanceVar++; // Increment instance variable
	    }

	    public static void main(String[] args) {
	        // Create first object
	    	Static_Variable obj1 = new Static_Variable();
	        System.out.println("obj1 - count: " + Static_Variable.count);   // Access static variable via class name
	        System.out.println("obj1 - instanceVar: " + obj1.instanceVar);  // Access instance variable via object

	        // Create second object
	        Static_Variable obj2 = new Static_Variable();
	        System.out.println("obj2 - count: " + Static_Variable.count);   // Static variable is shared
	        System.out.println("obj2 - instanceVar: " + obj2.instanceVar);  // Instance variable is separate for each object
	    }
	}