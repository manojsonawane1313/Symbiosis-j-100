package full_stack;

import java.util.Scanner;

public class calculate_power {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the base number
        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();

        // Input the exponent
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();

        // Calculate the power
        double result = Math.pow(base, exponent);

        // Display the result
        System.out.println("power is: "+ result);

        scanner.close();
    }
}
