package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P01_WorkingWithStacks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> stack = new ArrayDeque<>();

        while (!input.equals("Home")) {

           if (!input.equals("back")) {
               stack.push(input);
               System.out.println(stack.peek());
           } else if (input.equals("back")){

               if (stack.size() > 1) {
                   stack.pop();
                   System.out.println(stack.peek());
               } else {
                   System.out.println("no previous URLs");
               }
           }



                input = scanner.nextLine();

        }

    }
}
