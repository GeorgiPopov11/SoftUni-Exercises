package ForLoopLab;

import java.util.Scanner;

public class P09LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int firstSum = 0;
        int secondSum = 0;

        for (int i = 1; i <=n ; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            firstSum += currentNum;

        }

        for (int i = 1; i <= n ; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            secondSum += currentNum;


        }

        if (firstSum == secondSum) {
            System.out.printf("Yes, sum = %d%n", firstSum);
        } else {
            int diff = Math.abs(firstSum - secondSum);
            System.out.printf("No, diff = %d", diff);
        }



    }
}
