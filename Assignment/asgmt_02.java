/*
Develop a program to demonstrate constructor overloading 
by creating multiple constructors for a class.
*/

class asgmt_02
{
	private String name;
	private int age;

	// Constructor with no parameters (default constructor)
	asgmt_02()
	{
		name = "Null";
		age = 0;
	}

	// Constructor with name parameter
	asgmt_02(String name)
	{
		this.name = name;
		age = 0;
	}

	// Constructor with both name and age parameters
	asgmt_02(String name, int age)
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
		asgmt_02 p1 = new asgmt_02();
		asgmt_02 p2 = new asgmt_02("Rahul");
		asgmt_02 p3 = new asgmt_02("Aman", 19);

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