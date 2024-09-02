package MethodsExercise;

import java.util.Scanner;

public class P04_PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        boolean charactersValid = characters(input);
        boolean letterAndDigitsValid = lettersAndDigits(input);
        boolean atLeastTwoDigitsValid = atLeastTwoDigits(input);

        if (charactersValid && letterAndDigitsValid && atLeastTwoDigitsValid) {
            System.out.println("Password is valid");
        }

        if (!charactersValid) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        if (!letterAndDigitsValid) {
            System.out.println("Password must consist only of letters and digits");
        }

        if (!atLeastTwoDigitsValid) {
            System.out.println("Password must have at least 2 digits");
        }


    }

    public static boolean characters (String input) {
        if (input.length() >= 6 && input.length() <= 10){
            return true;
        }
            return false;
    }

    public static boolean lettersAndDigits (String input) {
        boolean character = false;
        boolean digit = false;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                character = true;
            }
            if (Character.isDigit(ch)){
                digit = true;
            }
        }

        if (character && digit) {
            return true;
        }
            return false;
    }

    public static boolean atLeastTwoDigits (String input) {
        int sumDigits = 0;
        for (int i = 0; i < input.length() ; i++) {
            char ch = input.charAt(i);

            if (Character.isDigit(ch)) {
                sumDigits++;
            }
        }
        if (sumDigits >= 2) {
            return true;
        }
        return false;

    }



}
