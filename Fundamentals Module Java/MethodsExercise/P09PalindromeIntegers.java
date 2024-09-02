package MethodsExercise;

import java.util.Scanner;

public class P09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            if (isPalindrome(input)){
                System.out.println("true");
            } else {
                System.out.println("false");
            }







            input = scanner.nextLine();
        }
    }

    public static boolean isPalindrome(String text) {
        String reversedText = "";

        for (int index = text.length() - 1; index >= 0 ; index--) {
                    reversedText += text.charAt(index);
        }
        if (text.equals(reversedText)){
            return true;
        }
        return false;
    }

}
