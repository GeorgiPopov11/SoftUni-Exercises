package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class P03_CountUpperCaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> wordsList = Arrays.stream((scanner.nextLine().split(" "))).toList();

        Function<List<String>, Integer> sumFunction = list -> {
            int count = 0;
            for (String word : list) {
                if (Character.isUpperCase(word.charAt(0))) {
                    count++;
                }
            }
            return count;
        };
        System.out.println(sumFunction.apply(wordsList));

        Predicate<String> upperCaseWord = word -> Character.isUpperCase(word.charAt(0));

        for (String word : wordsList) {
            if (upperCaseWord.test(word)) {
                System.out.println(word);
            }
        }




    }
}
