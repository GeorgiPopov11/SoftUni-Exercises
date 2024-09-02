package ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).toList();
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).toList();


        List<Integer> resultList = new ArrayList<>();

        int minSize = Math.min(firstList.size(), secondList.size());

        //3 5 2 43 12 3 54 10 23
       // 76 5 34 2 4 12

        for (int i = 0; i < minSize; i++) {
            int first = firstList.get(i);
            int second = secondList.get(i);
            resultList.add(first);
            resultList.add(second);




        }

        if (firstList.size() > secondList.size()) {
            List<Integer> subList = firstList.subList(minSize, firstList.size());
            resultList.addAll(subList);

        } else if (secondList.size() > firstList.size()) {
            List<Integer> subList = secondList.subList(minSize, secondList.size());
            resultList.addAll(subList);

        }

        System.out.println(resultList.toString().replaceAll("[\\[\\],]", ""));


    }
}
