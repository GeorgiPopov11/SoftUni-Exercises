package FuntamentalsExam;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String currentPassword = scanner.nextLine();

        StringBuilder password = new StringBuilder(currentPassword);
        String input = scanner.nextLine();



        while (!input.equals("Done")) {

            if (input.equals("TakeOdd")) {
                for (int i = 0; i < currentPassword.length(); i++) {
                    char currentSymbol = currentPassword.charAt(i);
                    if (i % 2 != 0) {

                        password.append(currentSymbol);
                    }

                }

                System.out.println(password.toString());

                
                
            } else if (input.contains("Cut")) {
                String[] inputParts = input.split(" ");
                int index = Integer.parseInt(inputParts[1]);
                int length = Integer.parseInt(inputParts[2]);
                password.delete(index, index + length);
                System.out.println(password.toString());
            
                
            } else if (input.contains("Substitute")) {
                String[] inputParts = input.split(" ");
                String substring = inputParts[1];
                String replacement = inputParts[2];

                if (password.toString().contains(substring)){
                   String modifiedPass = password.toString().replace(substring, replacement);
                   password.setLength(0);
                   password.append(modifiedPass);
                    System.out.println(password.toString());

                } else {
                    System.out.println("Nothing to replace!");
                }




            }


            input = scanner.nextLine();
        }

        System.out.printf("Your password is: %s", password.toString());

        System.out.println();
    }
}
