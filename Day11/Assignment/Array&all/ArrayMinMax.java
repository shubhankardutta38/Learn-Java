public class ArrayMinMax {

    public static void main(String[] args) {
        int[] array = { 10, 5, 8, 15, 3, 20 };
        int maxValue = findMaxValue(array);

        int minValue = findMinValue(array);

        System.out.println("Maximum value in the array: " + maxValue);
        System.out.println("Minimum value in the array: " + minValue);
    }

    public static int findMaxValue(int[] arr) {
        int max = arr[0];

        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }

        return max;
    }

    public static int findMinValue(int[] arr) {
        int min = arr[0];

        for (int value : arr) {
            if (value < min) {
                min = value;
            }
        }

        return min;
    }
}
