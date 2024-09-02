package MethodsExercise;

import java.util.Scanner;

public class P08_FactorialDivison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        long fact1 = factorial(firstNumber);
        long fact2 = factorial(secondNumber);

       double result = fact1 * 1.0 / fact2;

        System.out.printf("%.2f", result);



    }

    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n ; i++) {
            fact = fact * i;

        }
        return fact;
    }



}
