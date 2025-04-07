/*
In Function if I/O datatype are same then
we can replace Function with UnaryOperator
*/

import java.util.function.Function;
import java.util.function.UnaryOperator;

class UnaryOperator01 {
	public static void main(String[] args) {
		
		// Eg1:
		Function<Integer, Integer> fun1 = x -> x*x;
		System.out.println(fun1.apply(2));	// 4
		
		UnaryOperator<Integer> unOp1 = x -> x*x;
		System.out.println(unOp1.apply(3));		// 9


		// Eg2:
		Function<String, String> fun2 = x -> x.toLowerCase();
		System.out.println(fun2.apply("APPLE"));	// apple

		UnaryOperator<String> unOp2 = x -> x.toLowerCase();
		System.out.println(unOp2.apply("Mango"));	// mango



	}
}