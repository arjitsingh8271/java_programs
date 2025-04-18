/*
● Set + List = Map

● Map has Key Value Pairs.
● Key are Unique but Value may not be.
● One value per Key.
● Key is Set here, Value is List here.
● No Thread Safety


How Data is Stored in HashMap
-----------------------------
1️⃣ Step 1: Hashing the Key
	First, the key is passed through a hash function to generate a unique has code (an integer number).
	This hash code helps to determine where the key-value pair will be stored in the array (called a "bucket array").
2️⃣ Step 2: Calculating the Index
	The hash code is then used to calculate an index the array (bucket locaton) using
	(int index = hashCode % arraySize)
	The index decides which bucket will hold this key-value pair.
3️⃣ Step 3: Storing in the Bucket
	The key-value pair is stored in the bucket at calulated index.
	Each bucket can hold multiple key-value pairs.
	This is called a collision handling mechanism.


How HashMap Retrieves Data
--------------------------
When we call get(key), the HashMAp fallows these steps:
1️⃣ Step 1: Hashing the Key
	Similar to Insertion, the key is hashed using the same hash function to calculate its hash code.
2️⃣ Step 2: Finding the Index
	The hash code is used to find the index of the bucket where the key-value pair is stored.
3️⃣ Step 3: Searching in the Bucket
	Once the correct bucket is found, it checks for the key in that bucket
	If it finds the key, it returns the associated value.


Handling Collisions:
--------------------
● Since different keys can generate the same index (called a collision).
HashMAp uses a technique to handle this situation. Java's HashMap uses Linked Lists (or balanced trees after Java 8).
● If multiple key-value pairs map to the same bucket, they are stored in a Lnked List inside the bucket.
● When a key-value pair is retrieved, the HashMap traverses the linked list, checking each key until if finds a match.


HashMap Resizing (Rehashing)
----------------------------
● HashMap has an internal array size, which by default is 16.
● When the no. of elements (key-value pairs) grows and exceeds a certain load factor (default is 0.75),
HashMap automatically resizes the array to hold more data. This process is called rehashing.

● The default size if the arrat is 16, so whrn more than 12 elements (16 * 0.75) are inserted, the HashMap will resize.

During Rehashing: 
------------------
The array size is doubled
1. All exixting entries are rehashed (i.e., their position are recalculated) and placed into the new array.
2. This ensures the HashMap continus to perform efficiently even as more data is added.


Time Complexity
----------------
					Avg-Case	Worst-Case
put(key, value)		O(1)		O(logn)
get(key)			O(1)		O(logn)
remove(key)			O(1)		O(logn)


*/


import java.util.Map;
import java.util.HashMap;
import java.util.Set;


class M1_HashMap_01 {
	public static void main(String[] args) {

		//Map<String, Integer> students = new HashMap<>();
		HashMap<Integer, String> students = new HashMap<>();

		students.put(21, "Rahul");
		students.put(19, "Manish");
		students.put(22, "Anjali");
		students.put(20, "Shayam");

		System.out.println(students);			// {19=Manish, 20=Shayam, 21=Rahul, 22=Anjali} 
		
		students.put(21, "Ravi");

		System.out.println(students);			// {19=Manish, 20=Shayam, 21=Ravi, 22=Anjali} 
		
		// values()
		System.out.println(students.values());	// [Manish, Shayam, Ravi, Anjali]
		
		// get()
		System.out.println(students.get(22));	// Anjali
		System.out.println(students.get(1));	// null

		// containsKey()
		System.out.println(students.containsKey(2));	// false
		System.out.println(students.containsKey(19));	// true

		// containsValue()
		System.out.println(students.containsValue("Shayam"));	// true
		System.out.println(students.containsValue("Amit"));		// false

		// remove();
		students.remove(20);
		System.out.println(students);	// {19=Manish, 21=Ravi, 22=Anjali}

		boolean res = students.remove(19, "Anjali");
		System.out.println("REMOVED ? : " + res);	// REMOVED ? : false

		// keySet()
		Set<Integer> set = students.keySet();
		for (int i : set) {
			System.out.println(students.get(i));	// Manish Rahul Anjali
		}

		// entrySet()
		Set<Map.Entry<Integer, String>> entries = students.entrySet();
		for (Map.Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + ": " + entry.getValue());	// 19: Manish ...
		}


		
		HashMap<String, Integer> students1 = new HashMap<>();

		students1.put("Rahul", 91);
		students1.put("Manish", 80);
		students1.put("Anjali", 95);

		// key()
		//System.out.println(students1.getKey());

		// getOrDefault()
		System.out.println(students1.getOrDefault("Anjali", 0));	// 95
		System.out.println(students1.getOrDefault("Ravi", 0));		// 0

		// keySet()
		System.out.println(students1.keySet());		// [Rahul, Manish, Anjali]

		// putIfAbsent();
		students1.putIfAbsent("Ravi", 88);
		System.out.println(students1);		// {Rahul=91, Ravi=88, Manish=80, Anjali=95}

		students1.putIfAbsent("Ravi", 81);	// not add
		System.out.println(students1);

	}
}