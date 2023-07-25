package Createfile;
import java.io.File;
import java.io.IOException;
public class createfile {
    public static void main(String[] args) {
        try{
            File myobj = new File("/Users/shubhankardutta/Desktop/Learn Java/Day8/file.txt");
            if (myobj.createNewFile()){
                System.out.println("File creatd " +myobj.getName());
            }
            else{
                System.out.println("File already Exists");
            }
        }
        catch(IOException e){
            System.out.println("an error occured");
            e.printStackTrace();
        }
    }
}
