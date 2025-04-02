interface A {
	default void hello() {
		System.out.println("Hello World");
	}
}

interface B {
	@Override
	default void hello() {
		System.out.println("Hello World");
	}
}

/*
class DefaultMethodInInterface2 implements A, B{
	public static void main(String[] args) {
		DefaultMethodInInterface2 obj = new DefaultMethodInInterface2();
		obj.hello();	// error: types A and B are incompatible;
	}
}
*/

class DefaultMethodInInterface2 implements A, B{
	public static void main(String[] args) {
		DefaultMethodInInterface2 obj = new DefaultMethodInInterface2();
		obj.hello();	// Hello World 
	}

	@Override
	public void hello() {
		A.super.hello();
	}
}
