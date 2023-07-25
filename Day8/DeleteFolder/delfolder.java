package DeleteFolder;
import java.io.File;
import java.util.Scanner;

public class delfolder {
    public static void main(String[] args) {
        String filepath;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter directory path for deleting a diretory :");
        filepath = sc.nextLine();
        sc.close();
        // create an instance of file for user given file path
        File file = new File(filepath);
        try {
            deleteDirectory(file);
            file.delete();
            System.out.println("Your directory is deleted Succesfully ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // create delete directory() for deleting sub directories
    private static void deleteDirectory(File file) {
        for (File subfile : file.listFiles()) {

            if (subfile.isDirectory()) {
                deleteDirectory(subfile);
            }
            // use delete method for deleting file and empty folder
            subfile.delete();
        }
    }
}
