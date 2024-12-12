package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class P05_FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String input = scanner.nextLine();

        Predicate<Integer> predicate;
        if (input.equals("odd")) {
        predicate = number -> number % 2 != 0;
        printNumbers(n, predicate);
        } else {
            predicate = number -> number % 2 == 0;
            printNumbers(n, predicate);
        }


    }

    public static void printNumbers(int[] bounds, Predicate<Integer> conditions) {
        for (int number = bounds[0]; number <= bounds[1]; number++){
            if (conditions.test(number)) {
                System.out.print(number + " ");
            }

        }
    }
}
