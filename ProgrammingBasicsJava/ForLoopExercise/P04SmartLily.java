package ForLoopExercise;

import java.util.Scanner;

public class P04SmartLily {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int pricePerToy = Integer.parseInt(scanner.nextLine());

        int countToys = 0;
        int sum = 0;
        int moneyEvenBirthdays = 0;





        for (int i = 1; i <= age ; i++) {

            if (i % 2 == 0) {
                moneyEvenBirthdays += 10;
                sum = sum + moneyEvenBirthdays;
                sum--;

            } else {
                countToys++;
            }

        }

        int toysMoney = countToys * pricePerToy;
        double allMoney = toysMoney + sum;

        double diff = Math.abs(allMoney - priceWashingMachine);

        if (allMoney >= priceWashingMachine){
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);
        }







    }


}
