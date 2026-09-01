package cDateTimeAPIandLocalization;
import java.time.LocalTime;
import java.time.Duration;
//Duration is a class in the java.time package that represents a time-based amount of time, such as 34.5 seconds.
// It can be used to measure time in seconds and nanoseconds and is often employed for calculating the differences between
// two Instant or LocalTime objects, making it a valuable tool for time-related calculations in Java applications.
public class DurationExamples {
    public static void main(String[] args) {
        LocalTime start = LocalTime.of(10, 30, 0); // 10:30:00
        LocalTime end = LocalTime.of(12, 15, 30);  // 12:15:30

        // Calculate the duration between two times
        Duration duration = Duration.between(start, end);

        // Output the duration in various formats
        System.out.println("Seconds: " + duration.getSeconds()); // Total seconds  6330
        System.out.println("Minutes: " + duration.toMinutes()); // Total minutes 105
        System.out.println("Hours: " + duration.toHours()); // Total hours 1

    }
}
