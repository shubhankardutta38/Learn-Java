import java.util.Scanner;

public class ConvertIntegerValues {
    public static void main(String[] args) {
        int integerValue;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        integerValue = sc.nextInt();
        // Convert to byte
        byte byteValue = (byte) integerValue;
        
        // Convert to character
        char charValue = (char) integerValue;
        
        // Convert to float
        float floatValue = (float) integerValue;
        System.out.println("Integer Value: " + integerValue);
        System.out.println("Byte Value: " + byteValue);
        System.out.println("Character Value: " + charValue);
        System.out.println("Float Value: " + floatValue);
        sc.close();
    }
}
