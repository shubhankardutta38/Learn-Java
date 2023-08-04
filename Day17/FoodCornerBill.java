/*
 * FoodCorner home delivers vegetarian and non-vegetarian combos 
to its customer based on order.
A vegetarian combo costs Rs.120 per plate and a non-vegetarian combo
costs Rs.150 per plate.
Apart from the cost per plate of food, customers are also 
*charged
*for home delivery based on the distance in kms from the 
restaurant 
*to the delivery point. The delivery charges are as mentioned below:

*Distance in kms	   Delivery charge in Rs per km
*For next 3kms	          3
For the remaining	  6
*Given the type of food, quantity (no. of plates) and the 
distance in kms from the 
restaurant to the delivery point, write a python program to
 calculate the final bill 
amount to be paid by a customer.
     The below information must be used to check the validity of the data provided by 
the customer: 
•	Type of food must be ‘V’ for vegetarian and ‘N’ for non-vegetarian.
•	Distance in kms must be greater than 0.
•		
If any of the input is invalid, the bill amount should be 
considered as -1.
 */

import java.util.Scanner;
public class FoodCornerBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter type of food (V for vegetarian, N for non-vegetarian): ");
        char foodType = scanner.next().charAt(0);

        System.out.print("Enter the quantity (number of plates): ");
        int quantity = scanner.nextInt();

        System.out.print("Enter the distance in kilometers: ");
        int distance = scanner.nextInt();

        scanner.close();

        double billAmount = calculateBillAmount(foodType, quantity, distance);
        if (billAmount == -1) {
            System.out.println("Invalid input. Bill amount cannot be calculated.");
        } else {
            System.out.println("Final bill amount: Rs. " + billAmount);
        }
    }

    public static double calculateBillAmount(char foodType, int quantity, int distance) {
        double costPerPlate = 0;
        double deliveryCharge = 0;

        // Check for valid input
        if (foodType != 'V' && foodType != 'N' || distance <= 0 || quantity <= 0) {
            return -1;
        }

        // Calculate cost per plate based on the type of food
        if (foodType == 'V') {
            costPerPlate = 120;
            System.out.println("Vegetarian Plate Price: 120");
        } else if (foodType == 'N') {
            costPerPlate = 150;
            System.out.println("Non-Vegetarian Plate Price: 150");
        }

        // Calculate delivery charge based on the distance
        if (distance <= 3) {
            deliveryCharge = 0;
        } else if (distance <= 6) {
            deliveryCharge = 3 * (distance - 3);
        } else {
            deliveryCharge = 3 * 3 + 6 * (distance - 6);
        }

        // Calculate total bill amount
        double totalBillAmount = costPerPlate * quantity + deliveryCharge;
        return totalBillAmount;
    }
}
