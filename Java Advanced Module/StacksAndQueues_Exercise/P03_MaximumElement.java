package StacksAndQueues_Exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class P03_MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String input = tokens[0];

            if (input.equals("1")) {
                int number = Integer.parseInt(tokens[1]);
                stack.push(number);

            } else if (input.equals("2")) {
                stack.pop();
            } else if (input.equals("3")) {
                System.out.println(Collections.max(stack));
            }


        }
    }
}
