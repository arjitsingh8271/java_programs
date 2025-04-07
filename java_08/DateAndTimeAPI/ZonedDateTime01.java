// ZonedDateTime: Add timezone support

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.Set;

public class ZonedDateTime01 {
    public static void main(String[] args) {
        // now()
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);    // 2025-04-07T18:30:10.865732515+05:30[Asia/Kolkata]

        // getZone()
        System.out.println(now.getZone());  // Asia/Kolkata

        //Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        //availableZoneIds.forEach(System.out::println);

        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(zdt);    // 2025-04-07T09:00:10.868225801-04:00[America/New_York]
    
        // parse()
        ZonedDateTime zdt1 = ZonedDateTime.parse("2025-01-07T09:00:10.868225801-04:00[America/New_York]");
        System.out.println(zdt1);   // 2025-01-07T09:00:10.868225801-04:00[America/New_York]

    }
}
