package day26_2_FactoryDesignPattern;

//creating different types of vehicles: Car, Truck, and Bike. Instead of directly instantiating these classes, we will use a VehicleFactory to create them.
//Step 1: Create the Vehicle interface
public interface Vehicle {
	void drive();
}
