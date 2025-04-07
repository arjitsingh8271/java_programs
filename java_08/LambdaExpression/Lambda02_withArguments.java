@FunctionalInterface
interface A {
	void show(int n);
}

@FunctionalInterface
interface B {
	void show(int n, int m);
}


class Lambda02_withArguments {
	public static void main(String[] args) {

		// Annonumous inner class
		A a = new A() {
			public void show(int n) {
				System.out.println("Showing..." +n);
			}
		};
		a.show(5);


		// Lambda Expression with one Argument
		//A b = (int n) -> System.out.println("Showing..." +n);
		//A b = (n) -> System.out.println("Showing..." +n);
		A b = n -> System.out.println("Showing..." +n);
		b.show(10);


		// Lambda Expression with two Argument
		//B c = (int n, int m) -> System.out.println("Showing..." +n +m);
		//B c = (n, m) -> System.out.println("Showing..." +n +m);
		c.show(10, 20);
	}
}


/*
Showing...5                                                                    
Showing...10                       
Showing...1020
*/