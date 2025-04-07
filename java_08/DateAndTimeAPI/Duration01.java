// Duration: Time difference

import java.time.LocalTime;
import java.time.Duration;

public class Duration01 {
    public static void main(String[] args) {
        LocalTime t1 = LocalTime.of(10, 0);
        LocalTime t2 = LocalTime.of(12, 30);
        Duration duration = Duration.between(t1, t2);
        System.out.println("Duration: " + duration.toMinutes() + " minutes");
    }
}
