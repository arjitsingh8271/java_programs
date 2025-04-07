/*
● Function<T, R> is a functional interface in Java (introduced in Java 8) that represents a function that:
● Takes one input (of type T).
● Returns one output (of type R).
● Used mainly in lambda expressions
● It is part of the java.util.function package.

Method					Description
------					-----------
apply(T t)				Applies function on T and returns R.
andThen(Function<R, V>)	Executes first function, then the next.
compose(Function<V, T>)	Executes second function first, then the first.
identity()				Return a function that always returns its input args.

*/

import java.util.function.Function;

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


class Function01 {
	public static void main(String[] args) {
		
		// Eg1:
		Function<Integer, Integer> sqr = num -> num*num;	

		System.out.println("Square of 2: " +sqr.apply(2));	// Square of 2: 4 
		System.out.println("Square of 5: " +sqr.apply(5));	// Square of 5: 25


		// Eg2:
		Function<String, Integer> len = n -> n.length();
		System.out.println(len.apply("Apple"));		// 5

	}
}

/*
Function<Integer, Integer> : Function takes Integer as Input and return Integer as Output.
sqr = num -> num*num; : Lambda expresion
*/