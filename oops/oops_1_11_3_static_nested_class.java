/*
Static nested classes are not technically inner classes. 
They are like static members of the outer class.
*/


class outer
{
	static class inner
	{
		void display(){
			System.out.println("Inner Class 'B'");
		}
	}

	void display(){
			System.out.println("Outer Class 'A'");
	}
}


class oops_1_11_3_static_nested_class
{
	public static void main (String[] args)
	{
		outer a = new outer();
		a.display();	// Outer Class 'A'

		outer.inner b = new outer.inner();
		b.display();	// Inner Class 'B'
	}
}