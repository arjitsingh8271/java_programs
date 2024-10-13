import java.util.ArrayList;
import java.util.Collections;	// Collections is a Class

class Sorting01 {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();

		num.add(3);
		num.add(1);
		num.add(4);
		num.add(2);

		System.out.println(num);	// [3, 1, 4, 2]

		Collections.sort(num);

		System.out.println(num);	// [1, 2, 3, 4]

	}
}