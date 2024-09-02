package MethodsLab;

import java.util.Scanner;

public class P09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String value = scanner.nextLine();
        String firstValue = scanner.nextLine();
        String secondValue = scanner.nextLine();

        if (value.equals("int")){
            int first = Integer.parseInt(firstValue);
            int second = Integer.parseInt(secondValue);
            System.out.println(getMax(first, second));
        } else if (value.equals("char")) {
            System.out.println(getMax(firstValue, secondValue));
        } else if (value.equals("string")) {
            System.out.println(getMax(firstValue, secondValue));
        }


    }
    public static int getMax(int first, int second) {
        if (first > second) {
            return first;
        }
        return second;
    }

    public static char getMax(char first, char second) {
        if (first > second) {
            return first;
        }
            return second;
    }

    public static String getMax(String first, String second){
        if (first.compareTo(second) >= 0) {
            return first;
        }
            return second;
    }
}
