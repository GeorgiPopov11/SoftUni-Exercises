package Exam;

import java.util.Scanner;

public class Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String instrument = scanner.nextLine();


        double pointsDifficulty = 0;
        double pointsExecution = 0;


        if (instrument.equals("ribbon")) {
            if (country.equals("Russia")) {
                pointsDifficulty = 9.100;
                pointsExecution = 9.400;
            } else if (country.equals("Bulgaria")) {
                pointsDifficulty = 9.600;
                pointsExecution = 9.400;
            } else if (country.equals("Italy")) {
                pointsDifficulty = 9.200;
                pointsExecution = 9.500;
            }


        } else if (instrument.equals("hoop")) {
            if (country.equals("Russia")) {
                pointsDifficulty = 9.300;
                pointsExecution = 9.800;
            } else if (country.equals("Bulgaria")) {
                pointsDifficulty = 9.550;
                pointsExecution = 9.750;
            } else if (country.equals("Italy")) {
                pointsDifficulty = 9.450;
                pointsExecution = 9.350;
            }
            
            
            
            
        } else if (instrument.equals("rope")) {
            if (country.equals("Russia")) {
                pointsDifficulty = 9.600;
                pointsExecution = 9.000;
            } else if (country.equals("Bulgaria")) {
                pointsDifficulty = 9.500;
                pointsExecution = 9.400;
            } else if (country.equals("Italy")) {
                pointsDifficulty = 9.700;
                pointsExecution = 9.150;
            }


        }

        double allPoints = pointsDifficulty + pointsExecution;
        double diff = 20 - allPoints;
        double diffPercent = (diff / 20) * 100;


        System.out.printf("The team of Bulgaria get %.3f on ribbon.%n", allPoints);
        System.out.printf("%.2f%%", diffPercent);


    }
}
