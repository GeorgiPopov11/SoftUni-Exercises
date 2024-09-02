package MethodsLab;

import java.util.Scanner;

public class P10MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNum = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.0f", operation(firstNum, operator, secondNum));


    }

        public static double operation(int first, String operator, int second) {
            double result = 0;
        if (operator.equals("*")) {
            result = first * second;
        } else if (operator.equals("+")) {
            result = first + second;
        } else if (operator.equals("-")) {
            result = first - second;
        }
        return result;


        }


}



