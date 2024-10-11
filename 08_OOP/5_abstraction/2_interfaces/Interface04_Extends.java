// class -to- class -> extends
// class -to- interface -> implements
// interface -to- interface -> extends


interface A {
	
	void show();
}

interface B extends A {
	
	void display();
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