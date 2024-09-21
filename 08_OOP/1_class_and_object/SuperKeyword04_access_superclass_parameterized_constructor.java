class superClass
{
	superClass(String str){
		System.out.println(str + ": Parameterized Constructor");
	}
}

class subClass extends superClass
{
	subClass(){
		super("Super Class");	// calling Parameterized constructor of the superclass

		System.out.println("Sub Class Constructor");
	}
}


class SuperKeyword04_access_superclass_parameterized_constructor
{
	public static void main (String[] args)
	{
		subClass b1 = new subClass();	// Super Class: Parameterized Constructor
										// Sub Class Constructor
	}
}