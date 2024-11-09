package day2_DataTypes_Variables;

public class Local_Instance_Variable {
	/*
	 * Instance variable
	 * Declared inside a class but outside any method, constructor, or block.
		They belong to the object (an instance) of the class, hence the name.
		Every object of the class has its own copy of the instance variable.
		Default value is assigned if not explicitly initialized (e.g., 0 for int, null for objects).
	 */
    int instanceVariable = 10;

    public void showVariables() {
    	/* Local variable
    	 * Declared inside a method or a block of code (e.g., inside a loop or constructor).
			They are local to that method or block and cannot be accessed outside of it.
			Must be initialized before use; they do not get a default value.
    	 */
        int localVariable = 20;

        System.out.println("Instance Variable: " + instanceVariable); // Can access instance variable
        System.out.println("Local Variable: " + localVariable);       // Can access local variable
    }

    public static void main(String[] args) {
        // Creating an object of the class
        Local_Instance_Variable obj = new Local_Instance_Variable();
        
        // Calling method to display instance and local variables
        obj.showVariables();

        // System.out.println(localVariable); // This would cause an error (localVariable cannot be accessed here)
    }
}
