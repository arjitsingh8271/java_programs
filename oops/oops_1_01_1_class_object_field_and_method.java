/*
Java Class
A class is a blueprint for the object. Before we 
create an object, we first need to define the class.

We can think of the class as a sketch (prototype) of a house. 
It contains all the details about the floors, doors, windows, 
etc. Based on these descriptions we build the house. House is 
the object.

Since many houses can be made from the same description, we 
can create many objects from a class.


Here, fields (variables) and methods represent the state and 
behavior of the object respectively.

1. fields are used to store data
2. methods are used to perform some operations
*/

// -------------------------------------------------------

class A
{
	int num = 5;
	
	void display()				// class method
	{
		System.out.println("Class A");
	}
}

class oops_1_01_1_class_object_field_and_method
{
	public static void main (String args[])
	{
		A aa = new A();			// aa is a object of 'A' class
		
		System.out.println(aa.num);		// print class variable value
										// 5
		aa.display();					// calling method turnOn()
										// Class A

	}
}

