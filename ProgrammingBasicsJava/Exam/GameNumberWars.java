package Exam;

import java.util.Scanner;

public class GameNumberWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();



        boolean isValid = true;


        int player1Points = 0;
        int player2Points = 0;

        String input = scanner.nextLine();
        while (!input.equals("End of game")){
            int cardPlayer1 = Integer.parseInt(scanner.nextLine());
            int cardPlayer2 = Integer.parseInt(scanner.nextLine());

            if (cardPlayer1 > cardPlayer2) {
                player1Points = cardPlayer1 - cardPlayer2;
            } else if (cardPlayer1 < cardPlayer2) {
                player2Points = cardPlayer2 - cardPlayer1;
            } else {

                System.out.println("Number Wars!");
                cardPlayer1 = Integer.parseInt(scanner.nextLine());
                cardPlayer2 = Integer.parseInt(scanner.nextLine());
                if (cardPlayer1 > cardPlayer2) {
                    player1Points = cardPlayer1 - cardPlayer2;
                    System.out.printf("%s is winner with %d points", name1, player1Points);
                } else if (cardPlayer2 > cardPlayer2) {
                    player2Points = cardPlayer2 - cardPlayer1;
                    System.out.printf("%s is winner with %d points", name2, player2Points);
                }

                isValid = false;
                break;
            }


           input = scanner.nextLine();

        }

        int diff = Math.abs(player1Points - player2Points);

            if (isValid) {
                System.out.printf("%s has %d points%n", name1, player2Points);
                System.out.printf("%s has %d points", name2, player1Points);
            }


    }
}
