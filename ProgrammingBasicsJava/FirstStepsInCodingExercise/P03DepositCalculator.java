package FirstStepsInCodingExercise;

import java.util.Scanner;

public class P03DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)

        //От конзолата се четат 3 реда:
        //1.	Депозирана сума – реално число в интервала [100.00 … 10000.00]
        //2.	Срок на депозита (в месеци) – цяло число в интервала [1…12]
        //3.	Годишен лихвен процент – реално число в интервала [0.00 …100.00]


        double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double percentSum = ((deposit * percent / 100) /12);

        double finalResult = percentSum * months + deposit;

        System.out.println(finalResult);





    }
}
