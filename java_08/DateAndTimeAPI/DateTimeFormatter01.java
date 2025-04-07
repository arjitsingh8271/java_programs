// DateTimeFormatter: Custom formatting and parsing

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        // ofPattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = date.format(formatter);
        System.out.println("Formatted Date1: " + formattedDate);

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate1 = date.format(formatter1);
        System.out.println("Formatted Date2: " + formattedDate1);
    }
}
