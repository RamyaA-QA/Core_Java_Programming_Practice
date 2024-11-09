package day26_1_SingletonDesignPatterns;

/*
 * Thread-Safe Singleton (Double-Checked Locking): Improves performance by reducing the overhead of synchronization after the instance is created.
 */
public class _1_3ThreadSafeSingleton {
	
	  private static volatile _1_3ThreadSafeSingleton instance;

	    private _1_3ThreadSafeSingleton() {}

	    public static _1_3ThreadSafeSingleton getInstance() {
	        if (instance == null) {
	            synchronized (_1_3ThreadSafeSingleton.class) {
	                if (instance == null) {
	                    instance = new _1_3ThreadSafeSingleton();
	                }
	            }
	        }
	        return instance;
	    }
}
