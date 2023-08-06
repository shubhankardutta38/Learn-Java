package q2;

/*
 StringBuffer & StringBuilder built-in method & performance
 Problem Statement : Write a java program to demonstrate the use of the built in methods inside any of the StringBuffer or the StringBuilder Class to remove al the ocurences of a Particular character from a given string:
 Smaple Input:
 String str = "JV Global";
 char ch = "L";
 Expected Output:
 "JV Goba"
 you should create your own function and call the function and display the output.
 Also,demonstate the practical time complexity of both StringBuffer and StringBuilder classes by using a code.
 */
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Input String :");
        String str = sc.nextLine();
        System.out.print("Enter the character you want to remove :");
        char ch = sc.next().charAt(0);
        String removedString = removeChar(str, ch);
        System.out.println("Result: " + removedString);
        sc.close();
    }

    static String removeChar(String str, char ch) {
        return str.replace(Character.toString(ch), "");
    }
}
