package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] commandParts = input.split(" ");
            String command = commandParts[0];
            String element = commandParts[1];


            switch (command) {
                case "Delete":
                  numbersList.removeIf(e -> e == Integer.parseInt(element));


                    break;
                case "Insert":
                    int elementToInsert = Integer.parseInt(element);
                    int positionToInsert = Integer.parseInt(commandParts[2]);
                    if (positionToInsert >= 0 && positionToInsert <= numbersList.size()) {
                        numbersList.add(positionToInsert, elementToInsert);
                    }
                    break;
            }


            input = scanner.nextLine();
            }
        for (int numbers : numbersList){
            System.out.print(numbers + " ");
        }



    }
}
