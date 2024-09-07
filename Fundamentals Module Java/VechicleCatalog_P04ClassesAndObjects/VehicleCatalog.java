package VechicleCatalog_P04ClassesAndObjects;

public class VehicleCatalog {
    private String type;
    private String model;
    private String color;
    private int horsepower;

    public VehicleCatalog(String type, String model, String color, int horsepower){
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getType() {
        return this.type;
    }
    public String getModel() {
        return this.model;
    }
    public String getColor() {
        return this.color;
    }
    public int getHorsepower() {
        return this.horsepower;
    }

    public void setType(String type){
        this.type = type;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setHorsepower(int horsepower){
        this.horsepower = horsepower;
    }

}
