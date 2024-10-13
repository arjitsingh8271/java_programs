/*
Lambda Expression use only with Function Interface.
*/

@FunctionalInterface
interface A {
	void show();
}


class Lambda01 {
	public static void main(String[] args) {

		// Annonumous inner class
		A a = new A() {
			public void show() {
				System.out.println("Showing...");
			}
		};
		a.show();

		// Lambda Expression
		A b = () -> System.out.println("Showing...");
		b.show();
	}
}


/*
Showing...                                                                         
Showing...
*/