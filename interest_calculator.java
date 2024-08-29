package full_stack;

import java.util.Scanner;

public class interest_calculator {

    // Method to calculate simple interest
    public static double calculateSimpleInterest(double principal, double rate, int time) {
        return (principal * rate * time) / 100;
    }

    // Method to calculate compound interest
    public static double calculateCompoundInterest(double principal, double rate, int time, int timesCompounded) {
        return principal * Math.pow((1 + rate / (100 * timesCompounded)), timesCompounded * time) - principal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for simple interest
        System.out.print("Enter principal for simple interest: ");
        double principalSimple = scanner.nextDouble();
        System.out.print("Enter annual interest rate (in %): ");
        double rateSimple = scanner.nextDouble();
        System.out.print("Enter time in years: ");
        int timeSimple = scanner.nextInt();

        double simpleInterest = calculateSimpleInterest(principalSimple, rateSimple, timeSimple);
        System.out.println("Simple Interest: " + simpleInterest);

        // Input for compound interest
        System.out.print("Enter principal for compound interest: ");
        double principalCompound = scanner.nextDouble();
        System.out.print("Enter annual interest rate (in %): ");
        double rateCompound = scanner.nextDouble();
        System.out.print("Enter time in years: ");
        int timeCompound = scanner.nextInt();
        System.out.print("Enter number of times interest is compounded per year: ");
        int timesCompounded = scanner.nextInt();

        double compoundInterest = calculateCompoundInterest(principalCompound, rateCompound, timeCompound, timesCompounded);
        System.out.println("Compound Interest: " + compoundInterest);

        scanner.close();
    }
}
