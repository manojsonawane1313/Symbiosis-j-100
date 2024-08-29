package full_stack;

import java.util.Arrays;
import java.util.Scanner;

public class sort_array_asc {

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
        
        // Sort the array in ascending order
        Arrays.sort(numbers);
        
        // Display the sorted array
        System.out.println("Sorted array in ascending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}
