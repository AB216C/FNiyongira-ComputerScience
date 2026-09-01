package cDateTimeAPIandLocalization;
import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Current date: "+ date);

        LocalDate futureDate = date.plusDays(20);
        System.out.println("Future date: " + futureDate);

        LocalDate pastDate = date.minusMonths(3);
        System.out.println("Past date: "+ pastDate);
    }
}
