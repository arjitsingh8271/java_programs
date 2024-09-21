/*
static keyword in Java. If we want to access class 
members without creating an instance/object of the class, 
we need to declare the class members static.
*/

class A
{
	public static int num = 2;

	public static void display()
	{
		System.out.println("display method called");
	}
}

class StaticKeyword01_in_class
{
	public static void main (String[] args)
	{
		System.out.println(A.num);	// 2
		A.display();				// display method called

		A.num = 5;
		System.out.println(A.num);	// 5

	}
}