package ConditionalStatementsExercise;

import java.util.Scanner;

public class P06SwimmingWorldRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double metersInSeconds = Double.parseDouble(scanner.nextLine());

        double totalSeconds = distanceInMeters * metersInSeconds;
        double slowing = Math.floor(( distanceInMeters / 15 ) * 12.5);

        double finalSeconds = totalSeconds + slowing;

        if (finalSeconds < record) {
            double difference = record - finalSeconds;
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", finalSeconds);

        } else {
            double difference = finalSeconds - record;
            System.out.printf("No, he failed! He was %.2f seconds slower.", difference);
        }


    }
}
