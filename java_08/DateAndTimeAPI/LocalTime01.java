// LocalTime: Work with time only

import java.time.LocalTime;

public class LocalTime01 {
    public static void main(String[] args) {
        // now()
        LocalTime now = LocalTime.now();
        System.out.println("Current Time: " + now);

        // of()
        LocalTime time = LocalTime.of(14, 30, 59);
        System.out.println("Specific Time: " + time);

        LocalTime time1 = LocalTime.of(14, 30);
        System.out.println("Specific Time: " + time1);

        // parse()
        LocalTime parsedTime = LocalTime.parse("14:22:21");
        System.out.println(parsedTime);

        // minus()
        System.out.println(now.minusHours(1));

        // etc..
    }
}
