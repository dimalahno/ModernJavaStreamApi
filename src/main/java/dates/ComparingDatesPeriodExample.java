package dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class ComparingDatesPeriodExample {
    public static void main(String[] args) {

        LocalDate localDate1 = LocalDate.of(2021, 01, 01);
        LocalDate localDate2 = LocalDate.of(2021, 12, 31);

        Period period = localDate1.until(localDate2);

        System.out.println("getDays: " + period.getDays());
        System.out.println("getMonths: " + period.getMonths());
        System.out.println("getYears: " + period.getYears());

        Period period1 = Period.ofDays(10);
        System.out.println("period1: " + period1.getDays());

        Period period2 = Period.ofYears(10);
        System.out.println(period2.getYears());
        System.out.println(period2.toTotalMonths());

        Period period3 = Period.between(localDate1, localDate2);
        System.out.println("between: " + period3.getDays());
        System.out.println("between: " + period3.getMonths());

        Period period4 = Period.between(LocalDate.now(), LocalDate.now().plusDays(3));
        System.out.println(period4.getDays());



    }
}
