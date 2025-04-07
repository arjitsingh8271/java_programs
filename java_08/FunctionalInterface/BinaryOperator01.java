/*
In BiFunction if I/O datatype are same then
we can replace BiFunction with UnaryOperator
*/

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

class BinaryOperator01 {
	public static void main(String[] args) {

		// Eg1:
		BiFunction<String, String, String> biFun = (str1, str2) -> str1 + str2;
		System.out.println(biFun.apply("Hello", " Java"));	// Hello Java

		BinaryOperator<String> biOp = (str1, str2) -> str1 + str2;
		System.out.println(biOp.apply("Hello", " Java"));	// Hello Java
	}
}