package cPathInterfaceNIO2;
import java.nio.file.*;                    // Import for working with file paths
import java.nio.file.attribute.*;           // Import for file attributes
import java.io.IOException;
import java.time.Instant;                   // Import to work with time

//We can view a File's meta data (data about data) with BasicFIleAttributes:
//BasicFileAttributes is used to read file attributes such as creation time, last modified time, file size, etc.
//BasicFileAttributeView allows you to modify file attributes.

public class FileAttributes {
    public static void main(String[] args) {
        Path filePath = Paths.get("cExampleDirectory/example.txt");  // Define a path to the file

        try {
            // Reading basic file attributes using BasicFileAttributes
            BasicFileAttributes attr = Files.readAttributes(filePath, BasicFileAttributes.class);
            System.out.println("Creation Time: " + attr.creationTime());  // Print file creation time
            System.out.println("Last Access Time: " + attr.lastAccessTime());  // Last accessed time
            System.out.println("Last Modified Time: " + attr.lastModifiedTime());  // Last modified time
            System.out.println("Is Directory: " + attr.isDirectory());  // Check if it's a directory
            System.out.println("File Size: " + attr.size() + " bytes");  // Print file size in bytes

            // Getting BasicFileAttributeView to modify attributes
            BasicFileAttributeView view = Files.getFileAttributeView(filePath, BasicFileAttributeView.class);

            // Set the last modified, last access, and creation time to the current time
            FileTime newTime = FileTime.from(Instant.now());
            view.setTimes(newTime, newTime, newTime);  // Update the file times

            // Reading the updated attributes
            BasicFileAttributes updatedAttr = Files.readAttributes(filePath, BasicFileAttributes.class);
            System.out.println("Updated Last Modified Time: " + updatedAttr.lastModifiedTime());  // Print updated last modified time

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
