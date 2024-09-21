
class Class00
{
	int num = 5;
	
	void display()
	{
		System.out.println("Hello");
	}

	public static void main(String[] args)
	{
		oops_1_object_inside_same_class a = new oops_1_object_inside_same_class();

		System.out.println(a.num);	// 5
		a.display();				// Hello
	}
}



// static - If we use the static keyword, 
// it can be accessed without creating objects.

/* 
class Class00
{
	public static int num = 5;
	
	public static void display()
	{
		System.out.println("Hello");
	}

	public static void main(String[] args)
	{	
		System.out.println(num);	// 5
		display();					// Hello
	}
}
*/