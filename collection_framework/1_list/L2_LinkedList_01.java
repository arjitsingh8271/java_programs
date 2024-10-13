/*
Key Characteristics of LinkedList:
----------------------------------

Doubly-Linked: Each node in a LinkedList contains a reference to the 
previous node and the next node, allowing for bidirectional traversal.

Dynamic Size: Like ArrayList, a LinkedList can grow or shrink 
in size dynamically as elements are added or removed.

Efficient Insertions/Deletions: Inserting or deleting an element 
in a LinkedList is more efficient than in an ArrayList, especially 
when dealing with large datasets, because it does not require shifting elements.

Non-Indexed Access: Unlike ArrayList, LinkedList does not provide 
constant-time access to elements based on their index, as it must 
traverse the list to reach a specific element.

*/


import java.util.Collection;
import java.util.List;
import java.util.LinkedList;


class L2_LinkedList_01 {
	
	public static void main(String[] args) {
		
		// Create a LinkedList
		//Collection<String> fruits = new LinkedList<>();
		//List<String> fruits = new LinkedList<>();
		LinkedList<String> fruits = new LinkedList<>();

		// Add elements to the LinkedList
		fruits.add("Apple");
		fruits.addFirst("Banana"); 		// Adds "Banana" at the beginning
		fruits.addLast("Cherry");  		// Adds "Cherry" at the end
		fruits.add("Orange");

		// Access an 1 element
		System.out.println(fruits.get(1));		// Apple
		System.out.println(fruits.getFirst());	// Banana
		System.out.println(fruits.getLast());	// Orange

		// Access all element
		System.out.println(fruits);				// [Banana, Apple, Cherry, Orange]

		// Update an element
		fruits.set(1, "Mango");
		System.out.println(fruits);				// [Banana, Mango, Cherry, Orange]

		// Remove element
		fruits.remove(0);
		fruits.remove("Mango");
		fruits.removeFirst();

		// Check the Size
		System.out.println(fruits.size());		// 1

		// Check if the List is Empty
		System.out.println(fruits.isEmpty());			// false

		// Check if an element exists
        System.out.println(fruits.contains("Mango"));	// false


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
Advantages of LinkedList:
-------------------------
Efficient Insertions/Deletions: Adding or removing elements from the 
beginning or end of the list is faster than in ArrayList.

No Shifting Required: When inserting or removing elements, LinkedList 
does not require shifting elements, making it more efficient for such operations.

Disadvantages of LinkedList:
----------------------------
Slower Access: Accessing an element by index takes linear time (O(n)) 
because the list must be traversed from the start or end.

Higher Memory Usage: Each element in a LinkedList requires additional 
memory for the references to the previous and next elements.
*/