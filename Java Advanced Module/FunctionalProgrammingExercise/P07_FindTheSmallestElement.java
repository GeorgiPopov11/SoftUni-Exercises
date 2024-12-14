package FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class P07_FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).toList();

        Function<List<Integer>, Integer> smallestNumber = list -> {
            int smallestIndex = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) < list.get(smallestIndex)) {
                    smallestIndex = i;
                }
            }
            return smallestIndex;
        };


        System.out.println(smallestNumber.apply(numbersList));




    }
}
