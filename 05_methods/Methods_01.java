/*
Methods are members of classes which provide functionality for classes.

A static main method can call only a Static methods.
that's why i write :- static int max(int a, int b)

*/



class Methods_01 {

	// Creating a static method which return type is Integer
	static int max(int a, int b) {
		if(a > b)
			return a;
		else 
			return b;
	}
	

	public static void main(String[] args) {
		
		int a=5, b=10, c;
		c = max(a,b);			// calling method max & storing its value in c.
		System.out.println(c);
	}
}