package Readfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readfile {
    public static void main(String[] args) {
        try
	  {
		  File myObj=new File("/Users/shubhankardutta/Desktop/Learn Java/Day8/file.txt");
          Scanner myReader=new Scanner(myObj);
          while(myReader.hasNextLine()){
            String data=myReader.nextLine();
            System.out.println(data);
          }
		  myReader.close();
        }
	  catch(FileNotFoundException e)
	  {
		  System.out.println("An error Occurred");
		  e.printStackTrace();
	  }
    }
}
