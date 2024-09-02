package ForLoopExercise;

import java.util.Scanner;

public class P05Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int openedTabs = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());
        ;


        for (int i = 1; i <= openedTabs ; i++) {
            String website = scanner.nextLine();



            if (website.equals("Facebook")) {
                salary -= 150;
            } else if (website.equals("Instagram")) {
                salary -= 100;
            } else if (website.equals("Reddit")) {
                salary -= 50;
            }

            if (salary <=0) {
                System.out.printf("You have lost your salary.");
                break;
            }



        }
        if (salary > 0) {


            System.out.printf("%.0f", salary);;
        }


    }
}
