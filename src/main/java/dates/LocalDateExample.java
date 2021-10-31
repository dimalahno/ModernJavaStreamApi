package dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate: " + localDate);

        LocalDate localDate1 = LocalDate.of(2021, 10, 31);
        System.out.println("localDate1: " + localDate1);

        LocalDate localDate2 = LocalDate.ofYearDay(2021, 360);
        System.out.println("localDate2: " + localDate2);


//        Get values from LocalDate
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.get(ChronoField.DAY_OF_MONTH));

    }
}
