package full_stack;

public class swap_call_by_ref {

    // Class to hold numbers
    static class NumberPair {
        int a;
        int b;

        NumberPair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    // Method to swap numbers (call by reference)
    public static void swap(NumberPair pair) {
        pair.a = pair.a + pair.b;
        pair.b = pair.a - pair.b;
        pair.a = pair.a - pair.b;
    }

    public static void main(String[] args) {
        NumberPair pair = new NumberPair(10, 20);

        System.out.println("Before swap:");
        System.out.println("a = " + pair.a);
        System.out.println("b = " + pair.b);

        swap(pair);

        System.out.println("After swap (call by reference):");
        System.out.println("a = " + pair.a);
        System.out.println("b = " + pair.b);
    }
}
