package WhileLoopLab;

import java.util.Scanner;

public class P06MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        int number = Integer.MIN_VALUE;

        while (!input.equals("Stop")) {
            int currentNum = Integer.parseInt(input);

            if (currentNum > number) {
                number = currentNum;
            }

            input = scanner.nextLine();





        }
        System.out.println(number);

    }
}
