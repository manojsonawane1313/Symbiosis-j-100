package full_stack;

import java.util.Scanner;

public class grade_calculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the student's marks
        System.out.print("Enter the student's marks (0 to 100): ");
        double marks = scanner.nextDouble();

        // Determine the grade based on the marks
        char grade;
        if (marks >= 80) {
            grade = 'A';
        } else if (marks >= 70) {
            grade = 'B';
        } else if (marks >= 60) {
            grade = 'C';
        } else if (marks >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display the grade
        System.out.println("The grade for marks " + marks + " is: " + grade);

        scanner.close();
    }
}
