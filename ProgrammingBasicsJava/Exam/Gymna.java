
package Exam;
import java.util.Scanner;

public class Gymna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String instrument = scanner.nextLine();

        double pointsDifficulty = 0;
        double pointsExecution = 0;

        // Check the country first
        if (country.equals("Russia")) {
            if (instrument.equals("ribbon")) {
                pointsDifficulty = 9.100;
                pointsExecution = 9.400;
            } else if (instrument.equals("hoop")) {
                pointsDifficulty = 9.300;
                pointsExecution = 9.800;
            } else if (instrument.equals("rope")) {
                pointsDifficulty = 9.600;
                pointsExecution = 9.000;
            }
        } else if (country.equals("Bulgaria")) {
            if (instrument.equals("ribbon")) {
                pointsDifficulty = 9.600;
                pointsExecution = 9.400;
            } else if (instrument.equals("hoop")) {
                pointsDifficulty = 9.550;
                pointsExecution = 9.750;
            } else if (instrument.equals("rope")) {
                pointsDifficulty = 9.500;
                pointsExecution = 9.400;
            }
        } else if (country.equals("Italy")) {
            if (instrument.equals("ribbon")) {
                pointsDifficulty = 9.200;
                pointsExecution = 9.500;
            } else if (instrument.equals("hoop")) {
                pointsDifficulty = 9.450;
                pointsExecution = 9.350;
            } else if (instrument.equals("rope")) {
                pointsDifficulty = 9.700;
                pointsExecution = 9.150;
            }
        }

        // Calculate the total points and the difference
        double allPoints = pointsDifficulty + pointsExecution;
        double diff = 20 - allPoints;
        double diffPercent = (diff / 20) * 100;

        // Output the results
        System.out.printf("The team of %s get %.3f on %s.%n", country, allPoints, instrument);
        System.out.printf("%.2f%%%n", diffPercent);
    }
}