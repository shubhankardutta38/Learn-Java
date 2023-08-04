/*
 * Write a python function, nearest_palindrome() which accepts a 
*number and returns the nearest palindrome greater than the 
*given number. 
 *         Sample   Input	  Expected Output
	      99	    101
               1221	   1331
 */
public class q2 {
    public static void main(String[] args) {
        int input1 = 99;
        int input2 = 1221;

        System.out.println("Nearest palindrome greater than " + input1 + ": " + nearest_palindrome(input1)); // Output: 101
        System.out.println("Nearest palindrome greater than " + input2 + ": " + nearest_palindrome(input2)); // Output: 1331
    }

    public static int nearest_palindrome(int num) {
        int nearestGreaterPalindrome = num + 1;
        while (!isPalindrome(nearestGreaterPalindrome)) {
            nearestGreaterPalindrome++;
        }
        return nearestGreaterPalindrome;
    }

    public static boolean isPalindrome(int num) {
        String numString = Integer.toString(num);
        int left = 0;
        int right = numString.length() - 1;
        while (left < right) {
            if (numString.charAt(left) != numString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}