package ConditionalStatementsExercise;

import java.util.Scanner;

public class P07Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Ако броя на видеокартите е по-голям от този на процесорите
        // получава 15% отстъпка от крайната сметка. Важат следните цени:
        //•	Видеокарта – 250 лв./бр.
        //•	Процесор – 35% от цената на закупените видеокарти/бр.
        //•	Рам памет – 10% от цената на закупените видеокарти/бр.
        //Да се изчисли нужната сума за закупуване на материалите и да се пресметне дали бюджета ще му стигне.
        //Вход
        //Входът се състои от четири реда:
        //1.	Бюджетът на Петър - реално число в интервала [0.0…100000.0]
        //2.	Броят видеокарти - цяло число в интервала [0…100]
        //3.	Броят процесори - цяло число в интервала [0…100]
        //4.	Броят рам памет - цяло число в интервала [0…100]
        //Изход
        //На конзолата се отпечатва 1 ред, който трябва да изглежда по следния начин:
        //•	Ако бюджета е достатъчен:
        //"You have {остатъчен бюджет} leva left!"
        //•	Ако сумата надхвърля бюджета:
        //"Not enough money! You need {нужна сума} leva more!"
        //Резултатът да се форматира до втория знак след десетичната запетая.

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCard = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ramMemory = Integer.parseInt(scanner.nextLine());

        double videoCardPrice = videoCard * 250;
        double processorPrice = videoCardPrice * 0.35;
        double ramMemoryPrice = videoCardPrice * 0.10;

        double allPrice = videoCardPrice + (processorPrice * processors) + (ramMemoryPrice * ramMemory);


        if (videoCard > processors) {
            allPrice = allPrice * 0.85;
        }

        if (allPrice <= budget) {
            double difference = budget - allPrice;
            System.out.printf("You have %.2f leva left!", difference);
        } else {
            double difference = allPrice - budget;
            System.out.printf("Not enough money! You need %.2f leva more!", difference);
        }




    }


}
