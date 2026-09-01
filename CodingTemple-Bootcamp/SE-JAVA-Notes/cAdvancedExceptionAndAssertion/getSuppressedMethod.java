package cAdvancedExceptionAndAssertion;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class getSuppressedMethod {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("cExampleDirectory/file.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("cExampleDirectory/file.txt"))) {
            throw new RuntimeException("Primary exception");

        } catch (Exception e) {
            for (Throwable suppressed: e.getSuppressed()) {
                System.out.println("Suppressed: " + suppressed);
            }
        }
    }
}
