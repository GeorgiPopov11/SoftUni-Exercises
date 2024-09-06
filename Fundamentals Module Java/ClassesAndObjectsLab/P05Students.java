package ClassesAndObjectsLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05Students {
    public static class Student {
        String firstName;
        String lastName;
        String age;
        String hometown;

        public Student(String firstName, String lastName, String age, String hometown){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public String getAge() {
            return this.age;
        }
        public String getHometown() {
            return this.hometown;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentsList = new ArrayList<>();

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] commandParts = command.split(" ");
            String firstName = commandParts[0];
            String lastName = commandParts[1];
            String age = commandParts[2];
            String hometown = commandParts[3];


            Student currentStudent = new Student(firstName, lastName, age, hometown);
            studentsList.add(currentStudent);



            command = scanner.nextLine();
        }

        String lastCommand = scanner.nextLine();

        for (Student student : studentsList) {
            if (student.getHometown().equals(lastCommand)) {
                System.out.printf("%s %s is %s years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }

    }
}
