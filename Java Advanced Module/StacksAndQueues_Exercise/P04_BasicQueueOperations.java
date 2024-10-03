package StacksAndQueues_Exercise;

import java.util.*;

public class P04_BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersInput = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int n = numbersInput[0];
        int s = numbersInput[1];
        int x = numbersInput[2];

        String[] numbers = scanner.nextLine().split("\\s+");

        Deque<Integer> queue = new ArrayDeque<>();

        for (String number : numbers) {
            queue.offer(Integer.parseInt(number));
        }

        for (int i = 0; i < s; i++) {
            queue.poll();
        }

        if (queue.isEmpty()){
            System.out.println("0");
        } else if (queue.contains(x)) {
            System.out.println("true");
        } else {
            System.out.println(Collections.min(queue));
        }


    }
}
