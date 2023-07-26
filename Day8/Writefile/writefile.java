package Writefile;
import java.io.FileWriter; //filewriter class
import java.io.IOException; //import the ISexception class
public class writefile {
    public static void main(String[] args) {
        try{
            FileWriter mywriter = new FileWriter("/Users/shubhankardutta/Desktop/Learn Java/Day8/file.txt");
            mywriter.write("File In java might be tricky,but it is fun enough");
            mywriter.close();
            System.out.println("Succesfully wrote to the file");
        }
        catch(IOException e){
            System.out.println("An error Occured");
            e.printStackTrace();
        }
    }
}
