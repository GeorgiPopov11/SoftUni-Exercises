package MidExamExercise;

import java.util.Scanner;

public class P02MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rooms = scanner.nextLine().split("\\|");


        int health = 100;
        int bitcoins = 0;
        int roomCount = 0;

        boolean isAlive = true;


        for (int i = 0; i < rooms.length; i++) {
            if (!isAlive) {
                break;
            }
            roomCount++;
            String room = rooms[i];
            String command = room.split(" ")[0];
            int currency = Integer.parseInt(room.split(" ")[1]);

            switch (command) {
                case "potion":
                    int currentHealth = health;
                    health += currency;
                     //health 90 + heal 30 = 120
                    if (health > 100) {
                        health = 100;
                        System.out.printf("You healed for %d hp.%n", health - currentHealth);

                    } else {
                        System.out.printf("You healed for %d hp.%n", currency);
                    }
                    System.out.printf("Current health: %d hp.%n", health);
                    break;

                case "chest":
                    bitcoins += currency;
                    System.out.printf("You found %d bitcoins.%n", currency);

                    break;

                default: //monster
                    health -= currency;
                    if (health > 0) {
                        System.out.printf("You slayed %s.%n", command);
                    } else if (health <= 0) {
                        System.out.printf("You died! Killed by %s.%n", command);
                        System.out.printf("Best room: %d%n", roomCount);
                        isAlive = false;
                    }


                    break;
            }




        }

        if (isAlive) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d%n", health);
        }



    }
}
