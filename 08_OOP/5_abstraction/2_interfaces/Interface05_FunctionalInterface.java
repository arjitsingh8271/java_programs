// Functional interface / SAM means interface havingonly one method.

interface A {	// Functional Interface
	void show();
}

class B {
	
	public void show() {
		System.out.println("Showing..");
	}
}


class Interface05_FunctionalInterface {
	public static void main(String[] args) {
		B b = new B();
		b.show();		// Showing..

	}
}