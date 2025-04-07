// Instant: Machine readable timestamp

import java.time.Instant;

public class Instant01 {
    public static void main(String[] args) {
        
        long epoch = System.currentTimeMillis();    // epoch time: (01/01/1970 to present)
        System.out.println(epoch);

        // now()
        Instant timestamp = Instant.now();
        System.out.println("Timestamp: " + timestamp);
    }
}
