package SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P02_SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //7IK9Yo0h
        //9NoBUajQ
        //Ce8vwPmE
        //SVQXQCbc
        //tSzE5t0p
        //PARTY
        //9NoBUajQ
        //Ce8vwPmE
        //SVQXQCbc
        //END

        String input = scanner.nextLine();

        Set<String> vipGuests = new TreeSet<>();
        Set<String> regularGuests = new TreeSet<>();

        while (!input.equals("PARTY")) {
            if (Character.isDigit(input.charAt(0))) {
                vipGuests.add(input);
            } else {
                regularGuests.add(input);
            }

            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("END")) {
            if (Character.isDigit(input.charAt(0))) {
                vipGuests.remove(input);
            } else {
                regularGuests.remove(input);
            }

            input = scanner.nextLine();
        }

        System.out.println(vipGuests.size() + regularGuests.size());

        for (String vipGuest : vipGuests){
            System.out.println(vipGuest);
        }
        for (String regularGuest : regularGuests){
            System.out.println(regularGuest);
        }

    }
}
