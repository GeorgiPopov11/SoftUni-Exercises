package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class P04_AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> pricesList = Arrays.stream(scanner.nextLine().split(", ")).map(Double::parseDouble).toList();

        Function<Double, Double> vatFunction = number -> number * 1.20;

        Consumer<Double> printPrice = price -> System.out.printf("%.2f\n", price);

        System.out.println("Prices with VAT:");

        pricesList.stream().map(vatFunction).forEach(printPrice);

    }
}
