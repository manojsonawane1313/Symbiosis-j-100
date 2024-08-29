package full_stack;

import java.util.Scanner;

public class areaOfRectangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the length of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        // Input the width of the rectangle
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Calculate the area
        double area = length * width;

        // Display the result
        System.out.println("The area of the rectangle is: " + area);

        scanner.close();
    }
}
