package StreamsFilesAndDirectoriesLab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class P02_WriteFile {
    public static void main(String[] args) throws IOException {


        String pathToRead = "C:\\Users\\Joto\\IdeaProjects\\JavaAdvanced\\src\\streams_lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream fileInputStream = new FileInputStream(pathToRead);

        String pathToWrite = "C:\\Users\\Joto\\IdeaProjects\\JavaAdvanced\\src\\streams_lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\02.WriteToFileOutput.txt";

        FileOutputStream fileOutputStream = new FileOutputStream(pathToWrite);

        int oneByte = fileInputStream.read();


        //",", ".", "!", "?".

        while (oneByte >= 0) {
            char currentChar = (char) oneByte;
            if (currentChar != ',' && currentChar != '.' && currentChar != '!' && currentChar != '?') {
                fileOutputStream.write(oneByte);
            }


            oneByte = fileInputStream.read();
        }

        fileInputStream.close();
        fileOutputStream.close();




    }

}
