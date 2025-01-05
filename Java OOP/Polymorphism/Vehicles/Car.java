package Polymorphism.Vehicles;

public class Car extends VehicleImpl{



    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + 0.9);
    }

}
