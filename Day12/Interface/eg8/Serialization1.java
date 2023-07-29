package Interface.eg8;
import java.io.*;
public class Serialization1 {
    public static void main(String[] args) {
        try{
            Student s1 = new Student(221,"ravi");
            FileOutputStream fout =new FileOutputStream("/Users/shubhankardutta/Desktop/Day12/Interface/eg8/file.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            out.close();
            System.out.println("Success");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
