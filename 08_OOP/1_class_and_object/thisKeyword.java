/*
The this keyword refers to the current object in a 
method or constructor. 
The most common use of the this keyword is to eliminate
the confusion between class attributes and parameters
with the same name (because a class attribute is 
shadowed by a method or constructor parameter).
*/

class A
{
	int num;

	A(int num){
		this.num = num;
		System.out.println(num);	// 55
		System.out.println(this);	// A@3764951d

	}
}

class thisKeyword
{
	public static void main(String[] args)
	{
		A a = new A(55);
		System.out.println(a);	// A@3764951d

	}
}