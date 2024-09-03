/*
Recursion in Java is a process where a method calls itself to solve a problem. 
A recursive method typically has two parts:

Base Case: This is the condition under which the recursion stops. 
Without a base case, the recursion would continue indefinitely, 
leading to a StackOverflowError.

Recursive Case: This part of the method reduces the problem into smaller 
instances of the same problem and calls itself with these smaller instances.

*/

class Recursion_01 {

	// Normal method
	// static void fun() {
	// 	System.out.println("Hello1");
	// }

	// Recursive method 		// infinite loop
	// static void fun(int n) {
	// 	System.out.println("Hello2");
	// 	fun(n-1);
	// }

	// Recursive method with base condition
	static int fun(int n) {
		// Base case: if n is 0, return 0
		if (n==0) {
			return 0;
		}
		System.out.println("Hello " +n);
		// Recursive case: (n-1)
		return fun(n-1);
	}

	public static void main(String[] args) {

		fun(5);
	}
}




/*
Advantages of Recursion:
------------------------
Simplifies complex problems: Some problems are naturally recursive and 
can be elegantly solved with recursion.
Cleaner code: Recursion can lead to more concise and readable code.

Disadvantages of Recursion:
---------------------------
Performance: Recursive solutions can be less efficient in terms of both time and 
space (due to function call overhead and stack usage) compared to iterative solutions.
Risk of StackOverflowError: If the base case is not correctly defined or the 
input is too large, the program might crash due to too many nested recursive calls.
*/