package ExamExercises.P02_Tanks;

public class Tank {
    //•	brand: String
    //•	model: String
    //•	weight: int
    //•	barrelCaliber: int
    //•	armor: int
    private String brand;
    private String model;
    private int weight;
    private int barrelCaliber;
    private int armor;

    public Tank(String brand, String model, int weight, int barrelCaliber, int armor){
        this.brand = brand;
        this.model = model;
        this. weight = weight;
        this.barrelCaliber = barrelCaliber;
        this.armor = armor;
    }

    public String getBrand() {
        return brand;
    }

    public int getArmor() {
        return armor;
    }

    public int getBarrelCaliber() {
        return barrelCaliber;
    }

    public int getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void setBarrelCaliber(int barrelCaliber) {
        this.barrelCaliber = barrelCaliber;
    }

    @Override
    public String toString() {
        return String.format("Brand: %s, Model: %s, Weight: %dkg, Barrel caliber: %dmm, Armor: %dmm", this.brand, this.model, this.weight, this.barrelCaliber, this.armor);
    }

    //TODO - implement constructor and all the methods described in the problem description
}
