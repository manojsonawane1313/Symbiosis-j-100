package github_assignment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define the date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter your date of birth (dd/MM/yyyy): ");
        String inputDate = scanner.nextLine();

        // Parse the input date
        LocalDate birthDate = LocalDate.parse(inputDate, formatter);
        
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        
        // Calculate the age
        Period age = Period.between(birthDate, currentDate);

        // Output the age
        System.out.println("You are " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days old.");
        
        scanner.close();
    }
}
