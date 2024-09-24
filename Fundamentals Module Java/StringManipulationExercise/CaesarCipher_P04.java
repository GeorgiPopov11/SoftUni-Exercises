package StringManipulationExercise;

import java.util.Scanner;

public class CaesarCipher_P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();


        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            char encryptedChar = (char) (currentChar + 3);
            encryptedText.append(encryptedChar);

        }
        System.out.println(encryptedText);
    }
}
