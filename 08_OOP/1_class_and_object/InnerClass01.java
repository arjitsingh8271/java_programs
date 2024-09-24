// Member of Inner Class.

class Outer {
	
	int x = 10;

	class Inner {

		int y = 20;

		void innerDisplay() {
			System.out.println(x);
		}
	}

	void outerDisplay() {

		Inner i = new Inner();
		i.innerDisplay();
		System.out.println(i.y);
	}
}

class InnerClass01 {
	
	public static void main(String[] args) {

		Outer o = new Outer();
		o.outerDisplay();
		//o.innerDisplay();		// error

		System.out.println();

		Outer.Inner oi = o.new Inner();
		oi.innerDisplay();
		//oi.outerDisplay();	// error

		System.out.println();

		Outer.Inner oi2 = new Outer().new Inner();
		oi2.innerDisplay();
		//oi2.outerDisplay();	// error
		
	}
}


/*
OUTPUT: 10
		20

		10

		10
*/


/*
Inner class can access the member of Outer class
But Outer class can't access the member of Inner class  
directly unless it has created an object of Inner class
*/
