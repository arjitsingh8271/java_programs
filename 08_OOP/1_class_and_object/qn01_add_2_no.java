class A
{
	int addNum(int a, int b)
	{
		return a+b;
	}
}

class qn01_add_2_no
{
	public static void main (String[] args)
	{
		A a = new A();
		System.out.println(a.addNum(2, 5));		// 7
	}
}