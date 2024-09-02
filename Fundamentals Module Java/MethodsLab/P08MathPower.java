package MethodsLab;

import java.util.Scanner;

public class P08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        System.out.println(powerNumber(number, power));


    }

    public static int powerNumber (int number, int power) {
        int sum = 1;
        for (int i = 1; i <= power ; i++) {
            sum = sum * number;
        }
        return sum;

    }
}
