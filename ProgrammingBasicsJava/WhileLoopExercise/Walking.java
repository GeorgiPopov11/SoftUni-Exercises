package WhileLoopExercise;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String stepsMade = scanner.nextLine();

        int goal = 10000;

        int stepsCounter = 0;


        while (!stepsMade.equals("Going home")) {
            int currentSteps = Integer.parseInt(stepsMade);
            stepsCounter += currentSteps;


            if (stepsCounter >= goal) {
                int diff = Math.abs(stepsCounter - goal);

                break;
            }







            stepsMade = scanner.nextLine();

        }

        if (stepsMade.equals("Going home")) {
            int stepsToHome = Integer.parseInt(scanner.nextLine());
            stepsCounter += stepsToHome;

        }

        if (stepsCounter < goal) {
            int diff = Math.abs(stepsCounter - goal);
            System.out.printf("%d more steps to reach goal.", diff);
        } else {
            int diff = Math.abs(stepsCounter - goal);
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", diff);
        }


    }
}
