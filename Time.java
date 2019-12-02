import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class Time {

    public static void main(String[] args)
    {
      ZoneId zoneId = ZoneId.systemDefault();
      System.out.println("Current time zone is: " + zoneId );

      LocalDateTime dateTime = LocalDateTime.now();
      System.out.println("Date and time is: " + dateTime);

      ZoneId id = ZoneId.of("Europe/Bucharest");
      ZonedDateTime zonedt = ZonedDateTime.now(id);
      System.out.println(zonedt);
    }
}
