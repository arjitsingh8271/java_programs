// Comparator is a Concept or a Interface using we can specifi our own logic for Sorting.

import java.util.ArrayList;
import java.util.Collections;	// Collections is a Class
import java.util.Comparator;


class Comparator01_lastDigitSort {
	public static void main(String[] args) {

		ArrayList<Integer> num = new ArrayList<>();

		num.add(23);
		num.add(41);
		num.add(14);
		num.add(52);

		System.out.println(num);	// [23, 41, 14, 52]

		Collections.sort(num);

		System.out.println(num);	// [14, 23, 41, 52]



		// Sorting with last digit of the numbers
		Comparator<Integer> com = new Comparator<>() {
			public int compare(Integer i, Integer j) {
				if(i%10 > j%10)
					return 1;
				else
					return -1;
			}
		};

		// Comparator<Integer> com = (i,j) -> i%10 > j%10 ? 1 : -1;		// Lambda Expresion


		Collections.sort(num, com);

		System.out.println(num);	// [41, 52, 23, 14]
	}
}