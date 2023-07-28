package Numberis;

import java.util.Scanner;

class NumberIsGreaterException extends Exception {
    public NumberIsGreaterException() {
        super("Number is greater than expected.");
    }

    public NumberIsGreaterException(String message) {
        super(message);
    }
}

class NumberIsLesserException extends Exception {
    public NumberIsLesserException() {
        super("Number is lesser than expected.");
    }

    public NumberIsLesserException(String message) {
        super(message);
    }
}

public class exceptionexample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int expectedNumber = 100;
            System.out.print("Enter a number: ");
            int inputNumber = scanner.nextInt();

            if (inputNumber > expectedNumber) {
                throw new NumberIsGreaterException();
            } else if (inputNumber < expectedNumber) {
                throw new NumberIsLesserException();
            } else {
                System.out.println("Congratulations! You guessed the number correctly.");
            }
        } catch (NumberIsGreaterException | NumberIsLesserException ex) {
            System.out.println("Exception: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("An unexpected error occurred: " + ex.getMessage());
        } finally {
            scanner.close();
        }
    }
}
