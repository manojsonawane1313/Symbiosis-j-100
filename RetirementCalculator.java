package github_assignment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class RetirementCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter the date of joining (dd/MM/yyyy): ");
        String inputDate = scanner.nextLine();

        // Parse the input date
        LocalDate joiningDate = LocalDate.parse(inputDate, formatter);

        // Calculate retirement date (58 years after joining)
        LocalDate retirementDate = joiningDate.plusYears(58);

        // Output the retirement date
        System.out.println("The retirement date is: " + retirementDate.format(formatter));

        scanner.close();
    }
}
