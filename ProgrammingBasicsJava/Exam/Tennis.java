package Exam;

import java.util.Scanner;

public class Tennis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pricePerTennisRacket = Double.parseDouble(scanner.nextLine());
        int countTennisRacket = Integer.parseInt(scanner.nextLine());
        int countSneakers = Integer.parseInt(scanner.nextLine());


        double totalPriceTennisRacket = pricePerTennisRacket * countTennisRacket;

        double priceSneakers = pricePerTennisRacket / 6;

        double totalPriceSneakers = priceSneakers * countSneakers;
        double priceOtherEquipment = (totalPriceSneakers + totalPriceTennisRacket) * 0.2;

        double finalPrice = totalPriceSneakers + priceOtherEquipment + totalPriceTennisRacket;


        double priceDjokovic = finalPrice / 8;
        double priceSponsors = finalPrice * 7 / 8;

        System.out.printf("Price to be paid by Djokovic %.0f%n", Math.ceil(priceDjokovic));
        System.out.printf("Price to be paid by sponsors %.0f%n", Math.ceil(priceSponsors));




    }
}
