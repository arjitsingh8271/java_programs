// Same as Function, but it takes two arguments.
// Methods: 1.apply(), 2.andThen()

import java.util.function.Function;
import java.util.function.BiFunction;

class BiFunction01 {
	public static void main(String[] args) {
		
		// Eg1:
		Function<String, Integer> checkLen = str -> str.length();
		System.out.println(checkLen.apply("mango"));	// 5

		BiFunction<String, String, Integer> addLen = (str1, str2) -> str1.length() + str2.length();
		System.out.println(addLen.apply("apple", "banana"));	// 11
	}
}