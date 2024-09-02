package WhileLoopExercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int badGrades = Integer.parseInt(scanner.nextLine());

        String examName = scanner.nextLine();

        int badGradesCount = 0;

        boolean isValid = true;
        int totalExams = 0;
        int totalGrades = 0;

        String lastExamName = "";




        while (!examName.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4) {
                badGradesCount++;
            }

            if (badGradesCount == badGrades) {
                System.out.printf("You need a break, %d poor grades.", badGrades);
                isValid = false;
                break;
            }

            if (!examName.equals("Enough")) {
                totalExams++;
                totalGrades += grade;
            }
            lastExamName = examName;

            examName = scanner.nextLine();


        }

        double average = totalGrades * 1.0 / totalExams;

        if (isValid) {
            System.out.printf("Average score: %.2f%n", average);
            System.out.printf("Number of problems: %d%n", totalExams);
            System.out.printf("Last problem: %s", lastExamName);


        }







    }
}
