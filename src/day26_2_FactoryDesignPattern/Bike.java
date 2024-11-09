package day26_2_FactoryDesignPattern;

//Step 2: Create concrete implementations of the Vehicle interface
public class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Riding a bike!");
    }
}