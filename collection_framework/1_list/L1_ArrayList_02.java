import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

class L1_ArrayList_02 {
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();

		arr.add(3);
		arr.add(2);
		arr.add(1);

		//arr.remove(1);				// by index it will remove 2
		//System.out.println(arr);		// [3, 1]
		
		arr.remove(Integer.valueOf(1));	// by value it will remove 1
		System.out.println(arr);		// [3, 2]


		// String[] str = arr.toArray(new String[0]);
		// System.out.println(str);


		// COMPARATOR: custom ordering
		// Sorting the elements

		// by ascending order
		//Collections.sort(arr);
		arr.sort(null);		// here null is a COMPARATOR
		System.out.println(arr);		// [2, 3]

		// by descending order
		arr.sort((a, b) -> b - a);		// creating own COMPARATOR using lambda expression
		System.out.println(arr); 

		
		List<String> str = Arrays.asList("Three", "One", "Five");
		System.out.println(str);		// [Three, One, Five]

		// by length ascending order
		str.sort((a, b) -> a.length() - b.length());
		System.out.println(str);		// [One, Five, Three]

		// by length descending order
		str.sort((a, b) -> b.length() - a.length());
		System.out.println(str);		// [Three, Five, One]
	}
}