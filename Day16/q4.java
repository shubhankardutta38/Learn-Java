/*
 * a string of comma seperated numbers.the number 5 and 8 
are present in the list.Assume that 8 always comes after 5.
case1:num1= add all the numbers which do not lie between 5 and 8 
in the input
case2:num2 = number formed by concatenating all numbers from 5 to 
8

output  sum of num1 and num2

 */

public class q4 {
    public static void main(String[] args) {
        String input = "3,2,6,5,1,4,8,9";
        int result = calculateSum(input);
        System.out.println("Output: " + result); // Output: 5168
    }

    public static int calculateSum(String input) {
        String[] numbers = input.split(",");
        int num1 = 0;
        StringBuilder num2StringBuilder = new StringBuilder();

        boolean between5And8 = false;
        for (String number : numbers) {
            int num = Integer.parseInt(number);
            if (num == 5) {
                between5And8 = true;
            } else if (num == 8) {
                between5And8 = false;
            }

            if (!between5And8) {
                num1 += num;
            }

            if (between5And8 && (num != 5 && num != 8)) {
                num2StringBuilder.append(number);
            }
        }

        int num2 = Integer.parseInt(num2StringBuilder.toString());
        return num1 + num2;
    }
}
