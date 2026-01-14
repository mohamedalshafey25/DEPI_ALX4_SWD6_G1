package session10.fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilesDemo {
    public static void main(String[] args)  {

// creating a file with throws statement to handle exception

        File file = new File("example.txt");
        try {
            file.createNewFile();
            FileWriter myWriter = new FileWriter("filename.txt");

        } catch (IOException e) {
            System.out.println(" An error occurred while creating the file: " + e.getMessage());
        }

        file.delete();


    }
}
