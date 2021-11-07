package dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateExample {

    private static void parseLocalDate() {

        String dateStr = "2021-11-07";
        LocalDate localDate = LocalDate.parse(dateStr);
        System.out.println(localDate);
        LocalDate localDate1 = LocalDate.parse(dateStr, DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(localDate1);

        String dateStr1 = "20211107";
        LocalDate localDate2 = LocalDate.parse(dateStr1, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(localDate2);

        String dateStr2 = "2021|11|07";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localDate3 = LocalDate.parse(dateStr2, formatter);
        System.out.println(localDate3);

        String dateStr3 = "2021*11*07";
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy*MM*dd");
        LocalDate localDate4 = LocalDate.parse(dateStr3, formatter1);
        System.out.println(localDate4);

    }

    private static void formatLocalDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localDate = LocalDate.now();
        String format = localDate.format(formatter);
        System.out.println(format);
    }

    public static void main(String[] args) {
        parseLocalDate();
        formatLocalDate();
    }
}
