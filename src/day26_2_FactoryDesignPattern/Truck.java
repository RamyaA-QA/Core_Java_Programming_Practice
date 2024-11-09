package day26_2_FactoryDesignPattern;

//Step 2: Create concrete implementations of the Vehicle interface
public class Truck implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a truck!");
    }
}