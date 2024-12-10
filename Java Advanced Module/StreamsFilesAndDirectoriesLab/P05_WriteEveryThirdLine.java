package StreamsFilesAndDirectoriesLab;

import java.io.*;

public class P05_WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("C:\\Users\\Joto\\IdeaProjects\\JavaAdvanced\\src\\streams_lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");
        FileWriter fileWriter = new FileWriter("C:\\Users\\Joto\\IdeaProjects\\JavaAdvanced\\src\\streams_lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\05.WriteEveryThirdLineOutput.txt");

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);


        if (Integer.parseInt(bufferedReader.readLine()) % 3 == 0 ) {
            bufferedWriter.write(bufferedReader.readLine());
        }


    }
}
