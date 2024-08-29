package full_stack;
import java.util.Scanner;

public class areaCircumferenceOfCircle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = Math.PI; // Using the built-in value of PI

        // Input the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate the area and circumference
        double area = PI * Math.pow(radius, 2);
        double circumference = 2 * PI * radius;

        // Display the results
        System.out.println("The area of the circle is: " + area);
        System.out.println("The circumference of the circle is: " + circumference);

        scanner.close();
    }
}
