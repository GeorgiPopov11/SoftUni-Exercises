package MethodsExercise;

import java.util.Scanner;

public class P05_AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        System.out.println(subtract(n1, n2, n3));
    }

    public static int sum (int num1, int num2) {
        return num1 + num2;

    }

    public static int subtract (int num1, int num2, int num3) {
        return sum(num1, num2) - num3;
    }
}
