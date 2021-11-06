package dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateToLocalDateExample {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println("date: " + date);

        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println("localDate: " + localDate);

        Date date1 = Date.from(localDate.atTime(LocalTime.now()).atZone(ZoneId.systemDefault()).toInstant());
        System.out.println(date1);

        java.sql.Date date2 = java.sql.Date.valueOf(localDate);
        System.out.println("sql Date: " + date2);

        LocalDate localDate1 = date2.toLocalDate();
        System.out.println(localDate1);
    }
}
