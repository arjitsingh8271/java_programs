import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class ListCreation {
	public static void main(String[] args) {
		
		// 1. method (Immutable List)
		List<Integer> l1 = List.of(2,4,3,1);
		System.out.println(l1);		// [2, 4, 3, 1]

		// 2. method (Mutable List)
		List<Integer> l2 = new ArrayList<>();
		l2.add(2);
		l2.add(3);
		l2.add(1);
		l2.add(4);
		System.out.println(l2);		// [2, 3, 1, 4]

		// 3. method (Immutable List)
		List<Integer> l3 = Arrays.asList(4,2,1,3);
		System.out.println(l3);		// [4, 2, 1, 3]

	}
}