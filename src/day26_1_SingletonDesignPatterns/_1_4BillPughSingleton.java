package day26_1_SingletonDesignPatterns;

/*
 * Bill Pugh Singleton: Uses a static inner class to hold the instance. 
 * The class is loaded and the instance is created only when it is accessed, making it both thread-safe and efficient.
 */
public class _1_4BillPughSingleton {
	
	private _1_4BillPughSingleton() {}

    private static class SingletonHelper {
        private static final _1_4BillPughSingleton INSTANCE = new _1_4BillPughSingleton();
    }

    public static _1_4BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
