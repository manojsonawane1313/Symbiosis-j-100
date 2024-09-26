package github_assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class User {
    private String userId;
    private String username;
    private int age;
    private String address;

    public User(String userId, String username, int age, String address) {
        this.userId = userId;
        this.username = username;
        this.age = age;
        this.address = address;
    }

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User ID: " + userId + ", Username: " + username + ", Age: " + age + ", Address: " + address;
    }
}

class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super(message);
    }
}

public class UserManagementSystem {
    private static Map<String, User> userDatabase = new HashMap<>();
    private static int userIdCounter = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nUser Management System");
            System.out.println("1. Register User");
            System.out.println("2. Find User by ID");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    registerUser(scanner);
                    break;
                case 2:
                    findUserById(scanner);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void registerUser(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        if (age < 18 || age > 68) {
            System.out.println("Invalid age. User registration failed.");
            return;
        }

        String userId = "USER" + userIdCounter++;
        User user = new User(userId, username, age, address);
        userDatabase.put(userId, user);
        System.out.println("User registered successfully with User ID: " + userId);
    }

    private static void findUserById(Scanner scanner) {
        System.out.print("Enter User ID to find: ");
        String userId = scanner.nextLine();
        try {
            User user = userDatabase.get(userId);
            if (user == null) {
                throw new UserNotFoundException("User with ID " + userId + " not found.");
            }
            System.out.println(user);
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
