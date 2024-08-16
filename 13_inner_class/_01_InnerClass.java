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

class _01_InnerClass {
	
	public static void main(String[] args) {

		Outer o = new Outer();
		o.outerDisplay();

		System.out.println();

		Outer.Inner oi = new Outer().new Inner();
		oi.innerDisplay();
		
	}
}

/*
Inner class can access the member of Outer class
But Outer class can't access the member of Inner class  
directly unless it has created an object of Inner class
*/