package day2_DataTypes_Variables;

/*
 * Final Variable:
Once assigned, the value of a final variable cannot be changed (it becomes constant).
A final variable must be initialized either at the time of declaration or within the constructor (for instance variables).
For primitive types, the value itself is constant (e.g., int, double).
For reference types (objects), the reference to the object is constant, but the object's contents can still change.

Constant Variable:
Often, constants are declared as public static final for values that are shared and fixed across all instances of the class.
Typically, constants are written in uppercase letters with underscores separating words (as per Java naming conventions).
 */
public class FinalVariable {

	    // Constant variable (public, static, final)
	    public static final double PI = 3.14159;

	    // Final instance variable (must be initialized in the constructor or at the time of declaration)
	    private final String name;

	    public FinalVariable(String name) {
	        this.name = name;  // Final variable initialized in the constructor
	    }

	    public void showDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Value of PI: " + PI);
	    }

	    public static void main(String[] args) {
	    	FinalVariable example = new FinalVariable("Ramya");

	        // Accessing constant variable
	        System.out.println("Constant PI: " + FinalVariable.PI);

	        // Accessing final instance variable
	        example.showDetails();

	        // Uncommenting the following line would cause a compilation error, because final variables cannot be modified:
	        // FinalVariableExample.PI = 3.14;  // Error
	        // example.name = "Doe";            // Error
	    }
	}