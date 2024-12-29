package Interfaces_and_Abstraction.BorderControl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Identifiable> identifiableMap = new HashMap<>();


        String command = scanner.nextLine();

        while (!command.equals("End")){
            
            if (command.split("\\s+").length == 3) {
                String name = command.split("\\s+")[0];
                int age = Integer.parseInt(command.split("\\s+")[1]);
                String id = command.split("\\s+")[2];

                Identifiable citizen = new Citizen(name, age, id);
                identifiableMap.put(id, citizen);

                
            } else if (command.split("\\s+").length == 2) {
                String model = command.split("\\s+")[0];
                String id = command.split("\\s+")[1];

                Identifiable robot = new Robot(model, id);
                identifiableMap.put(id, robot);
                
            }


            command = scanner.nextLine();
        }

        String lastId = scanner.nextLine();

        for (Map.Entry<String, Identifiable> entry : identifiableMap.entrySet()) {

            if (entry.getKey().endsWith(lastId)) {
                System.out.println(entry.getKey());
            }

        }



    }
}
