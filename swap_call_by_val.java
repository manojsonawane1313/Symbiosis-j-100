package full_stack;

public class swap_call_by_val {

    // Method to swap numbers (call by value)
    public static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        swap(x, y);

        System.out.println("After swap (call by value):");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
