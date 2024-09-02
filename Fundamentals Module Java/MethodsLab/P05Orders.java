package MethodsLab;

import java.util.Scanner;

public class P05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        productPrint(input, quantity);



    }

    public static void productPrint (String product, double number) {

        if (product.equals("coffee")) {
            double price = number * 1.50;
            System.out.printf("%.2f", price);
        } else if (product.equals("water")) {
            double price = number * 1.00;
            System.out.printf("%.2f", price);
        } else if (product.equals("coke")) {
            double price = number * 1.40;
            System.out.printf("%.2f", price);
        } else if (product.equals("snacks")) {
            double price = number * 2.00;
            System.out.printf("%.2f", price);
        }

    }

}
