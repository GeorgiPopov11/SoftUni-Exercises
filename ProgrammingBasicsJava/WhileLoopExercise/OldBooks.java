package WhileLoopExercise;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String neededBook = scanner.nextLine();

        String nextBook = scanner.nextLine();
        int countBooksChecked = 0;
        boolean isValid = true;


        while (!nextBook.equals("No More Books")) {


            if (nextBook.equals(neededBook)) {
                isValid = false;
                System.out.printf("You checked %d books and found it.", countBooksChecked);
                break;
            }
            countBooksChecked++;
            nextBook = scanner.nextLine();
        }

        if (isValid) {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", countBooksChecked);

        }
    }
}
