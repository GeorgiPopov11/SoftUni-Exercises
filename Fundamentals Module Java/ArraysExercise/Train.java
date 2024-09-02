package ArraysExercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());


        int [] arrayNum = new int[n];

        int sumPeople = 0;


        for (int i = 0; i < n; i++) {
            arrayNum[i] = Integer.parseInt(scanner.nextLine());

            sumPeople += arrayNum[i];



        }

        for (int i = 0; i < arrayNum.length; i++) {
            System.out.print(arrayNum[i] + " ");
        }


        System.out.println();
        System.out.println(sumPeople);



    }
}
