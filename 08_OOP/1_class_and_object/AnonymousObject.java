// When we create an object without the reference of Class i.e Anonymous object.

class Test {
	
	Test() {
		System.out.println("Object created");
	}

	void display() {
		System.out.println("Display Test");
	}
}


class AnonymousObject {
	public static void main(String[] args) {

		new Test();				// Anonymous Object

		new Test().display();	// Anonymous Object
	}
}


/*
OUTPUT: Object created
		Object created
		Display Test
*/