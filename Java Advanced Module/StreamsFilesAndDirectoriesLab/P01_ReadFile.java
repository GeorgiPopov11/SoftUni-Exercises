package StreamsFilesAndDirectoriesLab;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class P01_ReadFile {
    public static void main(String[] args) throws IOException {


        String path = "C:\\Users\\Joto\\IdeaProjects\\JavaAdvanced\\src\\streams_lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream fileInputStream = new FileInputStream(path);

        int oneByte = fileInputStream.read();

        while (oneByte >= 0) {
            System.out.printf("%s ", Integer.toBinaryString(oneByte));



           oneByte = fileInputStream.read();
        }

        fileInputStream.close();


    }
}
