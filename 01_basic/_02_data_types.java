/*
Data Types in Java:
	
	Primitive:
		integral:
			byte, short, int, long
		Floating Point:
			float, double
		char
		boolen

	Non-Primitive:
		String
		Array
		etc

*/

import java.lang.*;

class _02_data_types
{
	public static void main(String[] args)
	{
		byte a = 1;			// Size: 1 byte
		short b = 3;		// 2 bytes
		int c = 3;			// 4 bytes
		long d = 124l;		// 8 bytes
		System.out.println("byte a: " + a);
		System.out.println("short b: " + b);
		System.out.println("int c: " + c);
		System.out.println("long d: " + d);


		float e = 2.3f;		// 4 bytes
		double f = 4.3d;	// 8 bytes
		System.out.println("float e: " + e);
		System.out.println("double f: " + f);

		char g = 'A';		// 2 bytes
		System.out.println("char g: " + g);

		String h = "Hello";
		System.out.println("string h: " + h);
		
		boolean i = false;
		System.out.println("boolean i: " + i);

	}
}



/*
OUTPUT:	byte a: 1
		short b: 3
		int c: 3
		long d: 124
		float e: 2.3
		double f: 4.3
		char g: A
		string h: Hello
		boolean i: false
*/