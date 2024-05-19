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


class oops_2_04_final_keyword
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