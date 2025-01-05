package Polymorphism.Vehicles;

public abstract class  VehicleImpl implements Vehicles {

    private double fuelQuantity;
    private double fuelConsumption;

    public VehicleImpl(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    @Override
    public String drive(double distance) {

        double neededFuel = this.fuelConsumption * distance;


        if (neededFuel <= fuelQuantity) {
            this.fuelQuantity -= neededFuel;
            return "%s travelled %.2f km".formatted(this.getClass().getSimpleName(), distance);
        }
        return "%s needs refueling".formatted(this.getClass().getSimpleName());
    }

    @Override
    public void refuel(double liters) {
        this.fuelQuantity += liters;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f",this.getClass().getSimpleName(), this.fuelQuantity);
    }
}
