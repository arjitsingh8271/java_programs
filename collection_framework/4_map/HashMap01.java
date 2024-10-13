/*
Set + List = Map

Map has Key Value Pairs.
Key are Unique.
Key is Set here, Value is List here.

*/


import java.util.Map;
import java.util.HashMap;


class HashMap01 {
	public static void main(String[] args) {

		//Map<String, Integer> students = new HashMap<>();
		HashMap<String, Integer> students = new HashMap<>();

		students.put("Rahul", 21);
		students.put("Manish", 19);
		students.put("Anjali", 22);
		students.put("Shayam", 20);

		System.out.println(students);			// {Shayam=20, Rahul=21, Manish=19, Anjali=22}

		System.out.println(students.keySet());	// [Shayam, Rahul, Manish, Anjali]

		System.out.println(students.values());	// [20, 21, 19, 22]


		for (String str : students.keySet())
			System.out.println(str +" " +students.get(str));
		
		// Shayam 20                                                                          
		// Rahul 21
		// Manish 19
		// Anjali 22

	}
}