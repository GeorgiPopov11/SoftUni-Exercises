package MethodsLab;

import java.util.Scanner;

public class P04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        if (input.equals("add")){
            System.out.println(addNum(number1, number2));
        } else if (input.equals("subtract")) {
            System.out.println(subtractNum(number1, number2));
        } else if (input.equals("multiply")) {
            System.out.println(multiplyNum(number1, number2));
        } else if (input.equals("divide")) {
            System.out.println(divideNum(number1, number2));
        }


//        if (input.equals("subtract")) {
//            subtract(number1, number2);
//        } else if (input.equals("multiply")) {
//            multiply(number1, number2);
//        } else if (input.equals("divide")) {
//            divide(number1, number2);
//        } else if (input.equals("add")) {
//            addTo(number1, number2);
//        }
//
//
//    }
//
//    public static void subtract (int one, int two) {
//        int result = one - two;
//        System.out.println(result);
//    }
//
//    public static void multiply(int one, int two) {
//        int result = one * two;
//        System.out.println(result);
//    }
//
//    public static void divide (int one, int two) {
//        int result = one / two;
//        System.out.println(result);
//    }
//
//    public static void addTo (int one, int two) {
//        int result = one + two;
//        System.out.println(result);//

    }

    public static int addNum(int num1, int num2){
        int result = num1 + num2;
        return result;
    }
    public static int multiplyNum(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }
    public static int subtractNum(int num1, int num2) {
        return num1 - num2;
    }
    public static int divideNum(int num1, int num2){
        return num1 / num2;
    }
}
