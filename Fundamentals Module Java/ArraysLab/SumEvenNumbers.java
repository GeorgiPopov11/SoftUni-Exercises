package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int[] numbersArray = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;

        for (int i = 0; i < numbersArray.length; i++) {
           int currentNum = numbersArray[i];

           if (currentNum % 2 == 0) {
               sum += currentNum;
           }
        }

        System.out.println(sum);


    }
}
