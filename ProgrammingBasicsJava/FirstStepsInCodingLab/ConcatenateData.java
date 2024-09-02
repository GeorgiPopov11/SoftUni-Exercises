package FirstStepsInCodingLab;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String family = scanner.nextLine();
        String age = scanner.nextLine();
        String city = scanner.nextLine();

        System.out.printf("You are %s %s, a %s-years old person from %s.", name, family, age, city);
    }
}
