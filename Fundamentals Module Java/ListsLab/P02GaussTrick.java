package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> number = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

            int listLenght = number.size();
        for (int i = 0; i < listLenght / 2; i++) {
            int firstNum = number.get(i);
            int lastNum = number.get(number.size() - 1);
            int result = firstNum + lastNum;

            number.set(i, result);
            number.remove(number.size() - 1);

        }

        for (int numberPrint : number) {
            System.out.print(numberPrint + " ");
        }
    }
}
