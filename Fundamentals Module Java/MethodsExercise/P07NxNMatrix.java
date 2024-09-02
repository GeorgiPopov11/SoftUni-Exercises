package MethodsExercise;

import java.util.Scanner;

public class P07NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        matrix(n);

    }


    public static void matrix (int number) {

        for (int i = 0; i < number ; i++) {


            for (int j = 0; j < number; j++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }


    }
}

