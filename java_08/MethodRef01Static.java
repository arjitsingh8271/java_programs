/*
● A Method Reference is a shorthand syntax for a lambda expression that calls an existing method.
● It simply means that you can pass a method name inside the method by specifying this method is responsible to do the work for you. 
● You have to mention the class name or the object name to use it.
● Syntax: ClassName::methodName
● :: -> Method Reference Operator
● It replaces:
() -> ClassName.methodName()

*/

// Static Method Reference

import java.util.List;
import java.util.function.BiFunction;

class MethodRef01Static {

	public static int add(int a, int b) {
        return a + b;
    }

	public static void print(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		
		List<String> list = List.of("Alice", "Bob", "Charlie");
		list.forEach(x -> System.out.println(x));	// Alice
													// Bob
													// Charlie

		// Method Reference
		list.forEach(MethodRef01Static::print);	// Alice
													// Bob
													// Charlie


		BiFunction<Integer, Integer, Integer> ref = MethodRef01Static::add;	// Method Reference
        System.out.println(ref.apply(10, 20));		// 30
	}
}