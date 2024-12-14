package FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P05_ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());

        numbersList.removeIf(number -> number % n == 0);
        numbersList.reversed().stream().forEach(number -> System.out.print(number + " "));


    }
}
