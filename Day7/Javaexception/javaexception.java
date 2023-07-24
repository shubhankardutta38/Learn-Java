package Javaexception;

public class javaexception {
    public static void main(String[] args) {
        try {
            int data = 100 / 0; 
            System.out.println(data); //10
        } catch (ArithmeticException e) {
            {
                System.out.println(e);
            }
            System.out.println("Rest of the code....");
        }
    }
}
