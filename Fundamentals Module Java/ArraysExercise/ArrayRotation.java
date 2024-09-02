package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] array = scanner.nextLine().split(" ");

        int rotations = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= rotations ; i++) {
            String firstElement = array[0];

            for (int index = 0; index < array.length - 1; index++) {
                array[index] = array[index + 1];
            }

            array[array.length - 1] = firstElement;




        }

        for (String element : array){
            System.out.print(element + " ");
        }


    }
}
