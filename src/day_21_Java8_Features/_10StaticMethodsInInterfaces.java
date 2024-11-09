package day_21_Java8_Features;

/*
 * Java 8 allows static methods in interfaces, similar to static methods in classes. 
 * These methods can be called directly from the interface.
 */

interface Utility {
    static void showMessage(String message) {
        System.out.println(message);
    }
}

public class _10StaticMethodsInInterfaces {
	public static void main(String[] args) {
        // Call static method from interface
        Utility.showMessage("Hello, Static Method in Interface!");
    }
}
