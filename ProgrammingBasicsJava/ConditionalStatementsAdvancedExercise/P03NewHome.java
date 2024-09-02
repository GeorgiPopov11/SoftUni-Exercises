package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class P03NewHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeFlower = scanner.nextLine();
        int totalFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double priceRoses = 5 * totalFlowers;
double priceDahlias = 3.80 * totalFlowers;
double priceTulips = 2.80 * totalFlowers;
double priceNarcissus = 3 * totalFlowers;
double priceGladiolus = 2.50 * totalFlowers;

double totalPrice = 0;

        switch (typeFlower) {
            case "Roses":
                totalPrice = totalFlowers * 5;
                if (totalFlowers > 80){
                    priceRoses = priceRoses * 0.90;

                }
                break;




            case "Dahlias":
                totalPrice = totalFlowers * 3.80;
                if (totalFlowers > 90){
                    priceGladiolus = priceDahlias * 0.85;

                }
              break;

            case "Tulips":
                totalPrice = totalFlowers * 2.80;
                if (totalFlowers > 80) {
                    priceTulips = priceTulips * 0.85;

                }
               break;

            case "Narcissus":
                totalPrice = totalFlowers * 3.00;
                if (totalFlowers < 120) {
                    priceNarcissus = priceNarcissus * 1.15;

                }
                break;


            case "Gladiolus":
                totalPrice = totalFlowers * 2.50;
                if (totalFlowers < 80) {
                    priceGladiolus = priceGladiolus * 1.20;


                }
                break;

        }

        if (totalPrice <= budget) {
            double difference =Math.abs(totalPrice - budget);
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", totalFlowers, typeFlower, difference);

        } else {
            double difference = Math.abs(budget - totalPrice);
            System.out.printf("Not enough money, you need %.2f leva more.", (difference));
        }




    }
}
