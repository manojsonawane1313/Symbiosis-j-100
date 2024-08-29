package full_stack;

import java.util.Scanner;

public class asci_value {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the character
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);

        // Calculate the ASCII value
        int asciiValue = (int) character;

        // Display the result
        System.out.println("The ASCII value of '" + character + "' is: " + asciiValue);

        scanner.close();
    }
}
