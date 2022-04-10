package exame4;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateExame {

    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);

        System.out.println(instant.atZone(ZoneId.systemDefault()));
        System.out.println(instant.atZone(ZoneId.of("UTC")));
        System.out.println(instant.atZone(ZoneId.of("UTC+6")));

        LocalDateTime localdate = LocalDateTime.now();
        System.out.println("======================");
        System.out.println(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(DateTimeFormatter.ISO_DATE);
        System.out.println(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(DateTimeFormatter.ISO_INSTANT);
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE);

    }
}
