package WorkingWithAbstraction.CardRank;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Card Ranks");

        Arrays.stream(Card.values()).forEach(System.out::println);

    }
}
