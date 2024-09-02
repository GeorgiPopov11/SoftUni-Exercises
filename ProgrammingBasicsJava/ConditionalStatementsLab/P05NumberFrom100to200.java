package ConditionalStatementsLab;

import java.util.Scanner;

public class P05NumberFrom100to200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//•	под 100 отпечатайте: "Less than 100"
//•	между 100 и 200 отпечатайте: "Between 100 and 200"
//•	над 200 отпечатайте: "Greater than 200"

        int number = Integer.parseInt(scanner.nextLine());

        if (number < 100) {
            System.out.println("Less than 100");
        } else if (number <= 200) {
            System.out.println("Between 100 and 200");
        } else {
            System.out.println("Greater than 200");
        }




    }
}

