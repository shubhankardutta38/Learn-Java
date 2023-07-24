package Exercise14;

import java.util.Scanner;

public class calculator {
    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return dividend / divisor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend;
        int divisor;
        System.out.println("enter divident : ");
        dividend = sc.nextInt();
        System.out.println("enter divisor :");
        divisor = sc.nextInt();
        try {
            int result = divide(dividend, divisor);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
