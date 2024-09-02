package ConditionalStatementsExercise;

import java.util.Scanner;

public class P05GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Декорът за филма е на стойност 10% от бюджета.
        //•	При повече от 150 статиста,  има отстъпка за облеклото на стойност 10%.

        //От конзолата се четат 3 реда:
        //Ред 1.	Бюджет за филма – реално число в интервала [1.00 … 1000000.00]
        //Ред 2.	Брой на статистите – цяло число в интервала [1 … 500]
        //Ред 3.	Цена за облекло на един статист – реално число в интервала [1.00 … 1000.00]

        //На конзолата трябва да се отпечатат два реда:
        //•	Ако  парите за декора и дрехите са повече от бюджета:
        //o	"Not enough money!"
        //o	"Wingard needs {парите недостигащи за филма} leva more."
        //•	Ако парите за декора и дрехите са по малко или равни на бюджета:
        //o	"Action!"
        //o	"Wingard starts filming with {останалите пари} leva left."
        //Резултатът трябва да е форматиран до втория знак след десетичната запетая


        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double priceClothes = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.1;

        if (statists > 150) {
            priceClothes = priceClothes * 0.9;
        }


        double totalSumClothes = priceClothes * statists;

        double totalMoneyNeeded = totalSumClothes + decor;

        if (totalMoneyNeeded > budget) {
            double difference = totalMoneyNeeded - budget;
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", difference);

        } else {
            double difference = budget - totalMoneyNeeded;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", difference);
        }





    }
}
