package day26_2_FactoryDesignPattern;

//Step 4: Use the Factory in the Main Application

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        // Get an object of Car and call its drive method
        Vehicle vehicle1 = vehicleFactory.getVehicle("CAR");
        vehicle1.drive();  // Output: Driving a car!

        // Get an object of Truck and call its drive method
        Vehicle vehicle2 = vehicleFactory.getVehicle("TRUCK");
        vehicle2.drive();  // Output: Driving a truck!

        // Get an object of Bike and call its drive method
        Vehicle vehicle3 = vehicleFactory.getVehicle("BIKE");
        vehicle3.drive();  // Output: Riding a bike!
    }
}

/*
 * When to Use the Factory Design Pattern:
When a class doesn't know what types of objects it needs to create.
When you want to centralize the creation logic in one place, making your system easier to maintain.
When you want to allow for the easy extension of the system (i.e., you can add new types of Vehicle without changing the factory itself).
Advantages:
Encapsulation of Object Creation: The client code is unaware of the exact class being instantiated.
Scalability: New classes (e.g., Bus, Scooter) can be easily added without changing the client code.
Separation of Concerns: The logic of creating objects is separated from the logic of using them.
Disadvantages:
Complexity: It introduces an additional layer of complexity, especially if there are only a few object types.
Increased Maintenance: The factory class may become cumbersome to maintain if it is responsible for creating many different classes.

*/