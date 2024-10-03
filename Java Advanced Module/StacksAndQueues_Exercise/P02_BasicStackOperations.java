package StacksAndQueues_Exercise;

import java.util.*;

public class P02_BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputNumbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int n = inputNumbers[0];
        int s = inputNumbers[1];
        int x = inputNumbers[2];

        Deque<Integer> stack = new ArrayDeque<>();

        String[] numbers = scanner.nextLine().split("\\s+");
        for (String number : numbers) {
            stack.push(Integer.parseInt(number));
        }

        for (int i = 0; i < s; i++) {
            stack.pop();
        }

        if (stack.contains(x)) {
            System.out.println("true");
        } else if (stack.isEmpty()){
            System.out.println("0");
        } else {
            System.out.println(Collections.min(stack));
        }




    }
}
