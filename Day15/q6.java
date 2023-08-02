/*
 * Write a Python function which accepts a string and returns a 
string made of the first 2 and the last 2 characters
of the given string.If the  string length  is less than 2, 
return -1.

Note: If the string length is equal to 2, consider the 2 
characters to be the first as well as the last two characters.

Sample Input	Expected Output

   w3resource	w3ce
   w3	        w3w3
    A	        -1
 */
import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String a= sc.next();
        String b="";
        if (a.length()<2){
            System.out.println("-1");
        }
        else if(a.length()==2){
            System.out.println(a+a);
        }
        else{
            for(int i=0;i<a.length();i++){
                if(i<2){
                    b += a.charAt(i);
                }
                if(i>=a.length()-2){
                    b += a.charAt(i);
                }
            }
            System.out.println(b);
        }
        sc.close();

    }
}
