package cJavaFilesIO;
import java.io.File;
import java.io.IOException;

public class FileExampleTwo {
    public static void main(String[] args) {
        //Create a file object

        File file = new File("cJavaFilesIO/example.text");

        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Check if the file is readable, writable, and executable
            System.out.println("Can read: " + file.canRead());
            System.out.println("Can write: " + file.canWrite());
            System.out.println("Can execute: " + file.canExecute());

            // Get file properties
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Size: " + file.length() + " bytes");

            // Delete the file
            if (file.delete()) {
                System.out.println("File deleted.");
            } else {
                System.out.println("Failed to delete the file.");
            }

        }catch(IOException e){
            throw new RuntimeException(e);
        }


    }
}
