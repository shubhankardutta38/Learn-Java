import java.util.Scanner;

public class sumdigits {
    static int sumDigits(int no)
    {
        return no == 0 ? 0: no%10 + sumDigits(no/10);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Value:");
        n =sc.nextInt();
        System.out.println("Sum of "+n+" is " +sumDigits(n));
        sc.close();
    }
}
