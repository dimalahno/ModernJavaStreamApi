package dates;

import java.time.*;

public class ZoneDateTimeExample {

    public static void main(String[] args) {

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime.getOffset());
        System.out.println(zonedDateTime.getZone());
//        ZoneId.getAvailableZoneIds().forEach(System.out::println);
        System.out.println(ZoneId.getAvailableZoneIds().size());

        //CST,EST,MST,PST
        System.out.println("CST: " + ZonedDateTime.now(ZoneId.of("America/Chicago")));
        System.out.println("EST: " + ZonedDateTime.now(ZoneId.of("America/Detroit")));
        System.out.println("PST: " + ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
        System.out.println("MST: " + ZonedDateTime.now(ZoneId.of("America/Denver")));

        System.out.println(ZonedDateTime.now(Clock.system(ZoneId.of("Asia/Almaty"))));
        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Asia/Almaty"));
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        System.out.println(localDateTime1);

        // Convert from localDateTime, instant to ZoneLocalDate and time

        LocalDateTime localDateTime2 = LocalDateTime.now();
        System.out.println(localDateTime2);
        ZonedDateTime zonedDateTime1 = localDateTime2.atZone(ZoneId.of("Asia/Almaty"));
        System.out.println(zonedDateTime1);

        ZonedDateTime zonedDateTime2 = Instant.now().atZone(ZoneId.of("Asia/Almaty"));
        System.out.println(zonedDateTime2);

        OffsetDateTime offsetDateTime = localDateTime2.atOffset(ZoneOffset.ofHours(+6));
        System.out.println(offsetDateTime);

    }
}
