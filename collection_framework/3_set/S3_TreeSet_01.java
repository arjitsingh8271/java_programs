/*
TreeSet has Unique values i.e 'No Duplicate values'
TreeSet does'n support Index values.
TreeSet is Sorted Order.

*/

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;


class S3_TreeSet_01 {
	public static void main(String[] args) {
		
		//Collection<Integer> num = new TreeSet<>();
		//Set<Integer> num = new TreeSet<>();
		TreeSet<Integer> num = new TreeSet<>();

		num.add(21);
		num.add(52);
		num.add(39);
		num.add(21);
		num.add(60);

		System.out.println(num);		// [21, 39, 52, 60]

	}
}