package cDateTimeAPIandLocalization;
import java.time.LocalDate;
import java.time.Period;
public class PeriodExamples {
    public static void main(String[] args) {

            LocalDate startDate = LocalDate.of(2023, 1, 1);
            LocalDate endDate = LocalDate.of(2024, 1, 1);

            Period period = Period.between(startDate, endDate);
            System.out.println("Period between dates: " + period); // Output: P1Y

    }
}
