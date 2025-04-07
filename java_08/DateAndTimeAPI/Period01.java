// Period: Human readable date difference

import java.time.LocalDate;
import java.time.Period;

public class Period01 {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2020, 1, 1);
        LocalDate end = LocalDate.now();
        Period period = Period.between(start, end);
        System.out.println("Period: " + period);
    }
}
