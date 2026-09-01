package cJavaFilesIO;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class BufferedReaderAndBufferedWriter {
    public static void main(String[] args) {
        // File paths for input and output
        String inputFile = "cJavaFilesIO/input.txt";
        String outputFile = "cJavaFilesIO/output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) { // Reads each line from input.txt
                writer.write(line); // Writes the line to output.txt
                writer.newLine(); // Adds a new line in output.txt
            }
            System.out.println("File content copied successfully!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
