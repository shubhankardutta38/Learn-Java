import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        System.out.println("Enter 5 positive numbers:");
        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt();
            if (number > 0) {
                sum += number;
            } else {
                System.out.println("Invalid input! Enter a positive number.");
                i--;
            }
        }
        
        scanner.close(); 
        
        System.out.println("The sum of the positive numbers is: " + sum);
    }
}
