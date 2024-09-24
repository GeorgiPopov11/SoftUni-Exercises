package StringManipulationExercise;

import java.util.Scanner;

public class ReplaceRepeatingChars_P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        //aaaaabbbbbcdddeeeedssaa

        StringBuilder result = new StringBuilder();


        char previousChar = '\0';


        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar != previousChar) {
                result.append(currentChar);
            }
            previousChar = currentChar;
        }

        System.out.println(result);

    }
}
