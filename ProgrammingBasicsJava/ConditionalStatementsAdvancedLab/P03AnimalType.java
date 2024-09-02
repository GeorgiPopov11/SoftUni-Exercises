package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class P03AnimalType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String animalType = scanner.nextLine();


        if (animalType.equals("dog")) {
            System.out.println("mammal");
            
            
        } else if (animalType.equals("crocodile") || animalType.equals("tortoise") || animalType.equals("snake")) {
            System.out.println("reptile");
            
        } else {
            System.out.println("unknown");
        }

    }
}
