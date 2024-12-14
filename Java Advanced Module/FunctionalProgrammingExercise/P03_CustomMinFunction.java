package FunctionalProgrammingExercise;


import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P03_CustomMinFunction {
    public static <List> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toSet());

        Function<Set<Integer>, Integer> minFunction = set -> {

            int minNumber = Integer.MAX_VALUE;

            for (Integer i : set) {
                if (i < minNumber) {
                    minNumber = i;
                }
            }
            return minNumber;
        };

        System.out.println(minFunction.apply(numbers));



    }
}
