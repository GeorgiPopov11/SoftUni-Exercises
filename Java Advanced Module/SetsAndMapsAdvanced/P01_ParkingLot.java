package SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P01_ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Set<String> parking = new LinkedHashSet<>();



        while (!input.equals("END")) {
            String command = input.split(", ")[0];
            String numberPlate = input.split(", ")[1];

            if (command.equals("IN")) {
                parking.add(numberPlate);
                
            } else {
                parking.remove(numberPlate);

            }


            input = scanner.nextLine();
        }

        if (parking.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String plate : parking) {
                System.out.println(plate);
            }
        }

    }
}
