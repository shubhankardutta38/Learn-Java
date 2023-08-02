/*
 * Write a python function which accepts a sentence and
 returns a list in which first value is the count of 
upper case letters and second value is the count of lower 
case letters in the sentence. Ignore spaces
, numbers and other special characters if any.

Sample Input	   Expected Output
Hello world!	        [1,9]   
Welcome to Mysore	[2,13]
 */
import java.util.ArrayList;
import java.util.List;

public class q5 {
    public static List<Integer> countUpperCaseLowerCase(String sentence) {
        int upperCaseCount = 0;
        int lowerCaseCount = 0;

        for (char c : sentence.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upperCaseCount++;
            } else if (Character.isLowerCase(c)) {
                lowerCaseCount++;
            }
        }

        List<Integer> result = new ArrayList<>();
        result.add(upperCaseCount);
        result.add(lowerCaseCount);
        return result;
    }

    public static void main(String[] args) {
        String input1 = "Hello world!";
        String input2 = "Welcome to Mysore";

        List<Integer> output1 = countUpperCaseLowerCase(input1);
        List<Integer> output2 = countUpperCaseLowerCase(input2);

        System.out.println("Input: " + input1 + ", Output: " + output1); // Output: [1, 9]
        System.out.println("Input: " + input2 + ", Output: " + output2); // Output: [2, 13]
    }
}