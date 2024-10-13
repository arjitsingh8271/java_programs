/*
Key Characteristics of Vector:
------------------------------

Resizable Array: Vector can grow or shrink in size dynamically
 as elements are added or removed, just like an ArrayList.

Thread Safety: One of the main features of Vector is that it is synchronized, 
meaning that it is thread-safe for use by multiple threads. 
This means that only one thread can access a Vector object at a time, 
which can prevent concurrency issues but may lead to performance 
overhead compared to non-synchronized collections like ArrayList.

Legacy Class: Vector is a part of the original Java 1.0, so it is considered a 
legacy class. However, it has been retrofitted to implement the List interface, 
making it part of the Java Collections Framework.

Automatic Doubling: By default, when a Vector needs to grow, it doubles its size. 
This can be more aggressive than the resizing strategy used by ArrayList.
*/

import java.util.Collection;
import java.util.List;
import java.util.Vector;

class L3_Vector_01 {
	
	public static void main(String[] args) {
		
		// Create an Vector
		//Collection<String> fruits = new Vector<>();
		//List<String> fruits = new Vector<>();
		Vector<String> fruits = new Vector<>();

       	// Add elements to the Vector
       	fruits.add("Apple");
       	fruits.add("Banana");
       	fruits.add("Cherry");

		// Access an 1 element
		System.out.println(fruits.get(1));		// Banana

		// Access all element
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
Advantages of Vector:
---------------------
Thread Safety: Vector is synchronized, making it safe to use in multi-threaded 
environments without needing additional synchronization.

Legacy Support: It provides support for legacy systems that still rely on Vector.

Disadvantages of Vector:
------------------------
Performance Overhead: The synchronization in Vector can lead to performance 
overhead, especially when thread safety is not required.

Less Frequent Use: In modern Java programming, ArrayList is preferred over 
Vector when thread safety is not a concern because of its better performance.
*/