package ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P04ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).toList();

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[] tokens = input.split(" ");

            if (tokens[0].equals("Contains")) {
                if (numbersList.contains(Integer.parseInt(tokens[1]))){
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number ");
                }

            } else if (tokens[0].equals("Print") && tokens [1].equals("even")) {
                for (int even : numbersList) {
                    if (even % 2 == 0) {
                        System.out.print(even + " ");
                    }
                }
                System.out.println();
                
                
            } else if (tokens[0].equals("Print") && tokens[1].equals("odd")) {
                for (int odd : numbersList) {
                    if (odd % 2 != 0) {
                        System.out.print(odd + " ");
                    }
                }
                System.out.println();
                
                
            } else if (tokens[0].equals("Get") && tokens[1].equals("sum")) {
                int sum = 0;
                for (int number : numbersList){
                    sum += number;
                }
                System.out.println(sum);
                
            } else if (tokens[0].equals("Filter")) {
                List<Integer> filterList = new ArrayList<>();

                if (tokens[1].equals("<")){
                    for (int number : numbersList) {
                        if (number < Integer.parseInt(tokens[2])) {
                            filterList.add(number);
                        }
                    }


                } else if (tokens[1].equals(">")) {
                    for (int number : numbersList) {
                        if (number > Integer.parseInt(tokens[2])){
                            filterList.add(number);
                        }
                    }


                } else if (tokens[1].equals(">=")) {
                    for (int number : numbersList) {
                        if (number >= Integer.parseInt(tokens[2])){
                            filterList.add(number);
                        }
                    }

                    
                } else if (tokens[1].equals("<=")) {
                    for (int number : numbersList) {
                        if (number <= Integer.parseInt(tokens[2])) {
                            filterList.add(number);
                        }
                    }

                }

                System.out.println(filterList.toString().replaceAll("[\\[\\],]", ""));
            }


            input = scanner.nextLine();
        }

    }
}
 36k