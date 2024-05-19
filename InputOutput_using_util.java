import java.util.*;

class InputOutput_using_util
{
	public static void main (String[] args)
	{
		Scanner      s=new       Scanner(System.in);
    //	class name  reference   constructor(for keyboard)
		int age;
		//int = data type, age = variable.
		String name;
		
		System.out.println("Enter name and age to display:");
		name=s.nextLine();
		age=s.nextInt();
		System.out.println("Name and Age is: " + name + age);

		System.out.println("Enter Binary no. to convert Decimal no.:");
		s.useRadix(2); // (2) means Binary Number
		int x=s.nextInt();
		System.out.println("Decimal no. is: " +x);
		
	}
}

/* Class Scanner:

	  Method           Description
	
	nextInt() 	    Reads a int value from the user
	nextFloat() 	Reads a float value from the user
	nextDouble() 	Reads a double value from the user
	next()			Read only one word value from the user
	nextLine() 	    Reads a String (Line) value from the user

	nextByte() 	    Reads a byte value from the user
	nextShort() 	Reads a short value from the user
	nextLong() 	    Reads a long value from the user
	nextBoolean() 	Reads a boolean value from the user

	hasNextInt()    To conferm the value is Int or not. Return (True/False)
	hasNextFloat()  To conferm the value is Float or not. Return (True/False)


*/