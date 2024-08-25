/*
static keyword in Java. If we want to access class 
members without creating an instance/object of the class, 
we need to declare the class members static.
*/

class A
{
	public static int sNum = 1;

	int num;

	public static void display()
	{
		System.out.println("display method called");
	}
}

class oops_1_06_static_keyword_in_class
{
	public static void main (String[] args)
	{
		System.out.println(A.sNum);		// 1
		A.display();					// display method called

		A.sNum = 2;
		System.out.println(A.sNum);		// 2

		System.out.println("------------------");
		
		A a = new A();
		a.num = 10;
		a.sNum = 3;
		System.out.println(a.num);		// 10 	created a new memory
		System.out.println(a.sNum);		// 3	share the same memory location

		A b = new A();
		System.out.println(b.num);		// 0 	created a new memory
		System.out.println(b.sNum);		// 3 	share the same memory location




	}
}