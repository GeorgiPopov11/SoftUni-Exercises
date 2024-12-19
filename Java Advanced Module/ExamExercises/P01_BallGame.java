package ExamExercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class P01_BallGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] m = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Deque<Integer> strengthStack = new ArrayDeque<>();
        Deque<Integer> accuracyQueue = new ArrayDeque<>();
        fillStack(n, strengthStack);
        fillQueue(m, accuracyQueue);

        int goalsScored = 0;

        while (!strengthStack.isEmpty() && !accuracyQueue.isEmpty()) {
            int currentStrength = strengthStack.peek();
            int currentAccuracy = accuracyQueue.peek();

            if (currentStrength + currentAccuracy == 100) {
                goalsScored++;
                strengthStack.pop();
                accuracyQueue.poll();
            } else if (currentStrength + currentAccuracy < 100) {
                if (currentStrength < currentAccuracy) {
                    strengthStack.pop();
                } else if (currentStrength > currentAccuracy) {
                    accuracyQueue.poll();
                } else {
                    int summedValues = currentStrength + currentAccuracy;
                    strengthStack.pop();
                    strengthStack.push(summedValues);
                    accuracyQueue.poll();
                }
            } else if (currentStrength + currentAccuracy > 100) {
                int strengthValue = strengthStack.pop() - 10;
                strengthStack.push(strengthValue);
                if (!accuracyQueue.isEmpty()) {
                    int accuracyValue = accuracyQueue.poll();
                    accuracyQueue.offer(accuracyValue);
                }
            }
        }
        printGoals(goalsScored);
        if (!strengthStack.isEmpty()) {
            StringBuilder sb = new StringBuilder("Strength values left: ");
            for (Integer number : strengthStack) {
                sb.append(strengthStack.pop()).append(", ");
            }
            if (sb.length() > 0) {
                sb.setLength(sb.length() - 2);
            }
            System.out.println(sb);
        }

        if (!accuracyQueue.isEmpty()) {
            StringBuilder sb = new StringBuilder("Accuracy values left: ");
            for (Integer number : accuracyQueue) {
                sb.append(number).append(", ");
            }
            if (sb.length() > 0) {
                sb.setLength(sb.length() - 2);
            }
            System.out.println(sb);
        }
    }


    public static void printGoals(int goals) {
        if (goals == 3) {
            System.out.println("Paul scored a hat-trick!");
        } else if (goals == 0) {
            System.out.println("Paul failed to score a single goal.");
        } else if (goals > 3) {
            System.out.println("Paul performed remarkably well!");
        } else if (goals > 0 && goals < 3) {
            System.out.println("Paul failed to make a hat-trick.");
        }
        if (goals > 0) {
            System.out.println("Goals scored: " + goals);
        }
    }

    private static void fillQueue(int[] numbers, Deque<Integer> queue) {
        for (int number : numbers) {
            queue.offer(number);
        }
    }

    private static void fillStack(int[] numbers, Deque<Integer> stack) {
        for (int number : numbers) {
            stack.push(number);
        }
    }
}








