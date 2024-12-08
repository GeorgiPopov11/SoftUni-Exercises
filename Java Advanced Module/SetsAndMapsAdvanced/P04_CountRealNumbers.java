package SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //-2.5 4 3 -2.5 -5.5 4 3 3 -2.5 3

        double[] values = Arrays.stream(scanner.nextLine().
                split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> valuesWithOccurrences = new LinkedHashMap<>();

        for (double value : values) {
            if (!valuesWithOccurrences.containsKey(value)) {
                valuesWithOccurrences.put(value, 1);
            } else  {
                valuesWithOccurrences.put(value, valuesWithOccurrences.get(value) + 1);
            }
        }

        for (Map.Entry<Double, Integer> entry : valuesWithOccurrences.entrySet()) {
            System.out.printf("%.1f -> %d%n", entry.getKey(), entry.getValue());

        }






    }
}
