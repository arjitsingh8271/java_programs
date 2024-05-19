/*
A constructor in Java is similar to a method that is 
invoked when an object of the class is created.

A constructor has the same name as that of the 
class and does not have any return type

If a class doesn't have a constructor, the Java compiler 
automatically creates a default constructor during run-time.

A constructor cannot be abstract or static or final.

A constructor can be overloaded but can not be overridden.


Types of Constructor:

1. No-Arg Constructor - If a constructor does not accept any 
parameters, it is known as a no-argument constructor.

2. Parameterized Constructor - A Java constructor can also accept 
one or more parameters. Such constructors are known as parameterized 
constructors (constructors with parameters).

3. Default Constructor - If we do not create any constructor, 
the Java compiler automatically creates a no-arg constructor 
during the execution of the program.


*/

class A
{
	static int a = 1;
	String str;
	
	A(){
		System.out.println("Constructor Called " + a++);
		str = "hello";
	}
}

class oops_1_04_constructor
{
	public static void main (String[] args)
	{
		A a = new A();		// Constructor Called 1
		A b = new A();		// Constructor Called 2
		A c = new A();		// Constructor Called 3

		System.out.println(a.str);	// hello
		System.out.println(b.str);	// hello
		System.out.println(c.str);	// hello
	}
}
