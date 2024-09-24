package StringManipulationExercise;

import java.util.Scanner;

public class Extract_File_P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] inputParts = input.split("\\\\");

        String path = inputParts[inputParts.length - 1];

        String fileName = path.split("\\.")[0];
        String extension = path.split("\\.")[1];

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + extension);


    }
}
