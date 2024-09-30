package FuntamentalsExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String regex = "@#+(?<name>[A-Z][A-Za-z0-9)]{4,}[A-Z])@#+";
        Pattern pattern = Pattern.compile(regex);




        for (int i = 1; i <= n ; i++) {
            String barcode = scanner.nextLine();
            Matcher matcher = pattern.matcher(barcode);

            if (matcher.find()){
                StringBuilder group = new StringBuilder();
                String currentWord = matcher.group("name");
                for (char currentChar : currentWord.toCharArray()){
                    if (Character.isDigit(currentChar)) {
                        group.append(currentChar);

                    }
                }
                if (group.length() == 0) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.printf("Product group: %s%n", group.toString());
                }
            } else {
                System.out.println("Invalid barcode");
            }





        }

    }
}
