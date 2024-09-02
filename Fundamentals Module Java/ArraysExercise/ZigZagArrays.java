package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        String[] array1 = new String[n/2];
        String[] array2 = new String[n/2];


        for (int i = 0; i < n; i++) {
            array1[i] = scanner.nextLine();
            array2[i] = scanner.nextLine();

        }

        System.out.printf("%d ", array1);



    }
}
