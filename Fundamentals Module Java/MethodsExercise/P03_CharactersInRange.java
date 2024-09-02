package MethodsExercise;

import java.util.Scanner;

public class P03_CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);

        printCharactersInRange(firstChar, secondChar);

    }

    public static void printCharactersInRange (char oneChar, char twoChar){

        if (oneChar < twoChar) {
            for (char symbol = (char)(oneChar + 1); symbol < twoChar ; symbol++) {
                System.out.print(symbol + " ");

            }


        } else {

            for (char symbol = (char) (twoChar + 1);symbol  < oneChar; symbol++) {
                System.out.print(symbol + " ");
            }

        }
    }


}
