package cPathInterfaceNIO2;
import java.nio.file.*;
import java.io.IOException;

//The NIO.2 (New I/O 2) API in Java, introduced in Java 7, provides enhanced capabilities for file handling and I/O operations.
// It includes several new classes and methods in the java.nio.file package for working with files and directories.
// Below are some key NIO.2 methods commonly used for file operations:
//Files.exists(): Checks if the file exists.
//Files.copy(): Copies a file to a new location.
//Files.delete(): Deletes the file.
//StandardCopyOption.REPLACE_EXISTING: Overwrites the destination file if it exists.

public class FileMethods {
    public static void main(String[] args) {
        Path source = Paths.get("cExampleDirectory/example.txt");
        Path destination = Paths.get("cExampleDirectory/example_copy.txt");

        try {
            // Check if file exists
            if (!Files.exists(source)) {
                System.out.println("File doesn't exist!");
                return;
            }

            // Copy the file
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied!");

            // Delete the new file
            //Files.delete(destination);
            //System.out.println("File deleted!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
