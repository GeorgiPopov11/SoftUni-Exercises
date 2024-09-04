package ListsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        List<String> guestsList = new ArrayList<>();


        for (int i = 1; i <= n ; i++) {
            String input = scanner.nextLine();
            String[] inputParts = input.split(" ");

            if (!input.contains("not")) {

                if (!guestsList.contains(inputParts[0])) {
                    guestsList.add(inputParts[0]);
                } else {
                    System.out.println(inputParts[0] + " is already in the list!");
                }


            } else {
                if (guestsList.contains(inputParts[0])){
                    guestsList.remove(guestsList.indexOf(inputParts[0]));
                } else {
                    System.out.println(inputParts[0] + " is not in the list!");
                }


            }

        }

        for (String guest : guestsList) {
            System.out.println(guest);
        }

    }
}
