package day26_1_SingletonDesignPatterns;

public class Singleton {
	
	// Static variable to hold the single instance of the class
    private static Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {
        // Private constructor so it can't be instantiated from outside
    }

    // Public method to provide access to the single instance
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            // Create the instance if it doesn't exist yet
            instance = new Singleton();
        }
        return instance;
    }

    // Example method to show usage of Singleton
    public void showMessage() {
        System.out.println("Hello from Singleton instance!");
    }
}

