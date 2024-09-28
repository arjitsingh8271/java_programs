/*
In util packege we get Scanner class
In Scanner class we get methods like:
		nextInt()			read integer
		nextFloat()			read float
		nextDouble()		read double
		
		next()				read one word
		nextLine()			read multiple words
		next().charAt(0)	read 1 character

		nextByte()
		nextShort()
		nextLong()
		nextBoolean()

		hasNextInt()		read is a int? value and return true or false
		hasNextFloat()		read is a float? value and return true or false
*/

import java.lang.*;
import java.util.*;

class _04_input_from_keyboard
{
	public static void main(String[] args)
	{
		int age;
		String name;
		
		System.out.println("Enter Name and Age: ");
		
		Scanner s = new Scanner(System.in);	// Scanner is a class
											// s is a reference
											// Scanner() is a constructor
		
		name = s.nextLine();
		age = s.nextInt();

		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}



/*
OUTPUT: Enter Name and Age: 
		Arjit kumar Singh            
		20
		Name: Arjit kumar Singh
		Age: 20
*/