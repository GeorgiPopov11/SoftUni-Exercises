package Encapsulation.ShoppingSpree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String personsInput = scanner.nextLine();
        String productsInput = scanner.nextLine();

        Map<String, Person> personMap = new LinkedHashMap<>();
        Map<String, Product> productMap = new LinkedHashMap<>();

        fillPersonMap(personMap, personsInput);
        fillProductMap(productMap, productsInput);


        String command = scanner.nextLine();

        while (!command.equals("END")) {
            String[] tokens = command.split("\\s+");
            String personName = tokens[0];
            String productName = tokens[1];

            personMap.get(personName).buyProduct(productMap.get(productName));

            command = scanner.nextLine();
        }

        for (Person person : personMap.values()) {
            System.out.println(person.getName() + " - " + person.productsSummary());
        }


    }

    private static void fillPersonMap(Map<String, Person> personMap, String input) {
        //Peter=11;George=4
        //Bread=10;Milk=2
        String[] pairs = input.split(";");
        for (String pair : pairs) {
            String name = pair.split("=")[0];
            double money = Double.parseDouble(pair.split("=")[1]);
            Person person = new Person(name, money);
            personMap.put(name, person);
        }

    }
    private static void fillProductMap(Map<String, Product> productMap, String input) {

        String[] pairs = input.split(";");
        for (String pair : pairs) {
            String name = pair.split("=")[0];
            double cost = Double.parseDouble(pair.split("=")[1]);
            Product product = new Product(name, cost);
            productMap.put(name, product);
        }

    }
}
