import java.util.Collection;
import java.util.ArrayList;

class Collection01 {
	public static void main(String[] args) {
		
		Collection<Integer> num = new ArrayList<>();
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);

		System.out.println(num);		// [2, 3, 4, 5]

		for (int x : num)
			System.out.println(x);		// 2
										// 3
										// 4
										// 5

	}
}