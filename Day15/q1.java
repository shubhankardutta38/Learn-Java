/*
 * Write a python program to find and display the product of 
three positive integer values based on the rule mentioned below:

-->It should display the product of the three values except when
one of the integer value is 7. 
-->In that case, 7 should not be  included in the product and 
the values to its left also should not be included.If there is 
only one value to be considered, display that value itself.
-->If no values can be included in theproduct, display-1.
Note: Assume that if 7 is one of the positive integer values, 
then it will occur only once. Refer the sample I/O given below.

Sample Input	Expected Output
1, 5, 3	                   15
3, 7, 8	                   8
7, 4, 3	                   12
1, 5, 7	                  -1
 */

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        int[] a = new int[3];
        int res = 1;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter three positive integer values separated by spaces:");
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }
        
        boolean foundSeven = false;
        for (int i = 0; i < 3; i++) {
            if (a[i] == 7) {
                foundSeven = true;
                break;
            }
        }
        
        if (foundSeven) {
            boolean exclude = false;
            for (int i = 0; i < 3; i++) {
                if (a[i] == 7) {
                    exclude = true;
                }
                if (!exclude) {
                    res *= a[i];
                }
            }
            
            if (res == 1) {
                System.out.println(-1);
            } else {
                System.out.println(res);
            }
        } else {
            for (int i = 0; i < 3; i++) {
                res *= a[i];
            }
            System.out.println(res);
        }
        sc.close();
    }
}
