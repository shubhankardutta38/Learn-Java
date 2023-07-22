package Privclass;

public class javaapplication {
    public static void main(String[] args) {
        Student s1 = new Student(1001, "Mahesh");
        System.out.println(s1.getRollNo());
        System.out.println(s1.getStu_name());
        s1.setRollno(1002);
        System.out.println("New Roll no :"+s1.getRollNo());
        s1.setStu_name("Dalle");
        System.out.println("New Student name :" + s1.getStu_name());
    }
}
