/*
● Static methods in Interface are those methods, which are define in the interface with the keyword "static".
● Static method contain the complete defination of the function.
● Cannot be overriden or changed in the implementation class.
● We can also write main method inside Interface.
*/

interface A {
	public static void hello() {
		System.out.println("Hello World");
	}

	default void bye() {
		System.out.println("Bye Bye");
	}
}


class StaticMethodInInterface1 implements A{
	public static void main(String[] args) {
		StaticMethodInInterface1 obj = new StaticMethodInInterface1();
		//obj.hello();	// error: cannot find symbol
		obj.bye();	// -> Bye Bye

		A.hello();	// -> Hello World
	}
}
