package Exam;

import java.util.Scanner;

public class FootballResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();
        String thirdInput = scanner.nextLine();

        int wins = 0;
        int draws = 0;
        int losses = 0;

        int team1goals = firstInput.charAt(0);
        int opponent1goals = firstInput.charAt(2);

        if (team1goals > opponent1goals) {
            wins++;
        } else if (team1goals == opponent1goals) {
            draws++;
        } else {
            losses++;
        }

        int team2goals = secondInput.charAt(0);
        int opponent2goals = secondInput.charAt(2);

        if (team2goals > opponent2goals){
            wins++;
        } else if (team2goals == opponent2goals) {
            draws++;
        } else {
            losses++;
        }

        int team3goals = thirdInput.charAt(0);
        int opponent3goals = thirdInput.charAt(2);

        if (team3goals > opponent3goals) {
            wins++;
        } else if (team3goals == opponent3goals) {
            draws++;
        } else {
            losses++;
        }

        System.out.printf("Team won %d games.%n", wins);
        System.out.printf("Team lost %d games.%n", losses);
        System.out.printf("Drawn games: %d%n", draws);


    }
}
