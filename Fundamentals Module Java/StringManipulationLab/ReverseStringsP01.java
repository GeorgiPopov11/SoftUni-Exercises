package StringManipulationLab;

import java.util.Scanner;

public class ReverseStringsP01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String currentWord = "";

            for (int i = input.length() - 1; i >= 0 ; i--) {
                char currentChar = input.charAt(i);
                currentWord = currentWord + currentChar;
            }
            System.out.printf("%s = %s%n", input, currentWord);


            input = scanner.nextLine();
        }

    }
}
