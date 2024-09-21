/*
Method Overriding:
------------------
if the same method is defined in both the superclass and the 
subclass, then the method of the subclass class overrides the 
method of the superclass. This is known as method overriding.

Java Overriding Rules:
-----------------------
Both the superclass and the subclass must have the same method 
name, the same return type and the same parameter list.

We cannot override the method declared as final and static.

We should always override abstract methods of the superclass

*/


class superClass
{
	int num = 5;

	void Display()
	{
		System.out.println("Super Class");
	}
}

class subClass extends superClass
{
	String str = "Hello";

	// Overriding
	void Display()
	{
		System.out.println("Sub Class");
	}
}

class Inheritance03_Method_Overriding
{
	public static void main (String[] args)
	{
		subClass b1 = new subClass();

		System.out.println(b1.str);		// Hello
		b1.Display();					// Sub Class

		System.out.println(b1.num);		// 5
		b1.Display();					// Sub Class
		// if we want to access the method of the superclass after overriding
		// it is possible using super keyword goto 'oops_2_'

		superClass s1 = new superClass();

		System.out.println(s1.num);		// 5
		s1.Display();					// Super Class
	}
}