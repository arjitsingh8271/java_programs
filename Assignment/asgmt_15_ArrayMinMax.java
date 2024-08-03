// Create a program to find the largest and smallest elements in an array of integers.

import java.util.Scanner;

public class asgmt_15_ArrayMinMax 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = scanner.nextInt();
        }

        // Find the largest and smallest elements
        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < n; i++) 
        {
            if (arr[i] > largest) 
            {
                largest = arr[i];
            }
            if (arr[i] < smallest) 
            {
                smallest = arr[i];
            }
        }

        // Display the largest and smallest elements
        System.out.println("Largest element in the array: " + largest);
        System.out.println("Smallest element in the array: " + smallest);

        scanner.close();
    }
}


/*
OUTPUT: Enter the number of elements in the array:
		5
		Enter the elements of the array:
		1
		2
		3	
		55
		1
		Largest element in the array: 55
		Smallest element in the array: 1
*/
