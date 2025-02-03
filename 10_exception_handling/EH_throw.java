/*
Definition: Used to explicitly throw an exception in a method or block.
It is used for creating customized or user define exception.
Purpose: Generates an exception manually.

throw (Explicitly Throwing an Exception)
● The throw keyword is used to manually throw an exception in Java.
● It is followed by an exception object.
● It is used inside a method or block.

it does'nt handle the exception, if we want to handle customized exception
then we need try-catch block. 
*/

class EH_throw {
	static int area(int l, int b) {
		if (l<0 || b<0) {
			throw new IllegalArgumentException ("Length & Breadth must be +ve");
			// throw new RuntimeException ("Length & Breadth must be +ve");
		}
		int res = l*b;
		System.out.println("area()");
		return res;
	}

	public static void main(String[] args) {
		int result = area(10,-5);
		System.out.println(result);
		System.out.println("main()");
	}
}

/*
Exception in thread "main" java.lang.IllegalArgumentException: Length & Breadth must be +ve
        at EH_throw.area(EH_throw.java:4)
        at EH_throw.main(EH_throw.java:13)
*/

// if we want to handle the exception then we have to use try-catch