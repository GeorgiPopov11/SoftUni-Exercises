package SetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P06_ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        //lidl, peach, 1.20
        //lidl, juice, 2.30
        //fantastico, apple, 1.20
        //kaufland, banana, 1.10
        //fantastico, grape, 2.20
        //Revision

        Map<String, Map<String, Double>> productShop = new TreeMap<>();

        while (!input.equals("Revision")) {
            String[] tokens = input.split(", ");
            String shopName = tokens[0];
            String productName = tokens[1];
            String productPrice = tokens[2];

            if (!productShop.containsKey(shopName)) {
                productShop.put(shopName, new LinkedHashMap<>());
                Map<String, Double> productsMap;
                productsMap = productShop.get(shopName);
                productsMap.put(productName, Double.parseDouble(productPrice));
            } else {
                Map<String, Double> productsMap = productShop.get(shopName);
                productsMap.put(productName, Double.parseDouble(productPrice));
            }




            input = scanner.nextLine();
        }

        for (Map.Entry<String, Map<String, Double>> entry : productShop.entrySet()) {
            System.out.println(entry.getKey() + "->");
            printProducts(entry.getValue());

        }


    }

    public static void printProducts(Map<String, Double> products) {
        for (Map.Entry<String, Double> entry : products.entrySet()) {
            System.out.printf("Product: %s, Price: %.1f%n", entry.getKey(), entry.getValue());
        }


    }

}
