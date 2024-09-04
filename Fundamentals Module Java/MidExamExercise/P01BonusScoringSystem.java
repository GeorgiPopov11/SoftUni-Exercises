package MidExamExercise;

import java.util.Scanner;

public class P01BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberStudents = Integer.parseInt(scanner.nextLine());
        int numberLectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());



            double highestBonus = 0;
            double printAttendance = 0;
        for (int i = 1; i <= numberStudents ; i++) {
            int attendanceCount = Integer.parseInt(scanner.nextLine());

            double currentBonus = (attendanceCount *1.0 / numberLectures) * (5 + additionalBonus);

            if (currentBonus > highestBonus) {
                highestBonus = currentBonus;
                printAttendance = attendanceCount;

            }



        }

        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(highestBonus));
        System.out.printf("The student has attended %.0f lectures.", printAttendance);

    }
}
