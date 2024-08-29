package full_stack;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int limit = scanner.nextInt();

        // Initialize the array with the specified size
        int[] number = new int[limit];

        System.out.println("Enter the numbers: ");
        for (int i = 0; i < limit; i++) {
            number[i] = scanner.nextInt();
        }

        // Sorting logic (e.g., Bubble Sort)
        for (int i = 0; i < limit; i++) {
            for (int j = i + 1; j < limit; j++) {
                if (number[i] > number[j]) {
                    // Swap elements
                    int temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("Sorted numbers: ");
        for (int i = 0; i < limit; i++) {
            System.out.print(number[i] + " ");
        }
    }
}
