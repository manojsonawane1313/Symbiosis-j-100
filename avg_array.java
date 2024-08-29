package full_stack;

import java.util.Scanner;

public class avg_array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        
        // Initialize the array
        double[] numbers = new double[size];
        
        // Input the elements of the array
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextDouble();
        }
        
        // Calculate the sum of the elements
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        
        // Calculate the average
        double average = sum / size;
        
        // Display the average
        System.out.println("The average of the numbers is: " + average);

        scanner.close();
    }
}
