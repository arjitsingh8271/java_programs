/*
● Predicate<T> is a functional interface in Java (introduced in Java 8) that:
● Takes one input (of type T).		// <T> Generic Type
● Returns a boolean value (true or false).
● Used for conditional checks, filtering, and validations.
● Used mainly in lambda expressions and stream operations.
● It is part of the java.util.function package.

Method				Description
------				-----------
test(T t)			Evaluates condition and returns true or false.
and(Predicate<T>)	Returns true if both predicates return true.
or(Predicate<T>)	Returns true if at least one predicate returns true.
negate()			Returns the opposite of the predicate result.
isEqual()
*/


import java.util.function.Predicate;
import java.util.List;

class Predicate01 {
	public static void main(String[] args) {
		
		// Eg1:
		Predicate<Integer> isAdult = age -> age >= 18;		// Lambda Expression

		System.out.println(isAdult.test(10));	// false
		System.out.println(isAdult.test(18));	// true


		// Eg2:
		List<Integer> num = List.of(1,2,3,4,5);
		Predicate<Integer> isEven = x -> x % 2 == 0;

		for(Integer i : num) {
			if(isEven.test(i)){
				System.out.println(i);
			}
		}


		// Eg3:
		Predicate<String> startWith = x -> x.toLowerCase().charAt(0) == 'a';
		System.out.println(startWith.test("ravi"));


	}
}