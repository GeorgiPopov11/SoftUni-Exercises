package VechicleCatalog_P04ClassesAndObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<VehicleCatalog> carsList = new ArrayList<>();
        List<VehicleCatalog> trucksList = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("End")){
            String[] inputParts = input.split(" ");
            String type = inputParts[0];
            String model = inputParts[1];
            String color = inputParts[2];
            int horsePower = Integer.parseInt(inputParts[3]);

            VehicleCatalog catalog = new VehicleCatalog(type, model, color, horsePower);

            switch (type) {
                case "car":
                carsList.add(catalog);
                    break;
                case "truck":
                trucksList.add(catalog);
                    break;
            }

            input = scanner.nextLine();
        }

        String secondInput = scanner.nextLine();
        while (!secondInput.equals("Close the Catalogue")) {
            String model = secondInput;
            for (VehicleCatalog catalog : carsList) {
                if (catalog.getModel().equals(model)){
                    System.out.printf("Type: %s%n", catalog.getType());
                    System.out.printf("Model: %s%n", catalog.getModel());
                    System.out.printf("Color: %s%n", catalog.getColor());
                    System.out.printf("Horsepower: %d%n", catalog.getHorsepower());
                }
            }
            for (VehicleCatalog catalog : trucksList) {
                if (catalog.getModel().equals(model)) {
                    System.out.printf("Type: %s%n", catalog.getType());
                    System.out.printf("Model: %s%n", catalog.getModel());
                    System.out.printf("Color: %s%n", catalog.getColor());
                    System.out.printf("Horsepower: %d%n", catalog.getHorsepower());
                }
            }



            secondInput = scanner.nextLine();
        }

        double truckTotalHorsePower = 0;
        double totalCars = 0;
        double carsTotalHorsePower = 0;
        double totalTrucks = 0;

        for (VehicleCatalog catalog : carsList){
            carsTotalHorsePower += catalog.getHorsepower();
            totalCars++;
        }
        for (VehicleCatalog catalog : trucksList){
            truckTotalHorsePower += catalog.getHorsepower();
            totalTrucks++;
        }

        double trucksAverageHorsePower = truckTotalHorsePower / totalTrucks;
        double carsAverageHorsePower = carsTotalHorsePower / totalCars;

        System.out.printf("%s have average horsepower of %.2f.%n", carsList.get(0).getType(), carsAverageHorsePower);
        System.out.printf("%s have average horsepower of %.2f.%n", trucksList.get(0).getType(), trucksAverageHorsePower);

    }
}
