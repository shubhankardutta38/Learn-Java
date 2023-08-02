/*
 * ->A traveler on a visit to India is in need of some Indian
 Rupees (INR)but he has money belonging to another currency.
 He wants to know how much money he should provide in the
currency he has, to get the specified amount in INR.
->Write a python program to implement a currency calculator 
which accepts the amount needed in INR and the name of the 
currency which the traveler has. 
->The program should identify and display the amount the
 traveler should provide in the currency he has, to get the
 specified amount in INR.
->Note: Use the forex information provided in the table below 
for the calculation. 
->Consider that only the currency names mentioned in the table 
are valid.
For any invalid currency name, display -1.
Currency	                Equivalent of 1.00 INR
Euro	                   		0.01417  
British Pound	   			0.0100 
Australian Dollar	   		0.02140 
Canadian Dollar	   			0.02027
 */
import java.util.*;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out
                .println("Select your Currency:\n1. Euro\n2. British Pound\n3. Australian Dollar\n4. Canadian Dollar");
        int select = sc.nextInt();

        System.out.println("Enter the amount needed in INR:");
        double amountInINR = sc.nextDouble();

        double euro = 0.01417;
        double britishPound = 0.0100;
        double australianDollar = 0.02140;
        double canadianDollar = 0.02027;

        switch (select) {
            case 1:
                double equivalentAmount1 = amountInINR * euro;
                System.out.println("Equivalent Currency in Euro: " + equivalentAmount1);
                break;
            case 2:

                double equivalentAmount2 = amountInINR * britishPound;
                System.out.println("Equivalent Currency in British Pound: " + equivalentAmount2);
                break;
            case 3:

                double equivalentAmount3 = amountInINR * australianDollar;
                System.out.println("Equivalent Currency in Australian Dollar: " + equivalentAmount3);
                break;
            case 4:

                double equivalentAmount4 = amountInINR * canadianDollar;
                System.out.println("Equivalent Currency in Canadian Dollar: " + equivalentAmount4);
                break;
            default:
                System.out.println("-1");
            
        }
        sc.close();

    }
}
