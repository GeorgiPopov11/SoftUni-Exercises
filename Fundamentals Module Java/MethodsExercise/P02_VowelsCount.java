package MethodsExercise;

import java.util.Scanner;

public class P02_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toLowerCase();

        printVowels(text);



    }

    public static void printVowels (String input) {

        int vowels = 0;

        for (char c : input.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'u' || c == 'o' || c == 'y') {
                vowels++;
            }
        }
        System.out.println(vowels);
    }
}
