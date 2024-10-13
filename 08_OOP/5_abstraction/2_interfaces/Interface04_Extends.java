// class -to- class -> extends
// class -to- interface -> implements
// interface -to- interface -> extends


interface A {
	void show();
	void display();
}

interface B extends A {
	
}

class C implements B {
	
	public void show() {
		System.out.println("Showing..");
	}

	public void display() {
		System.out.println("Displaying..");
	}
}


class Interface04_Extends {
	public static void main(String[] args) {
		C c = new C();
		c.show();		// Showing..
		c.display();	// Displaying..
	}
}