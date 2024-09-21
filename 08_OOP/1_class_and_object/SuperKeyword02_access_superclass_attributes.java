class superClass
{
	String str = "Super Class";
}

class subClass extends superClass
{
	String str = "Sub Class";

	void printType()
	{
		System.out.println(str);
		System.out.println(super.str);
	}
}


class SuperKeyword02_access_superclass_attributes
{
	public static void main (String[] args)
	{
		subClass b1 = new subClass();
		
		b1.printType();		// Sub Class
							// Super Class
	}
}