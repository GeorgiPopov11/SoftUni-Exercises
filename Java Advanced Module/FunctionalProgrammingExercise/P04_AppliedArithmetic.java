package FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class P04_AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).toList();

        Function<List<Integer>, List<Integer>> add = list -> list.stream().map(number -> number + 1).toList();
        Function<List<Integer>, List<Integer>> multiply = list -> list.stream().map(number -> number * 2).toList();
        Function<List<Integer>, List<Integer>> subtract = list -> list.stream().map(number -> number - 1).toList();
        Consumer<List<Integer>> print = list -> list.forEach(number -> System.out.print(number + " "));

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            if (command.equals("add")) {
               numbersList = add.apply(numbersList);
            } else if (command.equals("multiply")) {
                numbersList = multiply.apply(numbersList);

            } else if (command.equals("subtract")) {
                numbersList = subtract.apply(numbersList);
            } else if (command.equals("print")) {
                print.accept(numbersList);
            }


            command = scanner.nextLine();
        }


    }
}
