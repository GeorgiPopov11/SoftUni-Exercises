package FirstStepsInCodingLab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sqMeters = Double.parseDouble(scanner.nextLine());

        double priceSquareMeters = sqMeters * 7.61;
        double discount = priceSquareMeters * 0.18;
        double finalPrice = priceSquareMeters - discount;

        //The final price is: {крайна цена на услугата} lv."
        //•	"The discount is: {отстъпка} lv.

        System.out.printf("The final price is: %.2f lv.%n",finalPrice);
        System.out.printf("The discount is: %.2f lv.",discount);
    }
}
