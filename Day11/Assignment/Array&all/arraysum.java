public class arraysum {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int sum = sumArrayValues(array);

        System.out.println("Sum of the array: " + sum);
    }

    public static int sumArrayValues(int[] arr) {
        int sum = 0;

        for (int value : arr) {
            sum += value;
        }

        return sum;
    }
}
