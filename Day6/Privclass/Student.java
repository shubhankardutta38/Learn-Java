package Privclass;
public class Student{
    private int rollno;
    private String Stu_name;

    public Student(int rollno , String stu_name){
        this.rollno = rollno;
        this.Stu_name = stu_name;
    }
    public int getRollNo(){
        return rollno;
    }

    public void setRollno(int rollno){
        this.rollno = rollno;
    }
    public String getStu_name(){
        return Stu_name;
    }

    public void setStu_name(String Stu_name){
        this.Stu_name = Stu_name;
    }
    
}
