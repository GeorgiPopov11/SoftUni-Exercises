package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class P05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String accomodation = "";
        double price = 0;

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                price = budget * 0.30;
                accomodation = "Camp";

            } else if (season.equals("winter")) {
                price = budget * 0.70;
                accomodation = "Hotel";
            }


        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                price = budget * 0.40;
                accomodation = "Camp";

            } else if (season.equals("winter")) {
                price = budget * 0.80;
                accomodation = "Hotel";
            }
            
            
        } else if (budget > 1000) {
            price = budget * 0.90;
            destination = "Europe";
            accomodation = "Hotel";


        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", accomodation, price);


    }
}
