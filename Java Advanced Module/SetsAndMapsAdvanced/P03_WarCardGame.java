package SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P03_WarCardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //26 58 16 92 44 65 65 77 57 23 71 57 7 52 85 44 32 70 38 23
        //43 95 33 51 62 93 57 55 0 31 32 95 68 34 30 51 37 32 11 97

        Set<Integer> firstPlayerCards = new LinkedHashSet<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).
                forEach(firstPlayerCards::add);

        Set<Integer> secondPlayerCards = new LinkedHashSet<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).
                forEach(secondPlayerCards::add);

        int rounds = 50;

        while (!firstPlayerCards.isEmpty() && !secondPlayerCards.isEmpty() && rounds > 0) {

            int firstCard = firstPlayerCards.iterator().next();
            firstPlayerCards.remove(firstCard);

            int secondCard = secondPlayerCards.iterator().next();
            secondPlayerCards.remove(secondCard);

            if (firstCard > secondCard) {
                firstPlayerCards.add(firstCard);
                firstPlayerCards.add(secondCard);
            } else if (firstCard < secondCard) {
                secondPlayerCards.add(firstCard);
                secondPlayerCards.add(secondCard);

            }
            rounds--;


        }


         if (firstPlayerCards.size() < secondPlayerCards.size()) {
            System.out.println("Second player win!");
        } else if (secondPlayerCards.size() < firstPlayerCards.size()) {
            System.out.println("First player win!");
        } else {
             System.out.println("Draw!");
         }


    }
}
