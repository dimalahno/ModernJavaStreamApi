package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime: " + localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(2021, 03, 21, 23, 33, 33, 978);
        System.out.println("localDateTime1: " + localDateTime1);

        LocalDateTime localDateTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("localDateTime2: " + localDateTime2);

        // getting the time and date from LocalDateTime
        System.out.println("getHour: " + localDateTime.getHour());
        System.out.println("getMinute: " + localDateTime.getMinute());
        System.out.println("getDayOfYear: " + localDateTime.getDayOfYear());
        System.out.println("getDayOfMonth: " + localDateTime.getDayOfMonth());
        System.out.println("getDayOfWeek: " + localDateTime.getDayOfWeek());
        System.out.println("DAY_OF_MONTH: " + localDateTime.get(ChronoField.DAY_OF_MONTH));
        System.out.println("plusHours: " + localDateTime.plusHours(2));
        System.out.println("plusYears: " + localDateTime.minusYears(3));
    }
}
