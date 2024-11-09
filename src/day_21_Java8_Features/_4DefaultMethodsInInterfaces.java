package day_21_Java8_Features;

/*
 * Java 8 allows you to add default methods to interfaces, providing a method implementation directly in the interface. 
 * This feature allows backward compatibility with older code without breaking existing implementations of interfaces.
 */

/*
 * Syntax: 
 * interface MyInterface {
    // Default method
    default void display() {
        System.out.println("This is the default display method.");
    }

    // Abstract method
    void abstractMethod();
}
 */

interface Vehicle {
    void move();

    // Default method
    default void startEngine() {
        System.out.println("Engine started");
    }
}

class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}

public class _4DefaultMethodsInInterfaces {
	public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();  // Calling the default method
        car.move();         // Calling the overridden method
    }
}
