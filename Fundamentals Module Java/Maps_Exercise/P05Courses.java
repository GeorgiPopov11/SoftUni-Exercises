package Maps_Exercise;

import java.util.*;

public class P05Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> courseMap = new LinkedHashMap<>();

        while (!input.equals("end")) {
            String[] courseParts = input.split(" : ");
            String courseName = courseParts[0];
            String studentName = courseParts[1];

            if (!courseMap.containsKey(courseName)){
                courseMap.put(courseName, new ArrayList<>());
                courseMap.get(courseName).add(studentName);
            } else {
                courseMap.get(courseName).add(studentName);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : courseMap.entrySet()) {
            String courseName = entry.getKey();
            List<String> studentsList = entry.getValue();
            int studentsNumber = studentsList.size();

            System.out.printf("%s: %d%n", courseName, studentsNumber);
            for (String student : studentsList) {
                System.out.printf("-- %s%n", student);
            }
        }

    }
}
