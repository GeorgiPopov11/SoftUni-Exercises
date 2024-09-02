package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class P06OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        double result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
               if (result % 2 == 0) {
                   System.out.printf("%d %s %d = %.2f - even", num1, operator, num2, result);
               } else {
                   System.out.printf("%d %s %d = %.2f - odd", num1, operator, num2, result);
               }

                break;
            case "-":
                result = num1 - num2;
                if (result % 2 == 0) {
                    System.out.printf("%d %s %d = %.2f - even", num1, operator, num2, result);
                } else {
                    System.out.printf("%d %s %d = %.2f - odd", num1, operator, num2, result);
                }

                break;
            case "*":
                result = num1 * num2;
                if (result % 2 == 0) {
                    System.out.printf("%d %s %d = %.2f - even", num1, operator, num2, result);
                } else {
                    System.out.printf("%d %s %d = %.2f - odd", num1, operator, num2, result);
                }

                break;

            case "/":

                if (num2 == 0){
                    System.out.printf("Cannot divide %d by zero", num1);
                } else {
                    result = num1 / num2 ;
                    System.out.printf("%d / %d = %.2f", num1, num2, result);
                }

                break;
            case "%":

                if (num2 == 0) {
                    System.out.printf("Cannot divide %d by zero", num1);
                } else {
                    result = num1 % num2;
                    System.out.printf("%d %% %d = %.2f", num1, num2, result);
                }

                break;
        }



    }
}
