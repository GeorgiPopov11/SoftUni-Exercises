package SetsAndMapsAdvanced;

import java.util.*;

public class P05_AverageStudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        TreeMap<String, List<Double>> grades = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            String studentName = input.split("\\s+")[0];
            double studentGrade = Double.parseDouble(input.split("\\s+")[1]);

            if (!grades.containsKey(studentName)) {
                List<Double> gradeList = new ArrayList<>();
                grades.put(studentName, gradeList);
                gradeList.add(studentGrade);

            } else {
                grades.get(studentName).add(studentGrade);
            }

        }

        for (Map.Entry<String, List<Double>> entry : grades.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            entry.getValue().forEach(grade -> System.out.printf("%.2f ", grade));
            System.out.printf("(avg: %.2f)%n", getAverageGrade(entry.getValue()));

        }

    }

    private static double getAverageGrade(List<Double> value) {
        double sum = 0;
        for (Double grade : value) {
            sum += grade;
        }

        return sum / value.size();
    }


}
