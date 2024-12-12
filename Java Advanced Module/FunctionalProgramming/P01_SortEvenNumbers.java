package FunctionalProgramming;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01_SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new java.util.ArrayList<>(Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt).filter(e -> e % 2 == 0).toList());

        System.out.println(numbers.stream().map(String::valueOf).collect(Collectors.joining(", ")));

        Collections.sort(numbers);


        System.out.println(numbers.stream().map(String::valueOf).collect(Collectors.joining(", ")));




    }
}
