package MethodsExercise;

import java.util.Scanner;

public class P_06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();


        middleCharacters(text);

    }

    public static void middleCharacters (String text) {

        if (text.length() % 2 == 0) {
            //georgi
            int firstDigit = text.length() / 2 - 1;
            int secondDigit = text.length() / 2 ;
            System.out.print(text.charAt(firstDigit));
            System.out.print(text.charAt(secondDigit));







        } else if (text.length() % 2 != 0){
            int middle = text.length() / 2;
            System.out.println(text.charAt(middle));

        }



    }

}
