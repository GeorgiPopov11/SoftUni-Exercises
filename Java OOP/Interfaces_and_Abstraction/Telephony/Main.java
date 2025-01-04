package Interfaces_and_Abstraction.Telephony;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputNumbers = scanner.nextLine();
        String inputSites = scanner.nextLine();

        Smartphone smartphone = new Smartphone(new ArrayList<>(), new ArrayList<>());

        for (String number : inputNumbers.split(" ")) {
            smartphone.addNumber(number);
        }

        for (String site : inputSites.split(" ")) {
            smartphone.addUrl(site);
        }

        System.out.println(smartphone.call());
        System.out.println(smartphone.browse());

    }
}
