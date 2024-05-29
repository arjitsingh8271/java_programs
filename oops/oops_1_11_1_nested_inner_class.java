/*
A class created within the class and outside the method 
is known as Nested Inner Class in Java. 
It can access the private instance variable of the outer class.
*/


class outer
{
	class inner
	{
		void display(){
			System.out.println("Inner Class 'B'");
		}
	}

	void display(){
			System.out.println("Outer Class 'A'");
	}
}


class oops_1_11_1_nested_inner_class
{
	public static void main (String[] args)
	{
		outer a = new outer();
		a.display();	// Outer Class 'A'

		outer.inner b = new outer().new inner();
		b.display();	// Inner Class 'B'
	}
}