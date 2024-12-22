package WorkingWithAbstraction.CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String rankCard = scanner.nextLine();
        String suitCard = scanner.nextLine();

        CardPower cardPower = CardPower.valueOf(rankCard);
        CardSuit cardSuit = CardSuit.valueOf(suitCard);

        System.out.printf("Card name: %s of %s; Card power: %d",
                cardPower.name(),
                cardSuit.name(),
                cardSuit.getSuitValue() + cardPower.getRankCard());

    }
}
