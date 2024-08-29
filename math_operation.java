package full_stack;
import java.util.Scanner;

public class math_operation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            // Display the menu
            System.out.println("\nSelect an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Remainder");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= 5) {
                // Get the numbers from the user
                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();

                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();

                double result = 0;

                switch (choice) {
                    case 1:
                        result = num1 + num2;
                        System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                        break;
                    case 2:
                        result = num1 - num2;
                        System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                        break;
                    case 3:
                        result = num1 * num2;
                        System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                        break;
                    case 4:
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                        break;
                    case 5:
                        if (num2 != 0) {
                            result = findRemainder((int) num1, (int) num2);
                            System.out.println("Result: Remainder of " + (int) num1 + " divided by " + (int) num2 + " is: " + (int) result);
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                        break;
                }
            } else if (choice == 6) {
                continueProgram = false;
                System.out.println("Exiting the program. Goodbye!");
            } else {
                System.out.println("Invalid choice! Please select a valid operation.");
            }
        }

        scanner.close();
    }

    // Method to find remainder without using the modulo operator
    public static int findRemainder(int dividend, int divisor) {
        int absDividend = Math.abs(dividend);
        int absDivisor = Math.abs(divisor);

        while (absDividend >= absDivisor) {
            absDividend -= absDivisor;
        }

        return (dividend < 0) ? -absDividend : absDividend;
    }
}
