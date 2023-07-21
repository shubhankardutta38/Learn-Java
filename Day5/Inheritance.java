class Employee {
    float salary=43000;
}
class Programmer extends Employee{
    float bonus=10000f;
    float total;
}

public class Inheritance {
    public static void main(String[] args) {
        Programmer p = new Programmer();
    	System.out.println("Programmer salary is: "+p.salary);
    	System.out.println("Bonus of Programmer is :"+p.bonus);
        p.total = p.salary+p.bonus;
    	System.out.println("Total Salary of Programmer is :"+p.total);
    }
}
