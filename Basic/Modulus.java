import java.util.Scanner;

public class Modulus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n = sc.nextInt();

        System.out.print("Enter second number: ");
        int m = sc.nextInt();

        // Modulus cannot be calculated when divisor is 0
        if (m == 0) {
            System.out.println("Modulus by zero is not possible.");
            return;
        }

        int modulus = n % m;

        System.out.println("Remainder of " + n + " % " + m + " is: " + modulus);

        /*
         Properties of modulus (%):

         1. a % b gives the remainder after dividing a by b.
            Example: 10 % 3 = 1

         2. If a is divisible by b, then a % b is 0.
            Example: 12 % 4 = 0

         3. If a < b and both are positive, then a % b = a.
            Example: 3 % 5 = 3

         4. a % 1 is always 0.
            Example: 25 % 1 = 0

         5. Modulus by 0 is not allowed.
            Example: 10 % 0 causes ArithmeticException.

         6. In Java, the remainder has the same sign as the first number.
            Example: -10 % 3 = -1
         */
        
        sc.close();
    }
}