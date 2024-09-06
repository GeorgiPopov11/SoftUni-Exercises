package ClassesAndObjectsLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04Songs {

    public static class Song {
        String typeList;
        String name;
        String time;

        public Song(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getTypeList() {
            return this.typeList;
        }
        public String getName() {
            return this.name;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Song> songs = new ArrayList<>();

        for (int i = 0 ; i < n ; i++) {
            String command = scanner.nextLine();
            String[] commandParts = command.split("_");
            String typeList = commandParts[0];
            String name = commandParts[1];
            String time = commandParts[2];

            Song currentSong = new Song(typeList, name, time);
            songs.add(currentSong);


        }

        String lastCommand = scanner.nextLine();

        if (lastCommand.equals("all")) {
            for (Song song : songs) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songs) {
                if (song.getTypeList().equals(lastCommand)) {
                    System.out.println(song.getName());
                }
            }
        }



    }
}
