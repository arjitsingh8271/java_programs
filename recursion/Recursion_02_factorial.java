/*
The factorial of a non-negative integer n is the product of all 
positive integers less than or equal to n. It is denoted by n!. 
The factorial of 0 is defined to be 1.

Mathematically:

n! = n × (n−1) × (n−2) × ⋯ ×
n! = n × (n−1)!
0! = 1
*/



class Recursion_02_factorial {

	static int factorial(int n) {
		// Base case: if n is 0, return 1
		if (n == 0) {
			return 1;
		}
		// Recursive case: n * factorial of (n-1)
		return n * factorial(n-1);
	} 


	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
	
}


/*
How Recursion Works:
--------------------
For factorial(5), the following steps occur:

factorial(5) calls factorial(4)
factorial(4) calls factorial(3)
factorial(3) calls factorial(2)
factorial(2) calls factorial(1)
factorial(1) calls factorial(0)
factorial(0) returns 1 (base case)

Then, each method call returns its value multiplied by the current n, unwinding back up the call stack.
So, the calculations occur as follows:

factorial(1) returns 1 * 1 = 1
factorial(2) returns 2 * 1 = 2
factorial(3) returns 3 * 2 = 6
factorial(4) returns 4 * 6 = 24
factorial(5) returns 5 * 24 = 120

Other Common Examples of Recursion:
-----------------------------------
Fibonacci Series: Finding the nth Fibonacci number.
Sum of Digits: Summing up all digits of a number.
Binary Search: Efficiently searching a sorted array.
*/