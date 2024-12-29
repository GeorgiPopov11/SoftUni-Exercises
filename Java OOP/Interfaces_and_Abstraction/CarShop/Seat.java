package Interfaces_and_Abstraction.CarShop;

public class Seat implements Car {

    private String model;
    private String color;
    private Integer horsePower;
    private String country;

    public Seat(String model, String color, Integer horsePower, String country) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.country = country;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Integer getHorsePower() {
        return horsePower;
    }

    @Override
    public String countryProduced() {
        return country;
    }

    @Override
    public String toString() {
        return String.format("%s is %s color and have %d horse power%n" +
                "This is %s produced in %s and have %d tires", this.model, this.color, this.horsePower, this.model, this.country, Car.TIRES);

    }
}
