package Maps_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> carsMap = new LinkedHashMap<>();


        for (int i = 1; i <= n ; i++) {
            String input = scanner.nextLine();
            String command = input.split(" ")[0];

            if (command.equals("register")) {
                String username = input.split(" ")[1];
                String plateNumber = input.split(" ")[2];

                if (!carsMap.containsKey(username)) {

                    carsMap.put(username, plateNumber);
                    System.out.printf("%s registered %s successfully%n", username, plateNumber);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", plateNumber);
                }
                
                
            } else if (command.equals("unregister")) {
                String username = input.split(" ")[1];

                if (!carsMap.containsKey(username)) {
                    System.out.printf("ERROR: user %s not found%n", username);
                } else {
                    carsMap.remove(username);
                    System.out.printf("%s unregistered successfully%n", username);
                }


            }

        }

        for (Map.Entry<String, String> entry : carsMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

    }
}
