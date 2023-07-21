import java.util.*;
public class maxnumber {
    public static void main(String[] args) {
        int a, b, c, max;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter value of a :");
        a = sc.nextInt();
        System.out.println("Enter value of b  :");
        b = sc.nextInt();
        System.out.println("Enter value of c  :");
        c = sc.nextInt();
        max=(a>b)?(a>c ? a:c) : (b>c ? b: c);

        System.out.println("Maximum Number among " + a + " , " + b + " and " + c + " is " + max);
        sc.close();
    }
    
}
