package cJavaFilesIO;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class fileStream {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("cJavaFilesIO/input.txt");
             FileWriter writer = new FileWriter("cJavaFilesIO/output.txt")) {

            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character); // Copy characters from input.txt to output.txt
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
