package FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class P06_PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Predicate<String> checkLength = name -> name.length() == n;

        String[] names = scanner.nextLine().split("\\s+");

        Arrays.stream(names).filter(checkLength).forEach(name -> System.out.println(name));

    }
}
