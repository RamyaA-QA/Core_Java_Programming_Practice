package day26_1_SingletonDesignPatterns;

/*
 * Eager Initialization: The Singleton instance is created at the time of class loading. 
 * This approach is simple but might waste resources if the instance is never used.
 */
public class _1_1EagerSingleton {
	 private static final _1_1EagerSingleton instance = new _1_1EagerSingleton();

	    private _1_1EagerSingleton() {}

	    public static _1_1EagerSingleton getInstance() {
	        return instance;
	    }
}
