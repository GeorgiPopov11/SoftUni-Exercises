package Exam;

import java.util.Scanner;

public class HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int goal = Integer.parseInt(scanner.nextLine());

        int countJumps = 0;
        boolean isValid = true;

        for (int i = goal - 30; i <= goal ; i+=5) {

            int countBadJumps = 0;


            for (int j = 1; j <=3 ; j++) {
                countJumps++;
            int currentJump = Integer.parseInt(scanner.nextLine());

            if (currentJump > i) {
                break;
            } else  {
                countBadJumps++;

            }


            }

            if (countBadJumps == 3) {
                System.out.printf("Tihomir failed at %dcm after %d jumps.", i, countJumps);
                isValid = false;
                break;
            }



            
        }

        if (isValid) {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", goal, countJumps);
        }
        

    }
}
