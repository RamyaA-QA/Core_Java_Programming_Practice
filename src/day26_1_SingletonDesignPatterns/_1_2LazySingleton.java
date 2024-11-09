package day26_1_SingletonDesignPatterns;

/*
 * Lazy Initialization: The instance is created only when it is needed. However, this approach is not thread-safe unless explicitly handled.
 */
public class _1_2LazySingleton {
	private static _1_2LazySingleton instance;

    private _1_2LazySingleton() {}

    public static _1_2LazySingleton getInstance() {
        if (instance == null) {
            instance = new _1_2LazySingleton();
        }
        return instance;
    }
}
