package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class P08SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String typeRoom = scanner.nextLine();
        String rating = scanner.nextLine();

        double totalSum = 0;

        if (typeRoom.equals("room for one person")) {
            double price = 18;
            totalSum = price * (days - 1);
            if (rating.equals("positive")) {
                totalSum = totalSum * 1.25;

            } else if (rating.equals("negative")) {
                totalSum = totalSum * 0.90;
            }


        } else if (typeRoom.equals("apartment")) {
            double price = 25;
            totalSum = price * (days - 1);
            if (days < 10) {
                totalSum = totalSum * 0.70;
            } else if (days <= 15) {
                totalSum = totalSum * 0.65;
            } else {
                totalSum = totalSum * 0.50;
                
            }
            if (rating.equals("positive")) {
                totalSum = totalSum * 1.25;

            } else if (rating.equals("negative")) {
                totalSum = totalSum * 0.90;
            }


        } else if (typeRoom.equals("president apartment")) {
            double price = 35;
            totalSum = price * (days - 1);
            if (days < 10) {
                totalSum = totalSum * 0.90;
            } else if (days <= 15) {
                totalSum = totalSum * 0.85;
            } else {
                totalSum = totalSum * 0.80;

            }
            if (rating.equals("positive")) {
                totalSum = totalSum * 1.25;

            } else if (rating.equals("negative")) {
                totalSum = totalSum * 0.90;
            }




        }

        System.out.printf("%.2f", totalSum);




    }
}
