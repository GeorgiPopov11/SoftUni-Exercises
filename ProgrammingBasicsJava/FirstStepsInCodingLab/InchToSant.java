package FirstStepsInCodingLab;

import java.util.Scanner;

public class InchToSant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inch = Double.parseDouble(scanner.nextLine());

        double santimeter = inch * 2.54;

        System.out.println(santimeter);

    }
}
