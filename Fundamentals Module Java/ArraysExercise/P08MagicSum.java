package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int magicSum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= array.length - 1; i++) {
            int currentNum = array[i];


            for (int secondNum = i + 1; secondNum <= array.length - 1 ; secondNum++) {

                if (secondNum + currentNum == magicSum) {
                    System.out.printf("%d %d%n", currentNum, secondNum);
                }

            }


        }





    }
}
