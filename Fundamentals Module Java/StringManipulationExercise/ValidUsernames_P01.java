package StringManipulationExercise;

import java.beans.beancontext.BeanContextChild;
import java.util.Scanner;

public class ValidUsernames_P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] usernameArray = input.split(", ");

        for (String username : usernameArray) {
            if (isValidUsername(username)){
                System.out.println(username);
            }



        }


    }

    public static boolean isValidUsername (String username){
       if (username.length() < 3 || username.length() > 16) {
           return false;
       }
       for (char c : username.toCharArray()) {
           if (!Character.isLetterOrDigit(c) && c != '-' && c != '_') {
               return false;
           }

       }
        return true;

    }
}
