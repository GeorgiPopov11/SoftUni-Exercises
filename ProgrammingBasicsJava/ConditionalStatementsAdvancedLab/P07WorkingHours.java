package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class P07WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Да се напише програма, която чете час от денонощието(цяло число) и ден от седмицата(текст)
        // - въведени от потребителя и проверява дали офисът на фирма е отворен,
        // като работното време на офисът е от 10-18 часа
        // , от понеделник до събота включително

        int hour = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();

        if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday")
                || dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday") || dayOfWeek.equals("Saturday")) {
            if (hour >= 10 && hour <= 18) {
                System.out.println("open");
            }
        } else {
            System.out.println("closed");


        }
    }
}