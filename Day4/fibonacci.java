import java.util.Scanner;

public class fibonacci {
    static void Fibonacci(int N) {
        int num1 = 0, num2 = 1;
        int counter = 0;
        while (counter < N) {
            System.out.println(num1 + " "); //0
            int num3 = num1 + num2; // num3= 1+0=1
            num1 = num2;
            num2 = num3; // num3=1
            counter = counter + 1;
        }
        
    }

    public static void main(String[] args) {
        int N;
        System.out.print("Enter the Number :");
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        System.out.println("Fibonacci Series -->");
        Fibonacci(N);

        sc.close();
    }
}
