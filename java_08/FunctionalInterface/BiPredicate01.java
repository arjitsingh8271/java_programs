// Same as Predicate, but it takes two arguments.
// Methods: 1.text(), 2.and(), 3.or(), 4.negate()

import java.util.function.Predicate;
import java.util.function.BiPredicate;

class BiPredicate01 {
	public static void main(String[] args) {
		
		// Eg1:
		Predicate<Integer> EvenOdd1 = x -> x%2==0;
		System.out.println(EvenOdd1.test(2));	// true
		System.out.println(EvenOdd1.test(3));	// false
		
		BiPredicate<Integer, Integer> EvenOdd2 = (x, y) -> x%2==0 && y%2==0;
		System.out.println(EvenOdd2.test(2, 4));	// true
		System.out.println(EvenOdd2.test(2, 3));	// false


		// Eg2:
		BiPredicate<String, Integer> checkLen = (str, x) -> str.length()==x;
		System.out.println(checkLen.test("apple", 5));		// true
		System.out.println(checkLen.test("banana", 5));		// false

	}
}