// LocalDate:    Work with date only

import java.time.LocalDate;

public class LocalDate01 {
    public static void main(String[] args) {
        // now()
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);  // Today: 2025-04-07

        // of()
        LocalDate specificDate = LocalDate.of(2025, 3, 30);
        System.out.println("Specific Date: " + specificDate);   // Specific Date: 2025-03-30

        System.out.println("Year: " + today.getYear());         // Year: 2025
        System.out.println("Month: " + today.getMonth());       // Month: APRIL 
        System.out.println("Day: " + today.getDayOfMonth());    // Day: 7
        System.out.println("Month value: " + today.getMonthValue());    // Month value: 4


        // minusDays()
        LocalDate yesterday = today.minusDays(1);
        System.out.println(yesterday);  // 2025-04-06
        
        // minusMonths()
        LocalDate pastDate = today.minusMonths(4);
        System.out.println(pastDate);   // 2024-12-07

        // minusMonths()
        LocalDate pastDate1 = today.minusWeeks(2);
        System.out.println(pastDate1);  // 2025-03-24

        // minusMonths()
        LocalDate pastDate2 = today.minusYears(10);
        System.out.println(pastDate2);  // 2015-04-07

        // parse()
        LocalDate parse = LocalDate.parse("2013-02-11");
        System.out.println(parse);  // 2013-02-11

        // isAfter()
        if(today.isAfter(yesterday)) {
            System.out.println("True");
        }

        // isLeapYear()
        System.out.println(today.isLeapYear());     // false

        // etc..
    }
}
