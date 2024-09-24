package StringManipulationLab;

import java.util.Scanner;

public class TextFilterP04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] banWords = scanner.nextLine().split(", ");

        String text = scanner.nextLine();

        for (String banWord : banWords) {
           String asterisk = replaceWord(banWord);
           text = text.replace(banWord, asterisk);
        }
        System.out.println(text);



    }

    public static String replaceWord (String banWord) {
        String result = "";
        for (int i = 0; i < banWord.length(); i++) {
            result = result + "*";

        }
            return result;
    }
}
