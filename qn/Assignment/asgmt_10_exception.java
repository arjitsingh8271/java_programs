/*
Write a Java program to perform division of two numbers and handle the
ArithmeticException if the denominator is zero.
*/

import java.util.Scanner;

public class asgmt_10_exception {
    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numerator: ");
        int numerator = scanner.nextInt();

        System.out.print("Enter the denominator: ");
        int denominator = scanner.nextInt();

        try 
        {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Error: Cannot divide by zero.");
        }

        scanner.close();
    }
}




/*
OUTPUT: Enter the numerator: 2
        Enter the denominator: 1
        Result: 2

        Enter the numerator: 2
        Enter the denominator: 0
        Error: Cannot divide by zero.
*/