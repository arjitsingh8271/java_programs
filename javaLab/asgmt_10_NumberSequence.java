/*
Implement a program that reads a sequence of integers from the 
user until a negative number is entered, then calculates and 
displays the sum and average of the entered numbers.
*/


import java.util.Scanner;

public class asgmt_10_NumberSequence 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        System.out.println("Enter a sequence of integers (enter a negative number to stop):");

        // Continue reading integers until a negative number is entered
        while (true) 
        {
            int num = scanner.nextInt();

            // Check if the entered number is negative
            if (num < 0) 
            {
                break;
            }

            // Accumulate sum and count
            sum += num;
            count++;
        }

        // Calculate average
        double average = (count > 0) ? (double) sum / count : 0.0;

        // Display sum and average
        System.out.println("Sum of the entered numbers: " + sum);
        System.out.println("Average of the entered numbers: " + average);

        scanner.close();
    }
}


/*
OUTPUT: Enter a sequence of integers (enter a negative number to stop):
		3
		5
		2
		4
		6
		-1
		Sum of the entered numbers: 20
		Average of the entered numbers: 4.0
*/