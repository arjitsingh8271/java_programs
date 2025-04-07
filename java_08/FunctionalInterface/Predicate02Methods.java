/*
Method				Description
------				-----------
test(T t)			Evaluates condition and returns true or false.
and(Predicate<T>)	Returns true if both predicates return true.
or(Predicate<T>)	Returns true if at least one predicate returns true.
negate()			Returns the opposite of the predicate result.
isEqual()			Returns a predicates that test if two args. are equal accordin to Object.esual(Object, Object).
*/

import java.util.function.Predicate;
import java.util.List;

class Student {
	private int id;
	private String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}
}


class Predicate02Methods {
	public static void main(String[] args) {

		// test(T t)
		Student s1 = new Student(1, "Arjit");
		Student s2 = new Student(2, "Ravi");

		Predicate<Student> pre = x -> x.getId() > 1;
		System.out.println(pre.test(s1));	// false
		System.out.println(pre.test(s2));	// true

		
		// and(Predicate<T>)
		Predicate<String> startWith = x -> x.toLowerCase().charAt(0) == 'a';
		Predicate<String> endWith = x -> x.toLowerCase().charAt(x.length()-1) == 't';
		Predicate<String> and = startWith.and(endWith);
		
		System.out.println(and.test("Ravi"));	// false
		System.out.println(and.test("Arjit"));	// true


		// or(Predicate<T>)
		Predicate<String> startWith1 = x -> x.toLowerCase().charAt(0) == 'a';
		Predicate<String> endWith1 = x -> x.toLowerCase().charAt(x.length()-1) == 't';
		Predicate<String> or = startWith1.or(endWith1);
		
		System.out.println(or.test("Ravi"));	// false
		System.out.println(or.test("Arjit"));	// true
		System.out.println(or.test("Binit"));	// true


		// negate()
		Predicate<String> startWith2 = x -> x.toLowerCase().charAt(0) == 'a';
		Predicate<String> negate = startWith2.negate();
		
		System.out.println(negate.test("Ravi"));	// true
		System.out.println(negate.test("Arjit"));	// false
							// OR
		System.out.println(startWith2.negate().test("Abhishek"));	// false


		// isEqual()
		Predicate<Object> pre1 = Predicate.isEqual("Ravi");
		System.out.println(pre1.test("Ravi"));	// true
		System.out.println(pre1.test("Abc"));	// false

		Predicate<Object> pre2 = Predicate.isEqual(33);
		System.out.println(pre2.test(3));	// false
		System.out.println(pre2.test(33));	// true


	}
}