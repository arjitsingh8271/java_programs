/*
Access modifiers are used to set the accessibility 
(visibility) of classes, interfaces, variables, 
methods, constructors, data members, and the setter methods.


Access 		within 	within 		outside package 	outside 
modifiers	class 	package		by subclass only	package
-----------------------------------------------------------
Private		Y			N			N					N
Default		Y			Y			N					N
Protected	Y			Y			Y					N
Public		Y			Y			Y					Y

*/

class A
{
	int num1 = 1;
	public int num2 = 2;
	private int num3 = 3;
}

class oops_1_09_access_modifiers
{
	public static void main (String args[])
	{
		A a = new A();
		
		System.out.println(a.num1);		// 1
		System.out.println(a.num2);		// 2
		//System.out.println(a.num3);	// error: num3 has private access in A

		// To access private fields go to 'oops_1_10_2_setter_and_getter_methods'
	}
}