package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class P02_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream((scanner.nextLine().split(", "))).map(Integer::parseInt).toList();

        System.out.println("Count = " + numbers.size());

        Function<List<Integer>, Integer> sumNumbers = list -> {
            int sum = 0;
            for (Integer i : list) {
                sum += i;

            }
            return sum;
        };

        System.out.println("Sum = " + sumNumbers.apply(numbers));



    }
}
