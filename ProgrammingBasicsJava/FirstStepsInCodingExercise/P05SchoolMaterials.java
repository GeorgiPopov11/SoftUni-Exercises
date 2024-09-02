package FirstStepsInCodingExercise;

import java.util.Scanner;

public class P05SchoolMaterials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //предвид следния ценоразпис:
        //•	Пакет химикали - 5.80 лв.
        //•	Пакет маркери - 7.20 лв.
        //•	Препарат - 1.20 лв (за литър)
        //Вход
        //От конзолата се четат 4 числа:
        //•	Брой пакети химикали - цяло число в интервала [0...100]
        //•	Брой пакети маркери - цяло число в интервала [0...100]
        //•	Литри препарат за почистване на дъска - цяло число в интервала [0…50]
        //•	Процент намаление - цяло число в интервала [0...100]
        //Изход
        //Да се отпечата на конзолата колко пари ще са нужни на Ани, за да си плати сметката.

        int pencilsCount = Integer.parseInt(scanner.nextLine());
        int markersCount = Integer.parseInt(scanner.nextLine());
        int cleaningLiters = Integer.parseInt(scanner.nextLine());
        int discountPercent = Integer.parseInt(scanner.nextLine());

        double pencilsPrice = pencilsCount * 5.80;
        double markersPrice = markersCount * 7.20;
        double cleaningLitersPrice = cleaningLiters * 1.20;

        double sum = pencilsPrice + markersPrice + cleaningLitersPrice;

        double discountPrice = sum - (sum * discountPercent / 100);

        System.out.println(discountPrice);




    }
}
