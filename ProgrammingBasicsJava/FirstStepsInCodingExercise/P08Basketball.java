package FirstStepsInCodingExercise;

import java.util.Scanner;

public class P08Basketball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Джеси решава, че иска да се занимава с баскетбол, но за да тренира е нужна екипировка. Напишете програма, която изчислява какви разходи ще има Джеси, ако започне да тренира, като знаете колко е таксата за тренировки по баскетбол за период от 1 година. Нужна екипировка:
        //•	Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        //•	Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        //•	Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        //•	Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка

        int tax = Integer.parseInt(scanner.nextLine());


        double shoes = tax * 0.6;
        double kit = shoes * 0.8;
        double basketball = kit * 0.25;
        double accessories = basketball * 0.2;

        double total = tax + shoes + kit + basketball + accessories;

        System.out.println(total);




    }
}
