package cDateTimeAPIandLocalization;
import java.time.LocalDateTime;
public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current date AND TIME: "+ dateTime);

        LocalDateTime futureDateTime = dateTime.plusDays(20).plusHours(44);
        System.out.println("Future date TIME: " + futureDateTime);

        LocalDateTime pastDate = dateTime.minusMonths(3).minusMinutes(45);
        System.out.println("Past date TIME: "+ pastDate);
    }

}
