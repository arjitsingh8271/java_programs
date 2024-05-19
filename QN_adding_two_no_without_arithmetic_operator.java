import java.util.*;

class QN_adding_two_no_without_arithmetic_operator
{
	static int add(int a, int b)
	{
		for(int i=0; i<b; i++)
			a++;
		
		return a;
	}

	static int sub(int a, int b)
	{
		for(int i=0; i<a; i++)
			b--;
		
		return b;
	}

	public static void main(String[] args)
	{
		int a=11, b=5;

		System.out.println(add(a,b));
		System.out.println(sub(a,b));

	}
}