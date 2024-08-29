package full_stack;

import java.util.Scanner;

public class add_of_matrics{

    // Method to read a matrix
    public static void readMatrix(int[][] matrix, Scanner scanner, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2, int rows, int cols) {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions of the matrices
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        
        // Initialize the matrices
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        
        // Read elements of the first matrix
        System.out.println("Enter elements of the first matrix:");
        readMatrix(matrix1, scanner, rows, cols);
        
        // Read elements of the second matrix
        System.out.println("Enter elements of the second matrix:");
        readMatrix(matrix2, scanner, rows, cols);
        
        // Add the matrices
        int[][] result = addMatrices(matrix1, matrix2, rows, cols);
        
        // Print the result
        System.out.println("The result of matrix addition is:");
        printMatrix(result);

        scanner.close();
    }
}
