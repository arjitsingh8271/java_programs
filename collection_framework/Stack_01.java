/*
Key Characteristics of Stack in JCF:
LIFO (Last-In, First-Out) Structure: Stack follows the LIFO principle, where the last element added to the stack is the first one to be removed.

Inheritance: The Stack class extends Vector, meaning it inherits all the methods and properties of a Vector.

Thread Safety: Like Vector, Stack is synchronized, making it thread-safe for use by multiple threads. This ensures that operations on the stack are atomic and prevent concurrent access issues.

Legacy Class: Stack is considered a legacy class, and while it is still in use, alternatives like Deque (with its ArrayDeque implementation) are often recommended for new code because they provide more flexibility and better performance in certain scenarios.

*/


import java.util.Stack;

class Stack_01 {
	
	public static void main(String[] args) {
		
		// Create a Stack
		Stack<Integer> s = new Stack<>();

		// Add / push element
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);

		// Top / peek element
		System.out.println(s.peek());		// 40

		// Remove / pop element
		System.out.println(s.pop());		// 40

		// Access an 1 element
		System.out.println(s.get(1));		// 20

		// Access all element
		System.out.println(s);				// [10, 20, 30]

		// Check Size
		System.out.println(s.size());		// 3

		// Check if the List is Empty
		System.out.println(s.isEmpty());		// false

		// Check if an element exists
        System.out.println(s.contains(20));		// true


        // Iterating Over Elements (for loop)
		for (int i = 0; i < s.size(); i++) {
    		System.out.println(s.get(i));
		}

		// Iterating Over Elements (for-each loop)
		for (int list : s) {
    		System.out.println(list);
    	}

	}
}


