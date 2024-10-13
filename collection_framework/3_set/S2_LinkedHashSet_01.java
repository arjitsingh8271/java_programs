/*
LinkedHashSet has Unique values i.e 'No Duplicate values'
LinkedHashSet does'n support Index values.
LinkedHashSet is Input Order.

*/

import java.util.Collection;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;


class S2_LinkedHashSet_01 {
	public static void main(String[] args) {
		
		//Collection<Integer> num = new LinkedHashSet<>();
		//Set<Integer> num = new LinkedHashSet<>();
		//HashSet<Integer> num = new LinkedHashSet<>();
		LinkedHashSet<Integer> num = new LinkedHashSet<>();

		num.add(21);
		num.add(52);
		num.add(39);
		num.add(21);
		num.add(60);

		System.out.println(num);		// [21, 52, 39, 60]

	}
}