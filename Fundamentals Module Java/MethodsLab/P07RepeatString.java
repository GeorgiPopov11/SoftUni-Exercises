package MethodsLab;

import java.util.Scanner;

public class P07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(input, n));


    }

    public static String repeatString (String input, int times) {
        String result = "";
        for (int i = 1; i <= times ; i++) {
            String currentText = input;
            result += currentText;
        }
        return result;
    }
}
