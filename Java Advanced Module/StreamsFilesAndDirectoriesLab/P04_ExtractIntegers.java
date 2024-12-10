package StreamsFilesAndDirectoriesLab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class P04_ExtractIntegers {
    public static void main(String[] args) throws IOException {

        String pathOutput = "C:\\Users\\Joto\\IdeaProjects\\JavaAdvanced\\src\\streams_lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\04.ExtractIntegersOutput.txt";
        String pathInput = "C:\\Users\\Joto\\IdeaProjects\\JavaAdvanced\\src\\streams_lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileOutputStream fileOutputStream = new FileOutputStream(pathOutput);
        FileInputStream fileInputStream = new FileInputStream(pathInput);

        Scanner scanner = new Scanner(fileInputStream);


        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                System.out.println(scanner.nextInt());

            }


            scanner.next();
        }


    }
}
