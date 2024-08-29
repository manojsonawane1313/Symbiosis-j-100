package full_stack;

import java.util.Scanner;

public class squareRoot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a non-negative number: ");
        double number = scanner.nextDouble();

        // Check if the number is non-negative
        if (number < 0) {
            System.out.println("Square root is not defined for negative numbers.");
        } else {
            // Calculate the square root
            double squareRoot = Math.sqrt(number);
            // Display the result
            System.out.println("The square root of " + number + " is: " + squareRoot);
        }

        scanner.close();
    }
}
