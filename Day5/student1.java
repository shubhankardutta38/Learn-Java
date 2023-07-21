
class Student12 {
    int roll_no;
    String stu_name;

    Student12(int roll_no1, String stu_name1) {
        roll_no = roll_no1;
        stu_name = stu_name1;
    }
}

public class student1 {
    public static void main(String args[]) {
        Student12 s1 = new Student12(1001, "Rohith");
        System.out.println("Roll No. " + s1.roll_no + ", Student Name " + s1.stu_name);
        Student12 s2 = new Student12(1002, "Lohith");
        System.out.println("Roll No. " + s2.roll_no + ", Student Name " + s2.stu_name);
    }
}