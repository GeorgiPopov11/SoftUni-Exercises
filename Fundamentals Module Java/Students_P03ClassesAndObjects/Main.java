package Students_P03ClassesAndObjects;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Students> studentsList = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {
            String input = scanner.nextLine();
            String[] inputParts = input.split(" ");
            String firstName = inputParts[0];
            String lastName = inputParts[1];
            double grade = Double.parseDouble(inputParts[2]);

            Students student = new Students(firstName, lastName, grade);
            studentsList.add(student);

        }

        Collections.sort(studentsList, Comparator.comparingDouble(Students::getGrade).reversed());
        for (Students student : studentsList) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + ": " + student.getGrade());
        }



    }
}
