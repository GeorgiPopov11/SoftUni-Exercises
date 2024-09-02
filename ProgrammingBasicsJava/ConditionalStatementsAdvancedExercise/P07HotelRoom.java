package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class P07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double priceApartment = 0;
        double priceStudio = 0;

        if (month.equals("May")) {
            priceStudio = 50;
            priceApartment = 65;
            if (nights > 7 && nights <= 14) {
                priceStudio = priceStudio * 0.95;
            } else if (nights > 14) {
                priceStudio = priceStudio * 0.70;
            }
            if (nights > 14) {
                priceApartment = priceApartment * 0.90;
            }
            
            
            
        } else if (month.equals("June")) {
            priceStudio = 75.20;
            priceApartment = 68.70;
            if (nights > 14) {
                priceStudio = priceStudio * 0.80;
            }
            if (nights > 14) {
                priceApartment = priceApartment * 0.90;
            }
            
            
            
        } else if (month.equals("July")) {
            priceStudio = 76;
            priceApartment = 77;
            if (nights > 14) {
                priceApartment = priceApartment * 0.90;
            }


        } else if (month.equals("August")) {
            priceStudio = 76;
            priceApartment = 77;
            if (nights > 14) {
                priceApartment = priceApartment * 0.90;
            }

        } else if (month.equals("September")) {
            priceStudio = 75.20;
            priceApartment = 68.70;
            if (nights > 14) {
                priceStudio = priceStudio * 0.80;
            }
            if (nights > 14) {
                priceApartment = priceApartment * 0.90;
            }


        } else if (month.equals("October")) {
            priceStudio = 50;
            priceApartment = 65;
            if (nights > 7 && nights <= 14) {
                priceStudio = priceStudio * 0.95;
            } else if (nights > 14) {
                priceStudio = priceStudio * 0.70;
            }
            if (nights > 14) {
                priceApartment = priceApartment * 0.90;
            }

        }

        System.out.printf("Apartment: %.2f lv.%n", (priceApartment * nights));
        System.out.printf("Studio: %.2f lv.", (priceStudio * nights));


    }
}
