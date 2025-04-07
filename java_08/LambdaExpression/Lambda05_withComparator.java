import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Lambda05_withComparator {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>(List.of(1,4,2,3));

		System.out.println(num);	// [1, 4, 2, 3]

		// Ascending order sorting
		Collections.sort(num, (a, b) -> a - b);
		System.out.println(num);	// [1, 2, 3, 4]

		// Descending order sorting
		Collections.sort(num, (a, b) -> b - a);
		System.out.println(num);	// [4, 3, 2, 1]

	}
}