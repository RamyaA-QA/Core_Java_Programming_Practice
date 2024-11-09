package day26_1_SingletonDesignPatterns;

public class Main {
	 public static void main(String[] args) {
	        // Get the single instance of Singleton class
	        Singleton singleton = Singleton.getInstance();

	        // Call a method on the Singleton instance
	        singleton.showMessage();
	    }
}

/*

When to Use the Singleton Pattern:

Logger: To ensure all parts of the application use the same logging instance.
Configuration Classes: To share configurations across the application without creating multiple instances.
Database Connection Pooling: To manage a single shared resource (like a connection pool).

Advantages:

Controlled access to the instance.
Saves memory because only one instance is created.
Prevents multiple instantiations, ensuring consistency.

Disadvantages:

Singleton can make unit testing difficult since it introduces a global state.
Overuse can lead to tight coupling and difficulty in managing code, especially in large applications.
Not always suited for multithreaded environments unless properly implemented.

*/