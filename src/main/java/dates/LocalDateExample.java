package dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate: " + localDate);

        LocalDate localDate1 = LocalDate.of(2021, 10, 31);
        System.out.println("localDate1: " + localDate1);

        LocalDate localDate2 = LocalDate.ofYearDay(2021, 360);
        System.out.println("localDate2: " + localDate2);


        // Get values from LocalDate
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.get(ChronoField.DAY_OF_MONTH));

        // Modifying Local Date
        System.out.println(localDate.plusDays(2));
        System.out.println(localDate.plusMonths(2));
        System.out.println(localDate.minusMonths(2));
        System.out.println(localDate.withYear(2019));
        System.out.println(localDate.with(ChronoField.YEAR, 2020));
        System.out.println(localDate.with(TemporalAdjusters.firstDayOfNextMonth()));

        System.out.println(localDate.minus(1, ChronoUnit.YEARS));

        // Additional support method
        System.out.println(localDate.isLeapYear());
        System.out.println(localDate.isEqual(localDate1));
        System.out.println(localDate.isBefore(localDate1));
        System.out.println(localDate.isAfter(localDate1));
    }
}
