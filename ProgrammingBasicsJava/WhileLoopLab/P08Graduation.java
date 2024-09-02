package WhileLoopLab;

import java.util.Scanner;

public class P08Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int poorGradesCount = 0;
        int currentClass = 1;
        double sumGrades = 0;

        while (currentClass <= 12) {
            if (poorGradesCount > 1) {
                System.out.printf("%s has been excluded at %d grade", name, currentClass);
                break;
            }
            double grade = Double.parseDouble(scanner.nextLine());




            if (grade < 4) {
                poorGradesCount++;
                continue;
            }



            currentClass++;
            sumGrades += grade;

        }

        if (poorGradesCount < 2) {
            double averageGrade = sumGrades / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, averageGrade);
        }
    }
}
