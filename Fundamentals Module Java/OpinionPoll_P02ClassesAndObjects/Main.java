package OpinionPoll_P02ClassesAndObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<OpinionPoll> peopleList = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {
            String information = scanner.nextLine();
            String[] informationParts = information.split(" ");

            String name = informationParts[0];
            int age = Integer.parseInt(informationParts[1]);

            if (age > 30) {
                OpinionPoll person = new OpinionPoll(name, age);
                peopleList.add(person);
            }

        }

        for (OpinionPoll person : peopleList) {
            System.out.println(person);
        }

    }
}
