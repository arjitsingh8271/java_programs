/*
Method					Description
------					-----------
apply(T t)				Applies function on T and returns R.
andThen(Function<R, V>)	Executes first function, then the next.
compose(Function<V, T>)	Executes second function first, then the first.
identity()				Return a function that always returns its input args.

*/

import java.util.function.Function;


class Function02Methods {
	public static void main(String[] args) {
		
		// andThen(Function<R, V>)
		Function<Integer, Integer> fun1 = x -> x * 2;
		Function<Integer, Integer> fun2 = x -> x * x * x;

		System.out.println(fun1.andThen(fun2).apply(2));	// 64
		System.out.println(fun2.andThen(fun1).apply(2));	// 16

		// compose(Function<V, T>)
		System.out.println(fun1.compose(fun2).apply(2));	// 16
		System.out.println(fun2.compose(fun1).apply(2));	// 64


		// identity()
		Function<String, String> fun3 = Function.identity();
		System.out.println(fun3.apply("Mango"));	// Mango

	}
}