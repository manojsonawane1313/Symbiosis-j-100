package full_stack;

public class remainder_without_mod {

    public static int findRemainder(int dividend, int divisor) {
        // Handle case when divisor is 0
        if (divisor == 0) {
            throw new ArithmeticException("Divisor cannot be zero");
        }

        // Take absolute values to handle negative numbers
        int absDividend = Math.abs(dividend);
        int absDivisor = Math.abs(divisor);

        // Subtract the divisor from the dividend until the dividend is smaller than the divisor
        while (absDividend >= absDivisor) {
            absDividend -= absDivisor;
        }

        // If the original dividend was negative, the remainder should also be negative
        return (dividend < 0) ? -absDividend : absDividend;
    }

    public static void main(String[] args) {
        int dividend = 25;
        int divisor = 4;

        int remainder = findRemainder(dividend, divisor);

        System.out.println("The remainder of " + dividend + " divided by " + divisor + " is: " + remainder);
    }

}
