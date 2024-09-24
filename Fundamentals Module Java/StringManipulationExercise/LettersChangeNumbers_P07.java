package StringManipulationExercise;

import java.util.Scanner;

public class LettersChangeNumbers_P07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] inputParts = input.split("\\s+");

        double sum = 0;

        for (String word : inputParts) {


            double modifiedNumber = getModifiedNumber(word);
            sum += modifiedNumber;

        }

        System.out.printf("%.2f", sum);

    }

    private static double getModifiedNumber(String word) {
        char letterBefore = word.charAt(0);
        char letterAfter = word.charAt(word.length() - 1);
        double number = Double.parseDouble(word.replace(letterBefore, ' ').replace(letterAfter, ' ')
                .trim());

        if (Character.isUpperCase(letterBefore)) {
            int positionLetter = (int) letterBefore - 64;
            number = number / positionLetter;
        } else if (Character.isLowerCase(letterBefore)) {
            int positionLetter = (int) letterBefore - 96;
            number = number * positionLetter;
        }

        if (Character.isUpperCase(letterAfter)) {
            int positionLetter = (int) letterAfter - 64;
            number = number - positionLetter;

        } else {
            int positionLetter = (int) letterAfter - 96;
            number = number + positionLetter;
        }
        return number;

    }
}
