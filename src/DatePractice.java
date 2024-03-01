import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class DatePractice {
    public static void main(String[] args) {
        Date date = new Date(); // Number of milli

        System.out.println(date);

        SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy");
        String string = format.format(date);
        System.out.println(string);
        try {
            Date parsed = format.parse("19-July-1990");
            System.out.println(parsed);
        } catch (ParseException e) {
            System.out.println("Unknown format");
        }
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);
        System.out.println("localDate.minusDays(4) = " + localDate.plusDays(4));
        System.out.println("localDate.isLeapYear() = " + localDate.isLeapYear());
        LocalDate localDate1  = LocalDate.of(1990,6,3);
        LocalDate parse = LocalDate.parse("20/03/1990", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("parse = " + parse);
        System.out.println("localDate1 = " + localDate1);

        System.out.println("localDate.minus(4, ChronoUnit.MONTHS) = " + localDate.minus(4, ChronoUnit.MONTHS));

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime);

        ZonedDateTime  dateTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        System.out.println(dateTime.toLocalDateTime());

        long between = ChronoUnit.DAYS.between(LocalDate.of(2024, 01, 20), LocalDate.of(2024, 02, 15));
        System.out.println(between);

        Duration duration = Duration.ofSeconds(10);
        Instant instant = Instant.now();
        long epochMilli = instant.toEpochMilli();
        Date date2 = new Date(epochMilli);




    }
}
