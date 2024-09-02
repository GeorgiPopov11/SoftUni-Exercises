package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class P01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ticket = scanner.nextLine();

        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        double allRows = rows * columns;

        double price = 0;
        if (ticket.equals("Premiere")) {
            price = 12.00;

        } else if (ticket.equals("Normal")) {
            price = 7.50;

        } else if (ticket.equals("Discount")) {
            price = 5.00;


        }

        double finalPrice = price * allRows;

        System.out.printf("%.2f leva", finalPrice);




    }
}
