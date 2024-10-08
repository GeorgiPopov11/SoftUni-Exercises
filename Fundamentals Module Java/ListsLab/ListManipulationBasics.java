package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        List<Integer> number = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
            String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split(" ");

            switch (tokens[0]) {
                case "Add":
                int numberToAdd = Integer.parseInt(tokens[1]);
                number.add(numberToAdd);
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(tokens[1]);
                    number.remove(Integer.valueOf(numberToRemove));

                    break;
                case "RemoveAt":
                    int indexToRemove = Integer.parseInt(tokens[1]);
                    number.remove(indexToRemove);

                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(tokens[1]);
                    int indexToInsert = Integer.parseInt(tokens[2]);

                    number.add(indexToInsert, numberToInsert);

                    break;
            }




            input = scanner.nextLine();
        }
        System.out.println(number.toString().replaceAll("[\\[\\],]", ""));
    }
}
