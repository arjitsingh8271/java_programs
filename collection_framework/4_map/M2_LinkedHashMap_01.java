/*
In LinkedHashMap a double linkedList along with array like HashMap stores all data.
Slower than HashMap.
Takes more memory than HashMap.
*/


import java.util.Map;
import java.util.LinkedHashMap;

class M2_LinkedHashMap_01 {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> var1 = new LinkedHashMap<>();

		var1.put(21, "Rahul");
		var1.put(19, "Manish");
		var1.put(22, "Anjali");
		var1.put(20, "Shayam");

		System.out.println(var1);	// {21=Rahul, 19=Manish, 22=Anjali, 20=Shayam}
	
		var1.get(22);
		System.out.println(var1);	// {21=Rahul, 19=Manish, 22=Anjali, 20=Shayam}




		LinkedHashMap<String, Integer> var2 = new LinkedHashMap<>(5, 0.3f, true);

		var2.put("Apple", 10);
		var2.put("Mango", 20);
		var2.put("Orange", 30);

		System.out.println(var2);	// {Apple=10, Mango=20, Orange=30}
	
		var2.get("Apple");
		System.out.println(var2);	// {Mango=20, Orange=30, Apple=10}

		var2.get("Mango");
		System.out.println(var2);	// {Orange=30, Apple=10, Mango=20}
	}
}