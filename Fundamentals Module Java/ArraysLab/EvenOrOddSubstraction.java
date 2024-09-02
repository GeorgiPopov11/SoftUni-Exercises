package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOrOddSubstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int[] inputArr = new int[input.length];

        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i < inputArr.length; i++) {
            inputArr[i] = Integer.parseInt(input[i]);

            if (inputArr[i] % 2 == 0) {
                sumOdd += inputArr[i];
            } else {
                sumEven += inputArr[i];
            }

        }

        int totalSum = sumOdd - sumEven;
        System.out.println(totalSum);

    }
}
