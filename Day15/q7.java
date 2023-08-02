/*
 * Number of odd sub arrays.
Find the number of distinct subarrays in an array of position 
integers such that the sum of the subarray is an
 odd integer, two subarray are consisdered different 
if they start or end at different index input.

   1 
   3  
   1 2 3
   [1] [1 2]  [1,2,3]  [2] [2,3]  [3] [1 3]
   4
 */
public class q7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int count = SubArrays(arr);
        System.out.println(count);
    }

    public static int SubArrays(int[] arr) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
