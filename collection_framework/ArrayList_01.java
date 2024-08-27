/*
Key Characteristics of ArrayList:
---------------------------------

Dynamic Size: Unlike arrays, ArrayList can dynamically resize 
itself when elements are added or removed.

Indexed Access: ArrayList allows random access to elements, 
meaning you can access any element in constant time (O(1)).

Preserves Order: ArrayList maintains the order of insertion. 
Elements are stored in the order they were added.

Allows Duplicates: You can store duplicate elements in an ArrayList.

Non-Synchronized: ArrayList is not thread-safe, meaning that if 
multiple threads modify an ArrayList concurrently, it must be synchronized externally.

*/

import java.util.ArrayList;

class ArrayList_01 {
	
	public static void main(String[] args) {
		
		// Create an ArrayList
		ArrayList<String> fruits = new ArrayList<>();

       	// Add elements to the ArrayList
       	fruits.add("Apple");
       	fruits.add("Banana");
       	fruits.add("Cherry");

		// Access an 1 element
		System.out.println(fruits.get(1));		// Banana

		// Access an all element
		System.out.println(fruits);				// [Apple, Banana, Cherry]

		// Update an element
		fruits.set(1, "Mango");
		System.out.println(fruits);				// [Apple, Mango, Cherry]

		// Remove an element
		fruits.remove("Apple");
		System.out.println(fruits);				// [Mango, Cherry]

		// Check the Size
		System.out.println(fruits.size());		// 2

		// Check if the List is Empty
		System.out.println(fruits.isEmpty());			// false

		// Check if an element exists
        System.out.println(fruits.contains("Mango"));	// true


		// Iterating Over Elements (for loop)
		for (int i = 0; i < fruits.size(); i++) {
    		System.out.println(fruits.get(i));
		}

		// Iterating Over Elements (for-each loop)
		for (String list : fruits) {
    		System.out.println(list);
		}
	}
}


/*
Advantages of ArrayList:
------------------------
Dynamic Sizing: Automatically resizes itself, making it flexible
 for use cases where the number of elements is not fixed.

Fast Access: Provides constant-time access to elements.

Ease of Use: Provides many useful methods for common operations 
like adding, removing, and searching for elements.

Disadvantages of ArrayList:
---------------------------
Slower Insertions/Deletions: Adding or removing elements in the middle 
of the list can be slow (O(n)) because elements need to be shifted.

Not Thread-Safe: Must be synchronized externally if used in a multithreaded environment.
*/