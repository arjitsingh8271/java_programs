/*
In Java, the final keyword is used to denote constants. 
It can be used with variables, methods, and classes.

Once any entity (variable, method or class) is declared 
final, it can be assigned only once. That is,

the final variable cannot be reinitialized with another value
the final method cannot be overridden
the final class cannot be extended
*/


class A
{
	final int num = 1;
	String str = "A";

	final void display(){
		System.out.println("Super Class");
	}
}

class B extends A
{
	// error: overridden method is final
	// void display(){
	// 	System.out.println("Base Class");
	// }

	void Print(){
		System.out.println("Base Class");
	}
}


class FinalKeyword
{
	public static void main (String[] args)
	{
		B b = new B();
		b.Print();					// Base Class
		System.out.println(b.str);	// A
		b.str = "B";
		System.out.println(b.str);	// B
	
		System.out.println(b.num);	// 1	accessing is possible but can't change value
		b.display();				// Super Class 	accessing is possible but can't override

		//b.num = 2;	// error: cannot assign a value to final variable num
	}
}

// we can also create a final class, but that class can't be extended.