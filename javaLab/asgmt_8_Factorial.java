/*
Create a program to find the factorial of a given number using 
iterative approaches.
*/


import java.util.Scanner;

public class asgmt_8_Factorial 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to find its factorial:");
        int number = scanner.nextInt();

        // Check if the number is non-negative
        if (number < 0) 
        {
            System.out.println("Factorial is not defined for negative numbers.");
        } 
        else 
        {
            // Calculate factorial iteratively
            int factorial = 1;
            for (int i = 1; i <= number; i++) 
            {
                factorial *= i;
            }
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        scanner.close();
    }
}


/*
OUTPUT: Enter a number to find its factorial:
		5
		Factorial of 5 is: 120
*/