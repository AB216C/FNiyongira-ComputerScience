package cDateTimeAPIandLocalization;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class DateTimeFormatterExamples {
    public static void main(String[] args) {
        // Create a DateTimeFormatter with a specific pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();

        // Format the current date and time
        String formattedDateTime = now.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime); // Output: Formatted Date and Time: dd-MM-yyyy HH:mm:ss

        // Parse a date and time string back into a LocalDateTime object
        String dateTimeString = "04-10-2024 15:30:45";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString, formatter);
        System.out.println("Parsed Date and Time: " + parsedDateTime);
    }
}
