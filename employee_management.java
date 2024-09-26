package github_assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Employee {
    private int id;
    private double salary;
    private String location;

    public Employee(int id, double salary, String location) {
        this.id = id;
        this.salary = salary;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Employee ID: " + id + ", Salary: " + salary + ", Location: " + location;
    }
}

public class employee_management {
    private List<Employee> employees;
    private Scanner scanner;

    public employee_management() {
        employees = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Location: ");
        String location = scanner.nextLine();
        employees.add(new Employee(id, salary, location));
        System.out.println("Employee added successfully.");
    }

    public void shareEmployee() {
        System.out.print("Enter Employee ID to share: ");
        int id = scanner.nextInt();
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                System.out.println("Sharing employee: " + employee);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public void sortEmployees() {
        System.out.println("Sort employees by:\n1. ID\n2. Salary\n3. Location");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                Collections.sort(employees, Comparator.comparingInt(Employee::getId));
                break;
            case 2:
                Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary));
                break;
            case 3:
                Collections.sort(employees, Comparator.comparing(Employee::getLocation));
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }
        System.out.println("Employees sorted successfully.");
        displayEmployees();
    }

    public void displayEmployees() {
        System.out.println("Employees List:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void main(String[] args) {
    	employee_management management = new employee_management();
        while (true) {
            System.out.println("\n1. Add Employee");
            System.out.println("2. Share Employee");
            System.out.println("3. Sort Employees");
            System.out.println("4. Display Employees");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    management.addEmployee();
                    break;
                case 2:
                    management.shareEmployee();
                    break;
                case 3:
                    management.sortEmployees();
                    break;
                case 4:
                    management.displayEmployees();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
