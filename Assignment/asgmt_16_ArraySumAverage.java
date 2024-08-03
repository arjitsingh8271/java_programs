// Write a program to find the sum of elements in a 2D array and calculate the average.


import java.util.Scanner;

public class asgmt_16_ArraySumAverage 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows in the 2D array:");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of columns in the 2D array:");
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];

        System.out.println("Enter the elements of the 2D array:");

        // Input elements into the 2D array
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                array[i][j] = scanner.nextInt();
            }
        }

        // Calculate sum of elements
        int sum = 0;
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                sum += array[i][j];
            }
        }

        // Calculate average of elements
        double average = (double) sum / (rows * cols);

        // Display sum and average
        System.out.println("Sum of elements in the 2D array: " + sum);
        System.out.println("Average of elements in the 2D array: " + average);

        scanner.close();
    }
}



/*
OUTPUT: Enter the number of rows in the 2D array:
		2
		Enter the number of columns in the 2D array:
		2
		Enter the elements of the 2D array:
		1
		2
		3
		4
		Sum of elements in the 2D array: 10
		Average of elements in the 2D array: 2.5
*/