package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("End")){
            String[] inputParts = input.split(" ");
            String command = inputParts[0];

            switch (command) {
                case "Add":
                    int numberToAdd = Integer.parseInt(inputParts[1]);
                    numbersList.add(numberToAdd);
                    break;

                case "Insert":

                    int numberToInsert = Integer.parseInt(inputParts[1]);
                    int indexToInsert = Integer.parseInt(inputParts[2]);

                    if (indexToInsert >= 0 && indexToInsert <= numbersList.size() - 1) {
                        numbersList.add(indexToInsert, numberToInsert);
                    } else {
                        System.out.println("Invalid index");
                    }

                    break;
                case "Remove":
                    int indexToRemove = Integer.parseInt(inputParts[1]);
                    if (indexToRemove >= 0 && indexToRemove <= numbersList.size() - 1){
                        numbersList.remove(indexToRemove);
                    } else {
                        System.out.println("Invalid index");
                    }

                    break;
                case "Shift":
                    String shift = inputParts[1];
                    if (shift.equals("left")) {
                        int count = Integer.parseInt(inputParts[2]);
                        for (int i = 1; i <= count ; i++) {
                            int firstNumber = numbersList.get(0);
                            numbersList.remove(numbersList.get(0));
                            numbersList.add(firstNumber);


                        }

                    } else if (shift.equals("right")) {
                        int count = Integer.parseInt(inputParts[2]);
                        for (int i = 1; i <= count ; i++) {
                            int lastNumber = numbersList.get(numbersList.size() - 1);
                            numbersList.remove(numbersList.get(numbersList.size() - 1));
                            numbersList.add(0, lastNumber);
                        }


                    }


                    break;
            }



            input = scanner.nextLine();
        }

        for (int number : numbersList) {
            System.out.print(number + " ");
        }

    }
}

// 1 23 29 18 43 21 20
// 1 23 29 18 43  20 5