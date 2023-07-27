package TestJavaCollection;

import java.util.*;

class Student {

    int rollNo;
    String name;

    Student(int r, String s) {
        rollNo = r;
        name = s;
    }
}

public class student1 {
    public static void main(String[] args) {
        Student stu1 = new Student(1, "Akshay");
        Student stu2 = new Student(2, "Bina");
        Student stu3 = new Student(3, "Chintu");
        Student stu4 = new Student(4, "Dheeraj");
        LinkedHashSet<Student> set = new LinkedHashSet<>();
        set.add(stu1);
        set.add(stu2);
        set.add(stu3);
        set.add(stu4);
        for (Student stu : set) {
            if (stu == stu2) {
                System.out.println(stu.name + " present in set.");
            }
        }
    }
}