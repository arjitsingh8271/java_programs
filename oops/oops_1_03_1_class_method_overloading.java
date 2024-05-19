/*
Method Overloading:
 
Two or more methods may have the same name if they 
differ in parameters (different number of parameters, 
different types of parameters, or both). These methods 
are called overloaded methods and this feature is called 
method overloading. 

For example:

void func() { ... }
void func(int a) { ... }
float func(double a) { ... }
float func(int a, float b) { ... }
*/


class A
{
	int addNum(int a, int b){
		return a+b;
	}

	int addNum(int a, int b, int c){
		return a+b+c;
	}
}

class oops_1_03_1_class_method_overloading
{
	public static void main (String args[])
	{
		A a = new A();
		System.out.println(a.addNum(1,2));		// 3
		System.out.println(a.addNum(1,2,3));	// 6
	}
}