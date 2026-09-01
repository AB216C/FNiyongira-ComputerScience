package cPathInterfaceNIO2;

import java.nio.file.*;

//Java's NIO.2 (introduced in Java 7) enhances the standard I/O with more flexibility for file and directory handling.
// It provides new classes like Path and Files for operating on files and directories more easily.
//NIO.2 integrates well with the Stream API for efficient processing of file systems.

//Paths.get(): Creates a Path object from a given string path.
//getFileName(): Retrieves the file name from the path.
//getParent(): Retrieves the parent directory of the path.
//isAbsolute(): Checks if the path is absolute.
//toAbsolutePath(): Converts the path to an absolute path.

public class PathInterface {
    public static void main(String[] args) {
        Path path = Paths.get("JavaAdvancedPathInterface\\exampleDirectory\\example.txt");

        // Print path information
        System.out.println("File name: " + path.getFileName());
        System.out.println("Parent: " + path.getParent());
        System.out.println("Is Absolute? " + path.isAbsolute());
        System.out.println("Absolute Path: " + path.toAbsolutePath());
    }
}
