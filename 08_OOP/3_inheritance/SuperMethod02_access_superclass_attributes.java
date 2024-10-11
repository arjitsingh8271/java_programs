class A
{
	String str = "A Class";
}

class B extends A
{
	String str = "B Class";

	void printType()
	{
		System.out.println(str);
		System.out.println(super.str);
	}
}


class SuperMethod02_access_superclass_attributes
{
	public static void main (String[] args)
	{
		B obj = new B();
		
		obj.printType();	// B Class
							// A Class
	}
}