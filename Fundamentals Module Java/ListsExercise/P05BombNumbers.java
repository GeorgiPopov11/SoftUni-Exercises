package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbersList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String[] secondNumbers = scanner.nextLine().split(" ");

        int bombNumber = Integer.parseInt(secondNumbers[0]);
        int powerNumber = Integer.parseInt(secondNumbers[1]);

        for (int i = 0; i < numbersList.size(); i++) {
            int currentNum = Integer.parseInt(numbersList.get(i));

            if (currentNum == bombNumber) {


            }



        }



    }
}
