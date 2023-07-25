package Createfolder;

//How to create a new folder in java
import java.io.File;
import java.util.Scanner;

public class Createfolder {
    public static void main(String[] args) {
        System.out.println("Enter the path where you want to create a folder:");
        Scanner sc = new Scanner(System.in);
        String path = sc.next();
        System.out.println("Enter the name of the desired a directory :");
        path = path + sc.next();
        // Instantiate the file class
        File f1 = new File(path);
        // create folder using mkdir() method
        boolean bool = f1.mkdir();
        if (bool) {
            System.out.println("Folder is created successfully ");
        } else {
            System.out.println("Error Found");
        }
        sc.close();
    }
}
