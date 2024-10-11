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

// interface My {
// 	void display();
// }


class AnonymousAbstractClass {
	
	public static void main(String[] args) {

		// Anonymous Inner Class
		My obj = new My() {		// this is the object of Anonymous Class
			void display() {
				System.out.println("Hello World.");
			}
		};

		obj.display();
	}
}


/*
OUTPUT: Hello World.
*/