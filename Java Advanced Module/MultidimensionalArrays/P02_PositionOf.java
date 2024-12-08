package MultidimensionalArrays;

import java.util.Scanner;

public class P02_PositionOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        fillMatrix(matrix, scanner);

        int neededNumber = scanner.nextInt();

        boolean isFound = false;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == neededNumber) {
                    System.out.println(row + " " + col);
                    isFound = true;
                }
            }

        }

        if (!isFound) {
            System.out.println("not found");
        }

    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix[rows].length; cols++) {
                matrix[rows][cols] = scanner.nextInt();
            }
        }

    }
}
