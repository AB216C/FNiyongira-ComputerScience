package cDateTimeAPIandLocalization;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ZoneDateTimeExamples {
    public static void main(String[] args) {
        //Using of() with individual components

        ZonedDateTime zdt1 = ZonedDateTime.of(2025,5,24,2,23,0,0,ZoneId.of("America/Chicago"));
        System.out.println(zdt1);


        //Getting all valid time zone ids
        ZoneId.getAvailableZoneIds()
                .stream()
                .sorted()
                .forEach(System.out::println);

        //using Of() with LocalDate and LocalTime

        LocalDate date = LocalDate.of(2025,5,24);
        System.out.println(date);

        LocalTime time = LocalTime.of(14,56);
        System.out.println(time);

        //This is will change the actual TIME in the time zone
        ZonedDateTime zdt2 = ZonedDateTime.of(date,time,ZoneId.of("America/Chicago"));
        System.out.println(zdt2);

        //Using of() with localDateTime

        LocalDateTime localDateTime = LocalDateTime.of(2024, 9, 18, 12, 0);
        ZonedDateTime zdt3 = ZonedDateTime.of(localDateTime, ZoneId.of("Europe/London"));
        System.out.println("ZonedDateTime 3: " + zdt3);


    }



}
