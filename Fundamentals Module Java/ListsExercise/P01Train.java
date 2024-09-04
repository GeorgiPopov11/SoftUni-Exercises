package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagonsList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] command = input.split(" ");

            if (command[0].equals("Add")) {
                int passengers = Integer.parseInt(command[1]);
                wagonsList.add(passengers);

            } else {
                int currentPassengers = Integer.parseInt(command[0]);

                for (int i = 0; i < wagonsList.size(); i++) {
                    if (currentPassengers + wagonsList.get(i) <= maxCapacity) {
                        wagonsList.set(i, currentPassengers + wagonsList.get((i)));
                        break;
                    }


                }
                
                
                
                
            }











            input = scanner.nextLine();
        }



        for (int wagons : wagonsList){
            System.out.print(wagons + " ");
        }
    }
}
