/*
Nested Inner classess are dependent on the Outer class
and they are not accessible directly outside without the
object of Outer class.
But the object of Static Inner Class can be directly created
out side the Outer class without creating the object of Outer class.

*/


class Outer {
	
	static int x = 10;
	int y = 20;

	static class Inner {

		void innerDisplay() {
			System.out.println(x);
			//System.out.println(y); // can't access non-static member
		}	
	}

	void outerDisplay() {

		Inner i = new Inner();
		i.innerDisplay();
		System.out.println(i.y);
	}
}


class InnerClass04_StaticInnerClass {
	
	public static void main(String[] args) {

		Outer.Inner i = new Outer.Inner();
		i.innerDisplay();
		i.outerDisplay();
	}
}
