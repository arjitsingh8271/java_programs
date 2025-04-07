import java.util.Collection;	// Interface
import java.util.ArrayList;

class Collection01 {
	public static void main(String[] args) {
		
		Collection<Integer> num = new ArrayList<>();
		num.add(2);
		num.add(34);
		num.add(43);
		num.add(5);

		System.out.println(num);		// [2, 34, 43, 5]

		for (int x : num)
			System.out.println(x);		// 2
										// 34
										// 43
										// 5

	}
}