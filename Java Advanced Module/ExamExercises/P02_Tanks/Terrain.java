package ExamExercises.P02_Tanks;

import java.util.ArrayList;
import java.util.List;

public class Terrain {
    //•	type: String
    //•	List<Tank>: tanks
    //•	area: int
    private String type;
    private List<Tank> tanks;
    private int area;

    public Terrain(String type, int area) {
        this.type = type;
        this.area = area;
        tanks = new ArrayList<>();
    }

    public String addTank(Tank tank) {
        for (Tank existingTank : tanks) {
            if (existingTank.getBrand().equals(tank.getBrand()) && existingTank.getModel().equals(tank.getModel())) {
                return "Tank with this brand and model already exists!";
            }

        }
        if (this.type.equals("Swamp") && tank.getWeight() > 14000) {
            return String.format("This %s is too heavy for this terrain!", tank.getBrand());
        }
        tanks.add(tank);

        return String.format("Tank %s %s added.", tank.getBrand(), tank.getModel());
    }

    public boolean removeTank(String brand, String model) {
        for (Tank tank : tanks) {
            if (tank.getBrand().equals(brand) && tank.getModel().equals(model)) {
                tanks.remove(tank);
                return true;
            }
        }
        return false;
    }

    public String getTanksByBarrelCaliberMoreThan(int barrelCaliber) {
        StringBuilder sb = new StringBuilder("Tanks with caliber more than " + barrelCaliber + "mm: ");
        boolean firstTank = true;

        for (Tank tank : tanks) {
            if (tank.getBarrelCaliber() > barrelCaliber) {
                if (!firstTank) {
                    sb.append(", ");
                }
                sb.append(tank.getBrand());
                firstTank = false;

            }
        }
        if (firstTank) {
            return null;
        }
        return sb.toString();

//TODO - implement constructor and all the methods described in the problem description
    }

    public int getCount(){
        return tanks.size();
    }

    public String getStatistics(){

        if (!tanks.isEmpty()) {
            StringBuilder sb = new StringBuilder("Tanks located in the " + this.type.toLowerCase());
            sb.append(System.lineSeparator());

            int size = tanks.size();
            for (int i = 0; i < size; i++) {
                Tank tank = tanks.get(i);
                sb.append("-- ").append(tank.getBrand()).append(" ").append(tank.getModel());
                if (i < size - 1) {
                    sb.append(System.lineSeparator());
                }
            }
            return sb.toString();
        }

        return String.format("There are no tanks in the %s", this.type.toLowerCase());

    }

    public String getTankByBrandAndModel(String brand, String model){

        for (Tank tank : tanks) {
            if (tank.getBrand().equals(brand) && tank.getModel().equals(model)) {
                return tank.toString();
            }
        }
        return null;
    }

    public String getTheMostArmoredTank(){
        Tank mostArmoredTank = new Tank("null", "null", 0, 0, 0);

        for (Tank tank : tanks) {
            if (tank.getArmor() > mostArmoredTank.getArmor()) {
                mostArmoredTank = tank;
            }
        }
        return String.format("%s %s is the most armored tank with %dmm. armor thickness.", mostArmoredTank.getBrand(), mostArmoredTank.getModel(), mostArmoredTank.getArmor());
    }



}
