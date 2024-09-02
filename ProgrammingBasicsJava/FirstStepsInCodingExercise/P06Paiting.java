package FirstStepsInCodingExercise;

import java.util.Scanner;

public class P06Paiting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Предпазен найлон - 1.50 лв. за кв. метър
        //•	Боя - 14.50 лв. за литър
        //•	Разредител за боя - 5.00 лв. за литър

        //още 10% от количеството боя и 2 кв.м. найлон, разбира се и 0.40 лв. за торбички. Сумата, за 1 час работа
        // е равна на 30% от сбора на всички разходи за материали.



        //Входът се чете от конзолата и съдържа точно 4 реда:
        //1.	Необходимо количество найлон (в кв.м.) - цяло число в интервала [1... 100]
        //2.	Необходимо количество боя (в литри) - цяло число в интервала [1…100]
        //3.	Количество разредител (в литри) - цяло число в интервала [1…30]
        //4.	Часовете, за които майсторите ще свършат работата - цяло число в интервала [1…9]
        //Изход
        //Да се отпечата на конзолата един ред:
        //•	"{сумата на всички разходи}"


        int masking = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double maskingPrice = masking * 1.50;
        double paintPrice = paint * 14.50;
        double thinnerPrice = thinner * 5.00;

        double bagPrice = 0.40;
        double extraPaintPrice = paintPrice * 0.10;
        double extraMasking = 2 * 1.50;

        double pricePerHour = (maskingPrice + paintPrice + thinnerPrice + bagPrice + extraPaintPrice + extraMasking) * 0.30;

        double totalSum = pricePerHour + maskingPrice + paintPrice + thinnerPrice + bagPrice + extraPaintPrice + extraMasking;

        System.out.println(totalSum);





    }
}
