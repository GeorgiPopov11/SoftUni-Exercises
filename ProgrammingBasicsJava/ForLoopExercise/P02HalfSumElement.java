package ForLoopExercise;

import java.util.Scanner;

public class P02HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int num = 0;
        int biggestNum = 0;

        for (int i = 1; i <= n ; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            num += currentNum;

            if (currentNum > biggestNum) {
                biggestNum = currentNum;
            }


        }

        int finalNum = num - biggestNum;

        if (finalNum == biggestNum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", finalNum);
        } else {
            int diff = Math.abs(finalNum - biggestNum);
            System.out.println("No");
            System.out.printf("Diff = %d", diff);
        }





    }
}
