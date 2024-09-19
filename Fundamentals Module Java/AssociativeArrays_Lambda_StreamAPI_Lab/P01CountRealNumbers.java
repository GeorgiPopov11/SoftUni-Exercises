package AssociativeArrays_Lambda_StreamAPI_Lab;

import java.util.*;
import java.util.stream.Collectors;

public class P01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       double[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        TreeMap<Double, Integer> numbersMap = new TreeMap<>();

        for (double number : numbersArr) {

            if (!numbersMap.containsKey(number)) {
                numbersMap.put(number, 0);
            }

            numbersMap.put(number, numbersMap.get(number) + 1);

        }

        for (Map.Entry<Double, Integer> entry : numbersMap.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
            
        }


    }
}
