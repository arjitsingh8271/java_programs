import java.lang.*;

class _01_print_message
{
	public static void main(String[] args)
	{
		System.out.println("Hello World");	// System: is a class
											// out: is object of System class
											// println(): is a method or function that print message then move to next line
	}
}



/*
Linux:	$ javac file_name.java 			--> 1st it check error then generate bit code
		  file_name.class				-->  	it is compiled and error free bit code file
		$ java file_name				--> 2nd it convert bit code into machaine code and it execute the program

Windows:	C:\> javac file_name.javac	-->   ,,							,,
			C:\> java file_name


OUTPUT: Hello World
*/

// $ javap java.lang.System		to check content of class