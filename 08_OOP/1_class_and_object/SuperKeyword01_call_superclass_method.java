/*
The super keyword in Java is used in subclasses to 
access superclass members (attributes, constructors and methods).

Using 'super' keyword we can access the method of 
the superClass after overriding in subClass.
*/

class superClass
{
	void Display()
	{
		System.out.println("Super Class");
	}
}

class subClass extends superClass
{
	// Overriding
	void Display()
	{
		System.out.println("Sub Class");
	}

	void Print()
	{
		Display();			// calls overriding method
		super.Display();	// calls overridden method
	}
}

class SuperKeyword01_call_superclass_method
{
	public static void main (String[] args)
	{
		subClass b1 = new subClass();
		
		b1.Print();		// Sub Class
						// Super Class
	}
}