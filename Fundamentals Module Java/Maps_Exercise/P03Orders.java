package Maps_Exercise;

import java.util.*;

public class P03Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<Double>> ordersMap = new LinkedHashMap<>();

        while (!input.equals("buy")) {
            String[] inputParts = input.split(" ");
            String names = inputParts[0];
            double price = Double.parseDouble(inputParts[1]);
            double quantity = Double.parseDouble(inputParts[2]);


            if (!ordersMap.containsKey(names)) {
                ordersMap.put(names, new ArrayList<>(Arrays.asList(price, quantity)));
            } else {
                List<Double> currentList = ordersMap.get(names);
                currentList.set(0, price);
                currentList.set(1, currentList.get(1) + quantity);
            }



            input = scanner.nextLine();
        }


        for (Map.Entry<String, List<Double>> entry : ordersMap.entrySet()) {
            double finalPrice = entry.getValue().get(0) * entry.getValue().get(1);
            System.out.printf("%s -> %.2f%n", entry.getKey(), finalPrice);

        }

    }
}
