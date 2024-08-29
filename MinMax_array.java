package full_stack;

import java.util.Scanner;

public class MinMax_array {

    // Method to find the minimum and maximum values in an array
    public static void findMinMax(int[] array) {
        if (array.length == 0) {
            System.out.println("The array is empty.");
            return;
        }

        int min = array[0];
        int max = array[0];

        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("The minimum value in the array is: " + min);
        System.out.println("The maximum value in the array is: " + max);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Initialize the array
        int[] numbers = new int[size];

        // Input the elements of the array
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Find and display the minimum and maximum values
        findMinMax(numbers);

        scanner.close();
    }
}
