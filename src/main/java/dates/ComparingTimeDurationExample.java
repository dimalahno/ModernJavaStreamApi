package dates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComparingTimeDurationExample {

    public static void main(String[] args) {
        LocalTime localTime1 = LocalTime.of(7, 20);
        LocalTime localTime2 = LocalTime.of(8, 20);

        long diff = localTime1.until(localTime2, ChronoUnit.MINUTES);
        System.out.println(diff);

        Duration duration = Duration.between(localTime1, localTime2);
        System.out.println(duration.toMinutes());

        Duration duration1 = Duration.ofHours(3);
        System.out.println(duration1.toMinutes());

        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.now().plusDays(10);
        Duration duration2 = Duration.between(localDate1, localDate2);
        System.out.println(duration2);
    }
}
