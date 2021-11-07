package dates;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalTimeExample {
    private static void parseTime() {
        String time ="13:00";
        LocalTime localTime = LocalTime.parse(time);
        System.out.println(localTime);
    }

    private static void formatTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH*mm*ss");
        LocalTime now = LocalTime.now();
        String timeStr = now.format(formatter);
        System.out.println(timeStr);
    }

    public static void main(String[] args) {
        parseTime();
        formatTime();
    }
}
