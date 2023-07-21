import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        
        String binary = convertToBinary(decimal);
        
        System.out.println("The binary representation is: " + binary);
        scanner.close();
    }

    public static String convertToBinary(int decimal) {
        if (decimal == 0) {
            return "0"; // Special case for decimal number 0
        }
        
        StringBuilder binary = new StringBuilder();
        
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder); // Insert remainder at the beginning of the string
            decimal /= 2;
        }
        
        return binary.toString();
    }
}
