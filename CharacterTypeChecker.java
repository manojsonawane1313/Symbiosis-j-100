package full_stack;

import java.util.Scanner;

public class CharacterTypeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        // Check if the character is a digit
        if (Character.isDigit(inputChar)) {
            System.out.println("The character '" + inputChar + "' is a digit.");
        }
        // Check if the character is an alphabet (either uppercase or lowercase)
        else if (Character.isLetter(inputChar)) {
            System.out.println("The character '" + inputChar + "' is an alphabet.");
        }
        // If it's neither a digit nor a letter, it must be a special symbol
        else {
            System.out.println("The character '" + inputChar + "' is a special symbol.");
        }

        scanner.close();
    }
}
