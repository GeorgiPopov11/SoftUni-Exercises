package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class P12TradeComissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());

        double commission = 0;
        boolean valid = true;

        if (city.equals("Sofia")) {
            if (sales >= 0 && sales <= 500) {
                commission = sales * 0.05;
            } else if (sales > 500 && sales <= 1000) {
                commission = sales * 0.07;
            } else if (sales > 1000 && sales <= 10000) {
                commission = sales * 0.08;
            } else if (sales > 10000) {
                commission = sales * 0.12;
            } else {
                valid = false;
                System.out.println("error");
            }


        } else if (city.equals("Varna")) {
            if (sales >= 0 && sales <= 500) {
                commission = sales * 0.045;
            } else if (sales > 500 && sales <= 1000) {
                commission = sales * 0.075;
            } else if (sales > 1000 && sales <= 10000) {
                commission = sales * 0.10;
            } else if (sales > 10000) {
                commission = sales * 0.13;
            } else {
                valid = false;
                System.out.println("error");
            }
            
            
            
        } else if (city.equals("Plovdiv")) {
            if (sales >= 0 && sales <= 500) {
                commission = sales * 0.055;
            } else if (sales > 500 && sales <= 1000) {
                commission = sales * 0.08;
            } else if (sales > 1000 && sales <= 10000) {
                commission = sales * 0.12;
            } else if (sales > 10000) {
                commission = sales * 0.145;
            } else {
                valid = false;
                System.out.println("error");
            }



        } else {
            valid = false;
            System.out.println("error");

        }
        if (valid){
            System.out.printf("%.2f", commission);
        }



    }

}
