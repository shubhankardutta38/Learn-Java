import java.util.Arrays;
import java.util.HashSet;

public class removeduplicate {

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};

        // Call the method to remove duplicate elements from the array
        int[] newArray = removeDuplicates(array);

        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Array after removing duplicates: " + Arrays.toString(newArray));
    }

    public static int[] removeDuplicates(int[] arr) {
        
        HashSet<Integer> uniqueSet = new HashSet<>();
        for (int element : arr) {
            uniqueSet.add(element);
        }

        // Convert the HashSet back to an array
        int[] newArray = new int[uniqueSet.size()];
        int index = 0;
        for (int element : uniqueSet) {
            newArray[index++] = element;
        }

        return newArray;
    }
}
