package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class P05HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, tokens);

        int counter = 0;


        while (queue.size() > 1) {
            String firstKid = queue.poll();

            counter++;
            if (counter % n == 0) {

                System.out.println("Removed " + firstKid);
            } else {
                queue.offer(firstKid);
            }


        }

        System.out.println("Last is " + queue.peek());


    }
}
