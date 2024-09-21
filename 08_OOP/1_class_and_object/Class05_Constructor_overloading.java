class A
{
	A(int a, int b){
		System.out.println(a+b);
	}

	A(int a, int b, int c){
		System.out.println(a+b+c);
	}

	A(double a, double b){
		System.out.println(String.format("%.2f", a+b));
	}
}

class Class05_Constructor_overloading
{
	public static void main (String[] args)
	{
		A a = new A(1,2);		// 3
		A b = new A(1,2,3);		// 6
		A c = new A(1.1,2.2);	// 3.30
	}
}