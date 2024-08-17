/*
Nested Inner classess are dependent on the Outer class
and they are not accessible directly outside without the
object of Outer class.
But the object of StaticInner Class can be directly created
out side the Outer class without creating the object of Outer class.

*/


class Outer {
	
	static int x = 10;
	int y = 20;

	static class Inner {

		void displayInner() {
			System.out.println(x);
			//System.out.println(y); // can't access non-static member
		}	
	}
}


class _04_StaticInnerClass {
	
	public static void main(String[] args) {

		Outer.Inner i = new Outer.Inner();
		i.displayInner();
	}
}