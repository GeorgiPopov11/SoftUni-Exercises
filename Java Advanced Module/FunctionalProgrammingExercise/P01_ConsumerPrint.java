package FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class P01_ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer<String> printFunction = string -> System.out.println(string);

        Arrays.stream(scanner.nextLine().split("\\s+")).forEach(printFunction);

    }
}
