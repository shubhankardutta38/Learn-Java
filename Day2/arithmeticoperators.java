import java.util.Scanner;

public class arithmeticoperators{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b ;
        System.out.println("Enter the Value of a:");
        a=sc.nextFloat();
        System.out.println("Enter the value of b : ");
        b=sc.nextFloat();

        System.out.println("a + b :" +(a+b));
        System.out.println("a - b :" +(a-b));
        System.out.println("a * b :" +(a*b));
        System.out.println("a / b :" +(a/b));
        System.out.println("a % b :" +(a%b));
        
        sc.close();
    }
}
