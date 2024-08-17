/*
Anonymous Inner Class in Java:
An inner class declared without a class name is known as an anonymous 
inner class in Java. It is created for implementing an interface or 
extending a class. Since an anonymous class has no name, it is not 
possible to define a constructor for an anonymous class. 
Its name is decided by the java compiler.
*/

abstract class My {
	abstract void display();
}

	// or

// interface My {
// 	void display();
// }

class Outer {
	
	void outerDisplay() {

		// Anonymous Inner Class
		My m = new My() {

			void display() {
				System.out.println("Hello.");
			}
		};

		m.display();
	}
}

class _03_AnonymousInnerClass {
	
	public static void main(String[] args) {

		Outer o = new Outer();
		o.outerDisplay();
	}
}

