package cPathInterfaceNIO2;
import java.nio.file.*;
import java.io.IOException;
import java.util.stream.Stream;

//Files.lines(filePath) opens a stream of lines from the file.
//Each line is processed individually with .forEach(System.out::println),
// but you can customize the processing logic as needed.
//This approach automatically closes the stream at the end, as it’s wrapped in a try-with-resources block.

public class StreamApi {
    public static void main(String[] args) {
        Path filePath = Paths.get("cExampleDirectory/example.txt");

        try (Stream<String> lines = Files.lines(filePath)) {
            lines.forEach(System.out::println); // Process each line, here printing it
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
