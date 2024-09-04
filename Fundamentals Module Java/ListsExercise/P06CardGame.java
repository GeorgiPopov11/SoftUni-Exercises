package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06CardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayerList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayerList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());






                while (!firstPlayerList.isEmpty() && !secondPlayerList.isEmpty()) {


                int currentFirstPlayerCard = firstPlayerList.get(0);
                int currentSecondPlayerCard = secondPlayerList.get(0);

                if (currentFirstPlayerCard > currentSecondPlayerCard) {
                    firstPlayerList.add(currentFirstPlayerCard);
                    firstPlayerList.add(currentSecondPlayerCard);
                    firstPlayerList.remove(0);
                    secondPlayerList.remove(0);


                } else if (currentFirstPlayerCard == currentSecondPlayerCard) {
                    firstPlayerList.remove(0);
                    secondPlayerList.remove(0);


                } else {
                    // second player card > first player card
                    secondPlayerList.add(currentSecondPlayerCard);
                    secondPlayerList.add(currentFirstPlayerCard);
                    firstPlayerList.remove(0);
                    secondPlayerList.remove(0);
                }

            }


        int sumCount = 0;

        if (firstPlayerList.isEmpty()) {
            for (int cards : secondPlayerList) {
                sumCount += cards;

            }
            System.out.printf("Second player wins! Sum: %d", sumCount);
        } else {
            for (int cards : firstPlayerList) {
                sumCount += cards;
            }
            System.out.printf("First player wins! Sum: %d", sumCount);
        }
    }
}
