package Interfaces_and_Abstraction.Food_Shortage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Buyer> buyersMap = new HashMap<>();


        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);

            if (tokens.length == 3) {
                Rebel rebel = new Rebel(name, age, tokens[2]);
                buyersMap.putIfAbsent(name, rebel);
            }else {
                Citizen citizen = new Citizen(name, age, tokens[2], tokens[3]);
                buyersMap.putIfAbsent(name, citizen);
            }

        }

        String buyerName = scanner.nextLine();

        while (!buyerName.equals("End")) {
            Buyer buyer = buyersMap.get(buyerName);

             if (buyer != null) {
                 buyer.buyFood();
            }

            buyerName = scanner.nextLine();
        }

         int totalFood = buyersMap.values().
                 stream().
                 mapToInt(Buyer::getFood).
                 sum();
         System.out.println(totalFood);

    }
}
