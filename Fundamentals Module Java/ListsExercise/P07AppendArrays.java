package ListsExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbersList = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());



        List<String> firstArrayList = Arrays.stream(numbersList.get(0).split(" ")).toList();

        List<String> secondArrayList = Arrays.stream(numbersList.get(1).split(" ")).toList();











        System.out.println(numbersList);

    }
}
