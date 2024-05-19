/*
Develop a program to demonstrate constructor overloading 
by creating multiple constructors for a class.
*/

class asgmt_2
{
	private String name;
	private int age;

	// Constructor with no parameters (default constructor)
	asgmt_2()
	{
		name = "Null";
		age = 0;
	}

	// Constructor with name parameter
	asgmt_2(String name)
	{
		this.name = name;
		age = 0;
	}

	// Constructor with both name and age parameters
	asgmt_2(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	// Method to display person details
	void display()
	{
		System.out.println("Name: " + name);		
		System.out.println("Age: " + age);
	}


	public static void main(String[] args)
	{
		asgmt_2 p1 = new asgmt_2();
		asgmt_2 p2 = new asgmt_2("Rahul");
		asgmt_2 p3 = new asgmt_2("Aman", 19);

		p1.display();
		p2.display();
		p3.display();
	}
}


/*
OUTPUT: Name: Null                                                                  
		Age: 0                                                                      
		Name: Rahul                         
		Age: 0                                                                      
		Name: Aman                                                                  
		Age: 19 
*/