package Inheritance.Animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        while(!line.equals("Beast!")) {
            String[] tokens = scanner.nextLine().split("\\s+");

            try {

            switch (line) {
                case "Dog":
                    Dog dog = new Dog(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                    System.out.println(dog);
                    break;
                case "Cat":
                    Cat cat = new Cat(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                    System.out.println(cat);
                    break;
                case "Frog":
                    Frog frog = new Frog(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                    System.out.println(frog);
                    break;
                case "Kittens":
                    Kitten kitten = new Kitten(tokens[0], Integer.parseInt(tokens[1]));
                    System.out.println(kitten);
                    break;
                case "Tomcat":
                    Tomcat tomcat = new Tomcat(tokens[0], Integer.parseInt(tokens[1]));
                    System.out.println(tomcat);
                    break;

            }

        } catch (IllegalArgumentException exception){
                System.out.println(exception.getMessage());
            }

            line = scanner.nextLine();
        }

    }
}
