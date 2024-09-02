package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class P04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishersCount = Integer.parseInt(scanner.nextLine());

        double rent = 0;

        if (season.equals("Spring")) {
            rent = 3000;
            if (fishersCount <= 6) {
                rent = rent * 0.90;
            } else if (fishersCount <= 11) {
                rent = rent * 0.85;
            } else {
                rent = rent * 0.75;
            }
        if (fishersCount % 2 == 0) {
            rent = rent * 0.95;
        }

        } else if (season.equals("Summer")) {
            rent = 4200;
            if (fishersCount <= 6) {
                rent = rent * 0.90;
            } else if (fishersCount <= 11) {
                rent = rent * 0.85;
            } else {
                rent = rent * 0.75;
            }
            if (fishersCount % 2 == 0) {
                rent = rent * 0.95;
            }

        } else if (season.equals("Autumn")) {
            rent = 4200;
            if (fishersCount <= 6) {
                rent = rent * 0.90;
            } else if (fishersCount <= 11) {
                rent = rent * 0.85;
            } else {
                rent = rent * 0.75;
            }



        } else if (season.equals("Winter")) {
            rent = 2600;
            if (fishersCount <= 6) {
                rent = rent * 0.90;
            } else if (fishersCount <= 11) {
                rent = rent * 0.85;
            } else {
                rent = rent * 0.75;
            }
            if (fishersCount % 2 == 0) {
                rent = rent * 0.95;
            }

        }

        double difference = Math.abs(budget - rent);

        if (budget >= rent) {
            System.out.printf("Yes! You have %.2f leva left.", difference);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", difference);
        }


    }
}
