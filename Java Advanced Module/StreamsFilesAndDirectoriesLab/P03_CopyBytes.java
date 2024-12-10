package StreamsFilesAndDirectoriesLab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class P03_CopyBytes {
    public static void main(String[] args) throws IOException {

        String pathToRead = "C:\\Users\\Joto\\IdeaProjects\\JavaAdvanced\\src\\streams_lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        FileInputStream fileInputStream = new FileInputStream(pathToRead);

        String pathToWrite = "C:\\Users\\Joto\\IdeaProjects\\JavaAdvanced\\src\\streams_lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\03.CopyBytesOutput.txt";
        FileOutputStream fileOutputStream = new FileOutputStream(pathToWrite);

        int oneByte = fileInputStream.read();


        while (oneByte >= 0) {
            if (oneByte == ' ') {
                fileOutputStream.write(' ');
            } else if (oneByte == '\n') {
                fileOutputStream.write('\n');
            } else {



            String digits = String.valueOf(oneByte);
            for (int i = 0; i < digits.length(); i++) {

                fileOutputStream.write(digits.charAt(i));

            }
        }



             oneByte = fileInputStream.read();
        }
        fileOutputStream.close();
        fileInputStream.close();


    }
}
