import java.util.Scanner;

public class multiplicationtable {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number :");
        n= sc.nextInt();
        System.out.println("\nTable of "+n);
        System.out.println("- - - - - - -");

        for(int i =1; i<=10;i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
        sc.close();
    }
}
