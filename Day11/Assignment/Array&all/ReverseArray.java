import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("OG Array :" +Arrays.toString(array));
        reverseArray(array);

        System.out.println("Reversed array: " + Arrays.toString(array));
    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        // Swap elements from the start and end positions until the middle is reached
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
