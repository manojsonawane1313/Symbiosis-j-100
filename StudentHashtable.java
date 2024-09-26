package github_assignment;

import java.util.Hashtable;
import java.util.Scanner;

class Student {
    private String rollNo;
    private String dob; // Date of Birth
    private String name;
    private String course;

    public Student(String rollNo, String dob, String name, String course) {
        this.rollNo = rollNo;
        this.dob = dob;
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", DOB: " + dob + ", Name: " + name + ", Course: " + course;
    }
}

public class StudentHashtable {
    public static void main(String[] args) {
        // Create a Hashtable to store student data
        Hashtable<String, Student> studentTable = new Hashtable<>();
        Scanner scanner = new Scanner(System.in);
        
        // Number of students to add
        System.out.print("Enter the number of students to add: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Loop to accept student data
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter Roll No: ");
            String rollNo = scanner.nextLine();

            System.out.print("Enter Date of Birth (dd/MM/yyyy): ");
            String dob = scanner.nextLine();

            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Course Enrolled: ");
            String course = scanner.nextLine();

            // Create a new Student object and add it to the hashtable
            Student student = new Student(rollNo, dob, name, course);
            studentTable.put(rollNo, student);
        }

        // Print the hashtable
        System.out.println("\nStudent Data in Hashtable:");
        for (String rollNo : studentTable.keySet()) {
            System.out.println(studentTable.get(rollNo));
        }

        scanner.close();
    }
}
