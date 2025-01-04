package Interfaces_and_Abstraction.Birthday_Celebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        List<Birthable> birthables = new ArrayList<>();

        while (!"End".equals(line)) {
            String[] tokens = line.split("\\s+");
            String type = tokens[0];

            switch (type) {
                case "Citizen":
                    String name = tokens[1];
                    int age = Integer.parseInt(tokens[2]);
                    String id = tokens[3];
                    String birthdate = tokens[4];
                    Citizen citizen = new Citizen(name, age, birthdate, id);
                    birthables.add(citizen);
                    break;
                case "Pet":
                    Pet pet = new Pet(tokens[1], tokens[2]);
                    birthables.add(pet);
                    break;
                case "Robot":
                    Robot robot = new Robot(tokens[1], tokens[2]);
                    break;
            }

            line = scanner.nextLine();
        }

        String year = scanner.nextLine();

        birthables.stream().filter(birthable -> birthable.getBirthDate().endsWith(year)).
                forEach(birthable -> System.out.println(birthable.getBirthDate()));
    }
}
