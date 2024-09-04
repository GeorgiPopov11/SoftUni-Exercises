package MidExamExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> itemsList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());


        String input = scanner.nextLine();

        while (!input.equals("Craft!")) {
            String[] inputParts = input.split(" - ");

            switch (inputParts[0]) {
                case "Collect":
                    String itemToCollect = inputParts[1];
                    if (!itemsList.contains(itemToCollect)) {
                        itemsList.add(itemToCollect);
                    } else {
                        continue;
                    }
                    break;

                case "Drop":
                    String itemToDrop = inputParts[1];
                    if (itemsList.contains(itemToDrop)){
                        itemsList.remove(itemToDrop);
                    }
                    break;

                case "Combine Items":
                    String[] itemsToCombine = inputParts[1].split(":");
                    String oldItem = itemsToCombine[0];
                    String newItem = itemsToCombine[1];

                    if (itemsList.contains(oldItem)){
                       int index = itemsList.indexOf(oldItem);
                        itemsList.add(index + 1, newItem);
                    } else {
                        continue;
                    }

                    break;

                case "Renew":
                    String itemToRenew = inputParts[1];
                    if (itemsList.contains(itemToRenew)){
                        String item = itemToRenew;
                        itemsList.remove(itemToRenew);
                        itemsList.add(item);

                    }

                    break;
            }

            input = scanner.nextLine();
        }

       // System.out.println(itemsList.toString().replaceAll("[\\[\\]]", ""));

        System.out.println(String.join(", ", itemsList));
        }


    }

