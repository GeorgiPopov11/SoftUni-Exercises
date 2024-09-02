package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String input = scanner.nextLine();

        while (!input.equals("end")) {

            if (input.contains("swap")) {
                int index1 = Integer.parseInt(input.split(" ")[1]);
                int index2 = Integer.parseInt(input.split(" ")[2]);

                int indexNumber1 = numbers[index1];
                int indexNumber2 = numbers[index2];

                numbers[index1] = indexNumber2;
                numbers[index2] = indexNumber1;

                
            } else if (input.contains("multiply")) {
                int index1 = Integer.parseInt(input.split(" ")[1]);
                int index2 = Integer.parseInt(input.split(" ")[2]);

                int indexNumber1 = numbers[index1];
                int indexNumber2 = numbers[index2];

                int result = indexNumber1 * indexNumber2;
                numbers[index1] = result;

            } else if (input.contains("decrease")) {
                for (int index = 0; index < numbers.length; index++) {
                    numbers[index]--;

                }

            }


            input = scanner.nextLine();
        }

        System.out.println(Arrays.toString(numbers).replace("[", " "). replace("]", " "));


    }
}
