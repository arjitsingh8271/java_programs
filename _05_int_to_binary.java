import java.lang.*;

class _05_int_to_binary
{
	public static void main(String[] args)
	{
		int a = 11;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toHexString(a));
		System.out.println(Integer.toOctalString(a));
	}
}


/*
OUTPUT:	1011
		b
		13

$ javap java.lang.Integer
*/