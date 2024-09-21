/*
The instanceof operator in Java is used to 
check whether an object is an instance of a 
particular class or not.
*/

class A{
}

class B extends A{
}


class Inheritance02_instanceof_Operator
{
	public static void main (String[] args)
	{
		B b = new B();
		System.out.println(b instanceof A);		// true
		System.out.println(b instanceof B);		// true

		A a = new A();
		System.out.println(a instanceof B);		// false
		System.out.println(a instanceof A);		// true


		String num = "ABC";
		boolean rst = num instanceof String;
		System.out.println(rst);				// true
	}
}