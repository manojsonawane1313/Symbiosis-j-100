package full_stack;

import java.util.Scanner;

public class palindrome {

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        // Convert number to string
        String original = Integer.toString(number);
        // Reverse the string
        String reversed = new StringBuilder(original).reverse().toString();
        // Check if the original string is equal to the reversed string
        return original.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a palindrome
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        scanner.close();
    }
}
