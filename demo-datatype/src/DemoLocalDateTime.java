import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DemoLocalDateTime {
  public static void main(String[] args) {
    // LocalDateTime constructor
    LocalDateTime currDateTime = LocalDateTime.of(2025, 12, 31, 23, 59, 59, 0); // 2025-12-31T23:59:59

    // reformat
    String formattedTime =
        currDateTime.format(DateTimeFormatter.ofPattern("dd MMM HH:mm:ss"));
    System.out.println(formattedTime);

    // off set date time
    OffsetDateTime hongKongTime =
        OffsetDateTime.now(ZoneId.of("Asia/Hong_Kong"));
    System.out.println(hongKongTime);

    // zoned date time
    ZonedDateTime time = ZonedDateTime.now();
    System.out.println(time);
    time = LocalDateTime.now().atZone(ZoneId.of("America/New_York"));
    System.out.println(time);

    // epoch and Unix timestamp
    System.out.println(LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8")));

    // get nano second
    System.out.println(LocalDateTime.now().getNano());

    System.out.println(LocalDateTime.now());
    System.out.println(LocalDateTime.now().truncatedTo(ChronoUnit.MICROS));
    System.out.println(LocalDateTime.now().truncatedTo(ChronoUnit.MILLIS));



  }
}
