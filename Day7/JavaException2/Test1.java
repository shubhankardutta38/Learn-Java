package JavaException2;
import java.util.Scanner;
public class Test1 {
    public static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("Person is not eligible to vote");
        } else {
            System.out.println("Person eligible to vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int age;
            System.out.println("Enter the age :");
            age=sc.nextInt();
            validate(age);
            //System.out.println("rest of the code");
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        sc.close();
    }
}
