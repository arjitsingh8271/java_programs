/*
HashSet has Unique values i.e 'No Duplicate values'
HashSet does'n support Index values.
HashSet is Unorder.

*/


import java.util.Collection;
import java.util.Set;
import java.util.HashSet;


class S1_HashSet_01 {
	public static void main(String[] args) {
		
		//Collection<Integer> num = new HashSet<>();
		//Set<Integer> num = new HashSet<>();
		HashSet<Integer> num = new HashSet<>();

		num.add(21);
		num.add(52);
		num.add(39);
		num.add(21);
		num.add(60);

		System.out.println(num);		// [52, 21, 39, 60]

	}
}