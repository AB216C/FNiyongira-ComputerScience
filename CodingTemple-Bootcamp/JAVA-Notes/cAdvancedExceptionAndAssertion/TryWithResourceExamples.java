package cAdvancedExceptionAndAssertion;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class TryWithResourceExamples {
    public static void main(String[] args) {
        // Using try-with-resources to auto-close the BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader("cExampleDirectory/example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // No need to explicitly call reader.close() — it's done automatically


    }
}
