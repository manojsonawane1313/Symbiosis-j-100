package full_stack;

import java.util.Scanner;

public class factorial {

    // Method to calculate factorial iteratively
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        // Check if the number is non-negative
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Calculate factorial
            long factorial = factorialIterative(number);
            // Display the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        scanner.close();
    }
}
