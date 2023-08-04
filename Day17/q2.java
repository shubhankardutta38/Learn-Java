/*
 * Write a python function find_duplicates(), which accepts a 
list of numbers and returns 
another list containing all the duplicate values in the 
input list. If there are no duplicate 
values, it should return an empty list.


Sample Input	                           Expected Output
[12,54,68,759,24,15,12,68,987,758,25,69]	[12, 68]
 */

import java.util.*;

public class q2 {
    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(12, 54, 68, 759, 24, 15, 12, 68, 987, 758, 25, 69);
        List<Integer> duplicates = find_duplicates(inputList);
        System.out.println("Duplicate values: " + duplicates); // Output: [12, 68]
    }

    public static List<Integer> find_duplicates(List<Integer> numbers) {
        List<Integer> duplicates = new ArrayList<>();
        Set<Integer> seenNumbers = new HashSet<>();

        for (int number : numbers) {
            if (seenNumbers.contains(number)) {
                if (!duplicates.contains(number)) {
                    duplicates.add(number);
                }
            } else {
                seenNumbers.add(number);
            }
        }

        return duplicates;
    }
}
