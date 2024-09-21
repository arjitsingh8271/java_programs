class superClass
{
	superClass(){
		System.out.println("Super Class Constructor");
	}
}

class subClass extends superClass
{
	subClass(){
		super();	// calling default constructor of the superclass

		System.out.println("Sub Class Constructor");
	}
}


class SuperKeyword03_access_superclass_no_arg_constructor
{
	public static void main (String[] args)
	{
		subClass b1 = new subClass();	// Super Class Constructor
										// Sub Class Constructor
	}
}