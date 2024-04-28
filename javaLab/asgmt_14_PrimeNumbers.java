/*
Implement a method to check whether a given number is prime or 
not, and use it to find all prime numbers within a given range.
*/



import java.util.Scanner;

public class asgmt_14_PrimeNumbers 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the lower bound of the range:");
        int lowerBound = scanner.nextInt();

        System.out.println("Enter the upper bound of the range:");
        int upperBound = scanner.nextInt();

        System.out.println("Prime numbers within the range [" + lowerBound + ", " + upperBound + "]:");
        findPrimeNumbers(lowerBound, upperBound);

        scanner.close();
    }

    // Method to check whether a number is prime or not
    public static boolean isPrime(int number) 
    {
        if (number <= 1) 
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) 
        {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to find prime numbers within a given range
    public static void findPrimeNumbers(int lowerBound, int upperBound) 
    {
        for (int i = lowerBound; i <= upperBound; i++) 
        {
            if (isPrime(i)) 
            {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Move to the next line after printing all prime numbers
    }
}



/*
OUTPUT: Enter the lower bound of the range:
		2
		Enter the upper bound of the range:
		9
		Prime numbers within the range [2, 9]:  
		2 3 5 7
*/