package ArraysExercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();

        String[] firstArray = firstInput.split(" ");
        String[] secondArray = secondInput.split(" ");

        for (String secondElement : secondArray) {
            for (String firstElementElement : firstArray) {
                if (secondElement.equals(firstElementElement)) {
                    System.out.printf("%s ", secondElement);
                }
            }
        }



    }
}
