package Exam;

import java.util.Scanner;

public class Fitness {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());


        int backCount = 0;
        int chestCount = 0;
        int legsCount = 0;
        int absCount = 0;
        int proteinShakeCount = 0;
        int proteinBarCount = 0;


        for (int i = 1; i <= peopleCount ; i++) {
            String execution = scanner.nextLine();

            if (execution.equals("Back")){
                backCount++;
            } else if (execution.equals("Chest")) {
                chestCount++;
            } else if (execution.equals("Legs")) {
                legsCount++;
            } else if (execution.equals("Abs")) {
                absCount++;
            } else if (execution.equals("Protein shake")) {
                proteinShakeCount++;
            } else if (execution.equals("Protein bar")) {
                proteinBarCount++;
            }


        }

        int trainingPeople = backCount + chestCount + legsCount + absCount;
        int proteinPeople = proteinBarCount + proteinShakeCount;

        double percentTraining = (trainingPeople * 1.0/ peopleCount) * 100;
        double percentProtein = (proteinPeople * 1.0 / peopleCount) * 100;

        System.out.printf("%d - back%n", backCount);
        System.out.printf("%d - chest%n", chestCount);
        System.out.printf("%d - legs%n", legsCount);
        System.out.printf("%d - abs%n", absCount);
        System.out.printf("%d - protein shake%n", proteinShakeCount);
        System.out.printf("%d - protein bar%n", proteinBarCount);
        System.out.printf("%.2f%% - work out%n", percentTraining);
        System.out.printf("%.2f%% - protein", percentProtein);




    }
}
