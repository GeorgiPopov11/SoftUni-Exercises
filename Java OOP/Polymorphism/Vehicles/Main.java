package Polymorphism.Vehicles;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        Vehicles car = new Car(Double.parseDouble(input[1]),Double.parseDouble(input[2]));

        input = scanner.nextLine().split("\\s+");
        Vehicles truck = new Truck(Double.parseDouble(input[1]),Double.parseDouble(input[2]));

        Map<String, Vehicles> vehicles = Map.of("Car", car,
                                                 "Truck", truck);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            input = scanner.nextLine().split("\\s+");

            String action = input[0];
            String type = input[1];
            double parameters = Double.parseDouble(input[2]);

            switch (action) {
                case "Drive":
                    Vehicles vehicle = vehicles.get(type);
                    System.out.println(vehicle.drive(parameters));
                    break;
                case "Refuel":
                    vehicles.get(type).refuel(parameters);
                    break;
            }
        }

        System.out.println(car);
        System.out.println(truck);


    }
}
