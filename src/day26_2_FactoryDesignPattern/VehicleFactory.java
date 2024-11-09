package day26_2_FactoryDesignPattern;

/*
 * Step 3: Create the VehicleFactory class
The VehicleFactory will be responsible for creating instances of Vehicle based on the input.
 */
public class VehicleFactory {

    // Factory method to get the type of vehicle
    public Vehicle getVehicle(String vehicleType) {
        if (vehicleType == null) {
            return null;
        }
        if (vehicleType.equalsIgnoreCase("CAR")) {
            return new Car();
        } else if (vehicleType.equalsIgnoreCase("TRUCK")) {
            return new Truck();
        } else if (vehicleType.equalsIgnoreCase("BIKE")) {
            return new Bike();
        }
        return null;
    }
}
