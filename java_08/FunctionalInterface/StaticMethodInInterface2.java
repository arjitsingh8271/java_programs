interface A {
	public static void hello() {
		System.out.println("Hello World");
	}
}


class StaticMethodInInterface2 implements A{
	public static void main(String[] args) {
		StaticMethodInInterface2 obj = new StaticMethodInInterface2();
		obj.hello();	// -> Hello
	}

	// New Implementation
	public static void hello() {
		System.out.println("Hello");
	}
}