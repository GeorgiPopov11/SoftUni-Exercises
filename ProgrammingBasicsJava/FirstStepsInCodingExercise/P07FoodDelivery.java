package FirstStepsInCodingExercise;

import java.util.Scanner;

public class P07FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Пилешко меню –  10.35 лв.
        //•	Меню с риба – 12.40 лв.
        //•	Вегетарианско меню  – 8.15 лв.

        //Напишете програма, която изчислява колко ще струва на група хора да си поръчат храна за вкъщи.
        //Групата ще си поръча и десерт, чиято цена е равна на 20% от общата сметка (без доставката).
        //Цената на доставка е 2.50 лв и се начислява най-накрая.
        //Вход
        //От конзолата се четат 3 реда:
        //•	Брой пилешки менюта – цяло число в интервала [0 … 99]
        //•	Брой менюта с риба – цяло число в интервала [0 … 99]
        //•	Брой вегетариански менюта – цяло число в интервала [0 … 99]


        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int veggie = Integer.parseInt(scanner. nextLine());


        double chickenPrice = chicken * 10.35;
        double fishPrice = fish * 12.40;
        double veggiePrice = veggie * 8.15;

        double desert = (chickenPrice + fishPrice + veggiePrice) * 0.2;

        double total = desert + chickenPrice + fishPrice + veggiePrice + 2.50;

        System.out.println(total);


    }
}
