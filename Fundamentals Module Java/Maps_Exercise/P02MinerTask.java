package Maps_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> resourceMap = new LinkedHashMap<>();

        while (!input.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());
            if (!resourceMap.containsKey(input)) {
                resourceMap.put(input, quantity);
            } else {
                resourceMap.put(input, resourceMap.get(input) + quantity);
            }




            input = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : resourceMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
