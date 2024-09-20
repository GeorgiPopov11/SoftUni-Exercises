package Maps_Exercise;

import java.util.*;

public class P06StudentsAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentsMap = new LinkedHashMap<>();

        for (int i = 1; i <= n ; i++) {
            String studentName = scanner.nextLine();
            Double grade = Double.parseDouble(scanner.nextLine());

            if (!studentsMap.containsKey(studentName)) {
                studentsMap.put(studentName, new ArrayList<>());
                studentsMap.get(studentName).add(grade);

            } else {
                studentsMap.get(studentName).add(grade);
            }


        }

        for (Map.Entry<String, List<Double>> entry : studentsMap.entrySet()) {
            String studentsName = entry.getKey();
            List<Double> grades = entry.getValue();

            double averageGrade = 0;
            for (double grade : grades) {
                averageGrade += grade;
            }

            averageGrade = averageGrade / grades.size();
            if (averageGrade >= 4.50) {

                System.out.printf("%s -> %.2f%n", studentsName, averageGrade);
            }
        }


    }


}
