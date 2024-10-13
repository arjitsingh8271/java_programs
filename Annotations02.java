@FunctionalInterface
interface A {
	void show();
}

class B implements A {
	@Override
	public void show() {
		System.out.println("Showing..");
	}

	public void display() {
		System.out.println("Displaying..");
	}
}

class Annotations02 {
	public static void main(String[] args) {

		B b = new B();
		b.show();
	}
}