class A
{
	A(){
		System.out.println("A Class Constructor");
	}
}

class B extends A
{
	B(){
		super();	// calling default constructor of the superclass

		System.out.println("B Class Constructor");
	}
}


class SuperMethod03_access_superclass_no_arg_constructor
{
	public static void main (String[] args)
	{
		B obj = new B();	// A Class Constructor
							// B Class Constructor
	}
}