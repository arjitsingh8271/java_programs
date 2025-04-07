// Comparator is a Concept or a Interface using we can specifi our own logic for Sorting.

import java.util.ArrayList;
import java.util.Collections;	// Collections is a Class
import java.util.Comparator;


class Comparator01_Sorting {
	public static void main(String[] args) {

		ArrayList<Integer> num = new ArrayList<>();

		num.add(23);
		num.add(41);
		num.add(14);
		num.add(52);
		System.out.println(num);


		// Ascending Order 		(Using Anonymous Class)
		Collections.sort(num, new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				return a - b;
			}
		});
		// (Using Lambda Expression)
		// Collections.sort(num, (a, b) -> a - b);
		System.out.println(num);	// [14, 23, 41, 52]


		// Descending Order		(Using Anonymous Class)
		Collections.sort(num, new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				return b - a;
			}
		});
		// (Using Lambda Expression)
		// Collections.sort(num, (a, b) -> b - a); 
		System.out.println(num);	// [52, 41, 23, 14]

	}

}