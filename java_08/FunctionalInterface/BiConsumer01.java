// Same as Consumer, but it takes two arguments.
// Method: andThen()

import java.util.function.Consumer;
import java.util.function.BiConsumer;

class BiConsumer01 {
	public static void main(String[] args) {
		
		// Eg1:
		Consumer<Integer> Con = x -> System.out.println(x);
		Con.accept(121);	// 121

		BiConsumer<Integer, Integer> BiCon = (x, y) -> System.out.println(x + y);
		BiCon.accept(1,2);	// 3
	}
}