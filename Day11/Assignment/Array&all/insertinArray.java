import java.util.Arrays;

public class insertinArray {

    public static void main(String[] args) {
        int[] array = { 1, 2, 4, 5, 6 };
        int elementToInsert = 3;
        int positionToInsert = 2;

        int[] newArray = insertElement(array, elementToInsert, positionToInsert);

        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("New array with the element inserted: " + Arrays.toString(newArray));
    }

    public static int[] insertElement(int[] arr, int element, int position) {
        int newArrayLength = arr.length + 1;
        int[] newArray = new int[newArrayLength];

        for (int i = 0; i < position; i++) {
            newArray[i] = arr[i];
        }

        newArray[position] = element;

        for (int i = position + 1; i < newArrayLength; i++) {
            newArray[i] = arr[i - 1];
        }

        return newArray;
    }
}
