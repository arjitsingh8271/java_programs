/*
The super Method in Java is used in subclasses to access / execute 
superclass members (attributes, constructors and methods).

Using 'super()' we can access the method of 
the superClass after overriding in subClass.
*/

class A
{
	void Display()
	{
		System.out.println("A Class");
	}
}

class B extends A
{
	// Overriding
	void Display()
	{
		System.out.println("B Class");
	}

	void Print()
	{
		Display();			// calls overriding method
		super.Display();	// calls overridden method
	}
}

class SuperMethod01_call_superclass_method
{
	public static void main (String[] args)
	{
		B obj = new B();
		
		obj.Print();	// B Class
						// A Class
	}
}