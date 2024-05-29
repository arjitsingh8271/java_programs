// Write a Java program to check whether a given year is a leap year or not.

import java.util.Scanner;

public class asgmt_14_LeapYear 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year:");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        if (isLeapYear(year)) 
        {
            System.out.println(year + " is a leap year.");
        } 
        else 
        {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) 
    {
        // A year is a leap year if it is divisible by 4
        // But if the year is divisible by 100, it must also be divisible by 400 to be a leap year
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
