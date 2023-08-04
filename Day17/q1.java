/*
 * Write a python function, create_largest_number(), 
which accepts  a list of numbers and 	
returns the largest number possible by               
concatenating the list of numbers.
Note: Assume that all the numbers are two 
digit numbers.

   Sample Input	        Expected Output
   [23,34,55]	             553423

   [33,44,55,34,88]            8855443433
 */

import java.util.*;

public class q1 {
    public static void main(String[] args) {
        int[] input1 = {23, 34, 55};
        int[] input2 = {33, 44, 55, 34, 88};

        System.out.println("Largest number from input1: " + create_largest_number(input1)); 
        System.out.println("Largest number from input2: " + create_largest_number(input2)); 
    }

    public static String create_largest_number(int[] numbers) {
        // Convert the integers to strings for custom sorting
        String[] numStrings = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numStrings[i] = Integer.toString(numbers[i]);
        }

        // Custom comparator to sort the numbers in decreasing order of their concatenated values
        Arrays.sort(numStrings, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String ab = a + b;
                String ba = b + a;
                return ba.compareTo(ab); // Sort in reverse order
            }
        });

        // Concatenate the sorted strings to get the largest number
        StringBuilder largestNumberBuilder = new StringBuilder();
        for (String numString : numStrings) {
            largestNumberBuilder.append(numString);
        }

        return largestNumberBuilder.toString();
    }
}
