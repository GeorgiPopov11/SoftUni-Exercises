package ConditionalStatementsExercise;

import java.util.Scanner;

public class P04ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Пъзел - 2.60 лв.
        //•	Говореща кукла - 3 лв.
        //•	Плюшено мече - 4.10 лв.
        //•	Миньон - 8.20 лв.
        //•	Камионче - 2 лв.


        double holidayPrice = Double.parseDouble(scanner.nextLine());
        int puzzlesCount = Integer.parseInt(scanner.nextLine());
        int dollsCount = Integer.parseInt(scanner.nextLine());
        int teddyBearCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int trucksCount = Integer.parseInt(scanner.nextLine());

        double puzzlesPrice = puzzlesCount * 2.60;
        double dollsPrice = dollsCount * 3.0;
        double teddyBearPrice = teddyBearCount * 4.10;
        double minionPrice = minionsCount * 8.20;
        double trucksPrice = trucksCount * 2.0;

        double totalPrice = puzzlesPrice + dollsPrice + teddyBearPrice + minionPrice + trucksPrice;

        double totalCount = puzzlesCount + dollsCount + teddyBearCount + minionsCount + trucksCount;

        if (totalCount >= 50) {
            totalPrice = totalPrice * 0.75;
        }

        double rent = totalPrice * 0.10;

        double finalPrice = totalPrice - rent;

                         //finalPrice - holidayPrice;


        if (finalPrice > 0) {
            double diff = finalPrice - holidayPrice;
            System.out.printf("Yes! %.2f lv left.", diff);
        } else if (finalPrice <= 0) {


            double diff = holidayPrice - finalPrice;
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }









    }
}
