// Functional interface / SAM means interface having only one method.

interface A {	// Functional Interface
	void show();
}

class B {
	
	public void show() {
		System.out.println("Showing..");
	}
}


class FunctionalInterface {
	public static void main(String[] args) {
		B b = new B();
		b.show();		// Showing..

	}
}
