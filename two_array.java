package full_stack;

import java.util.Scanner;

public class two_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many rows do you want:");
        int rows = input.nextInt();

        System.out.println("How many columns do you want:");
        int columns = input.nextInt();   

        String[][] array = new String[rows][columns];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = input.next();
            }
        }

        System.out.println("Your inputs are below:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();  // Move to the next line after each row
        }

        input.close();
    }
}
