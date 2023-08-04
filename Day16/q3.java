
/*
 * Write a Java function, check_double(number) which accepts 
a whole number and returns True if it satisfies the given
conditions.
1.	The number and its double should have exactly the 
same number of digits.
2.	Both the numbers should have the same digits ,but in 
      different order.
Otherwise it should return False.
 */
import java.util.Arrays;
public class q3 {
    public static void main(String[] args) {
        int number1 = 125;
        int number2 = 251;

        System.out.println(check_double(number1)); // Output: true
        System.out.println(check_double(number2)); // Output: true
    }

    public static boolean check_double(int number) {
        String numString = Integer.toString(number);
        String doubleNumString = Integer.toString(number * 2);

        if (numString.length() != doubleNumString.length()) {
            return false;
        }

        char[] numDigits = numString.toCharArray();
        char[] doubleNumDigits = doubleNumString.toCharArray();
        Arrays.sort(numDigits);
        Arrays.sort(doubleNumDigits);

        return Arrays.equals(numDigits, doubleNumDigits);
    }
}
