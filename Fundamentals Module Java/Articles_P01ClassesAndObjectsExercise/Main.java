package Articles_P01ClassesAndObjectsExercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine();
        String[] dataParts = data.split(", ");

        String title = dataParts[0];
        String content = dataParts[1];
        String author = dataParts[2];

        Articles article = new Articles(title, content, author);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            String input = scanner.nextLine();
            String[] inputParts = input.split(": ");

            String command = inputParts[0];
            String edit = inputParts[1];

            switch (command) {
                case "Edit":
                    article.setContent(edit);
                    break;
                case "ChangeAuthor":
                    article.setAuthor(edit);
                    break;
                case "Rename":
                    article.setTitle(edit);
                    break;
            }
        }

        System.out.println(article.toString());

    }
}
