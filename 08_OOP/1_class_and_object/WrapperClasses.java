/*
wrapper classes are used to convert primitive data types (such as int, char, etc.) 
into objects.
Wrapper classes are used when an object reference is required, like when working with collections 
(e.g., ArrayList, HashMap), as collections only work with objects, not primitive data types.
Primitive datatypes cannot be null, but their wrapper classes can.

Primitive Type	Wrapper Class
--------------	-------------
int				Integer
char			Character
byte			Byte
short			Short
long			Long
float			Float
double			Double
boolean			Boolean



Autoboxing: Primitive datatype into Object

Autounboxing: Object into Primitive datatype

*/


class WrapperClasses {
	
	public static void main(String[] args) {

		int a1 = 1;			// Primitive Datatype
		Integer a2 = 1;		// Autoboxing: int to Integer
		int a3 = a2;		// Unboxing: Integer to int

		String str = "123";
		System.out.println(str.getClass());	// class java.lang.String
		Integer obj = Integer.valueOf(str);
		System.out.println(obj.getClass()); // class java.lang.Integer

		Integer a4 = 2;

		System.out.println(a2 == a4);		// false
		System.out.println(a2.equals(a4));	// false



		boolean isTrue = true;
		Boolean isFalse = false;

		float f1 = 1.22f;
		Float f2 = 1.22f;

		double d1 = 2.33;
		Double d2 = 2.33;

		char c1 = 'A';
		Character c2 = 'A';

		byte b1 = 2;
		Byte b2 = 2;

		short s1 = 1;
		Short s2 = 1;

		long l1 = 1223l;
		Long l2 = 1223l;
	}
}