package cDateTimeAPIandLocalization;
import java.time.Instant;
//Instant represents a specific moment on the timeline, providing nanosecond precision and belonging to the java.time package.
// It is particularly useful for recording events in time, such as logging or event timestamps,
// making it an ideal choice for applications that require precise time tracking.
public class InstantExamples {
    public static void main(String[] args) {
        // Get the current instant
        Instant now = Instant.now();
        System.out.println("Current Instant: " + now);

        // Create an Instant representing a specific point in time
        Instant specificTime = Instant.parse("2023-09-19T10:15:30Z");
        System.out.println("Specific Instant: " + specificTime);

        // Calculate duration from now to the specific time
        long secondsBetween = java.time.Duration.between(now, specificTime).getSeconds();
        System.out.println("Seconds until specific time: " + secondsBetween);
    }
}
