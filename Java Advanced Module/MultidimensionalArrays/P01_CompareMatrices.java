package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P01_CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowsA = scanner.nextInt();
        int colsA = scanner.nextInt();

        int[][] matrixA = new int[rowsA][colsA];
        fillMatrix(matrixA, scanner);

        int rowsB = scanner.nextInt();
        int colsB = scanner.nextInt();
        int[][] matrixB = new int[rowsB][colsB];
        fillMatrix(matrixB, scanner);


        if (matricesAreEqual(matrixA, matrixB)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

    }

    private static boolean matricesAreEqual(int[][] matrixA, int[][] matrixB) {
        if (matrixA.length != matrixB.length) {
            return false;
        }

        for (int row = 0; row < matrixA.length; row++) {
            if (matrixA[row].length != matrixB[row].length) {

                return false;
            }
            for (int col = 0; col < matrixA[row].length; col++) {
                if (matrixA[row][col] != matrixB[row][col]) {
                    return false;
                }
            }

        }

        return true;
    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix[rows].length; cols++) {
                matrix[rows][cols] = scanner.nextInt();
            }
        }

    }
}
