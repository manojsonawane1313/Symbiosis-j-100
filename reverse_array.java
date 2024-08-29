package full_stack;

import java.util.Scanner;

public class reverse_array {

    // Method to reverse the array
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        
        while (start < end) {
            // Swap elements at start and end
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            
            // Move towards the center
            start++;
            end--;
        }
    }

    // Method to print the array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
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
        
        // Display the original array
        System.out.println("Original array:");
        printArray(numbers);
        
        // Reverse the array
        reverseArray(numbers);
        
        // Display the reversed array
        System.out.println("Reversed array:");
        printArray(numbers);

        scanner.close();
    }
}
