class Parent	// also known as Super Class
{
	int num = 5;

	void Display()
	{
		System.out.println("I'm Parent Class");
	}
}

class Child extends Parent	// also known as Sub Class
{
	String str = "Hello";

	void Print()
	{
		System.out.println("I'm Child Class");
	}
}

class Inheritance01
{
	public static void main (String[] args)
	{
		Child c1 = new Child();

		System.out.println(c1.str);		// Hello
		c1.Print();						// I'm Child Class

		System.out.println(c1.num);		// 5
		c1.Display();					// I'm Parent Class

		c1.num = 10;
		System.out.println(c1.num);		// 10


		Parent p1 = new Parent();

		System.out.println(p1.num);		// 5
		p1.Display();					// I'm Parent Class

		// Parent Class can't call Child Class field & methods. 
		
		// System.out.println(p1.str);	// error: cannot find symbol
		// p1.Print();					// error: cannot find symbol
	}
}