class A
{
	A(String str){
		System.out.println(str + ": Parameterized Constructor");
	}
}

class B extends A
{
	B(){
		super("A Class");	// calling Parameterized constructor of the superclass

		System.out.println("B Class Constructor");
	}
}


class SuperMethod04_access_superclass_parameterized_constructor
{
	public static void main (String[] args)
	{
		B obj = new B();	// A Class: Parameterized Constructor
							// B Class Constructor
	}
}