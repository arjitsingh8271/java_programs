/*
Inheritance:
------------
Inheritance allows us to create a new class from an 
existing class.

The new class that is created is known as subclass 
(child or derived class) and the existing class from 
where the child class is derived is known as superclass 
(parent or base class).

The 'extends' keyword is used to perform inheritance in Java.

is-a relationship:
------------------
In Java, inheritance is an is-a relationship. That is, we use 
inheritance only if there exists an is-a relationship between 
two classes. For example,

Car is a Vehicle
Orange is a Fruit
Surgeon is a Doctor
Dog is an Animal

Here, Car can inherit from Vehicle, Orange can inherit from Fruit, and so on.
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

	void Print()
	{
		System.out.println("Sub Class");
	}
}

class oops_2_01_inheritance
{
	public static void main (String[] args)
	{
		subClass b1 = new subClass();

		System.out.println(b1.str);		// Hello
		b1.Print();						// Sub Class

		System.out.println(b1.num);		// 5
		b1.Display();					// Super Class

		b1.num = 10;
		System.out.println(b1.num);		// 10


		superClass s1 = new superClass();

		System.out.println(s1.num);		// 5
		s1.Display();					// Super Class

		// super class can't called sub class field & methods. 
		// System.out.println(s1.str);	// error: cannot find symbol
		// s1.Print();					// error: cannot find symbol
	}
}