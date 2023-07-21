class stu {
    int roll_no;
    String stu_name;
    double marks1, marks2;
    float marks3;

    public void average(){
        double avg = (marks1+marks2+marks3)/4;
        System.out.println("Average marks is :"+avg);
    }
    public void totalmarks(){
        double total = (marks1+marks2+marks3);
        System.out.println("The total number is :"+total);
    }
}

public class student {
    public static void main(String[] args) {
        stu s1 = new stu();
        //display default value
        System.out.println("s1 roll no(int)" + s1.roll_no);
        System.out.println("s1 name(string) " + s1.stu_name);
        System.out.println("s1 marks1(double)  " + s1.marks1);
        System.out.println("s1 marks3(float)  " + s1.marks3);

        System.out.println("**************************");
        //assigning value
        s1.roll_no = 99;
        System.out.println("s1 roll no " + s1.roll_no);

        s1.stu_name = "Student1";
        System.out.println("s1 name " + s1.stu_name);

        s1.marks1 = 76;
        System.out.println("s1 marks1  " + s1.marks1);

        s1.marks2 = 68.5;
        System.out.println("s1 marks2  " + s1.marks2);

        s1.marks3 = 49.5f;
        System.out.println("s1 marks3  " + s1.marks3);
        s1.totalmarks();
        s1.average();

        System.out.println("**************************");

        stu s2 = new stu();
        s2.roll_no = 21;
        System.out.println("s2 roll no " + s2.roll_no);

        s2.stu_name = "Student2";
        System.out.println("s2 name " + s2.stu_name);

        s2.marks1 = 70;
        System.out.println("s2 marks1  " + s2.marks1 );

        s2.marks2 = 99;
        System.out.println("s2 marks2  " + s2.marks2);
        s2.totalmarks();
        s2.average();

    }
}
