/*
 * An organization has decided to provide salary hike to its employees based on their job level. Employees can be in job levels 3 , 4 or 5.
Hike percentage based on job levels are given below:

Job level	Hike Percentage (applicable on current salary)
3	15
4	7
5	5


In case of invalid job level, consider hike percentage to be 0.
Given the current salary and job level, 
write a python program to find and display the new salary 
of an employee. Identify the test data and use it to test
 the program.
 */
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your current Salary :");
        int salary = sc.nextInt();
        System.out.print("Enter your Job level:");
        int level = sc.nextInt();
        float ns = salary + salary * 15 / 100;
        float nss = salary + salary * 7 / 100;
        float nsf = salary + salary * 5 / 100;
        if (level == 3) {
            System.out.println("Hike Percentage : 15 ");
            System.out.println("New Salary :" + ns);
        } else if (level == 4) {
            System.out.println("Hike Percentage : 7");
            System.out.println("New Salary :" + nss);
        } else if (level == 5) {
            System.out.println("Hike Percentage : 5");
            System.out.println("New Salary :" + nsf);
        } else {
            System.out.println("Hike percentage is 0");
            System.out.println("New Salary :" + salary);
        }
        sc.close();
    }
}
