package Exceptions_and_Error_Handling;

import java.util.Arrays;
import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] range = Arrays.stream(scanner.nextLine()
                .split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int startIndex = range[0];
        int endIndex = range[1];

        System.out.printf("Range: [%d...%d]%n", startIndex, endIndex);

        while (true) {
            String input = scanner.nextLine();
            try {
                int number = Integer.parseInt(input);
                if (number < startIndex || number > endIndex) {
                    System.out.println("Invalid number: " + input);
                }
                if (number >= startIndex && number <= endIndex) {
                    System.out.println("Valid number: " + number);
                    break;
                }

            } catch (NumberFormatException e){

                System.out.println("Invalid number: " + input);
            }


        }


    }
}
