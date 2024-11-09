package day_21_Java8_Features;

/*
 * A functional interface is an interface that has exactly one abstract method. 
 * Java 8 introduced the @FunctionalInterface annotation to indicate these types of interfaces. 
 * Common examples include Runnable, Callable, Comparator,Predicate and custom interfaces.
 */
public class _2FunctionalInterfaces {
	public static void main(String[] args) {
		@FunctionalInterface
		interface MyFunctionalInterface {
			void sayHello();
		}

		// Lambda expression using the functional interface
		MyFunctionalInterface greeting = () -> System.out.println("Hello, Functional Interface!");
		greeting.sayHello();
	}
}
