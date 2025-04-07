/* 
Relational (Comparison) Operators (==, !=, >, <, >=, <=)
it returns True or False
*/

class operators_2_relational
{
	public static void main(String[] args)
	{
		int a=5,b=6;

		System.out.println("a == b is: " +(a==b));    // Equal to
		System.out.println("a != b is: " +(a!=b));    // Not equal
		System.out.println("a < b is: " +(a<b));      // Less than
		System.out.println("a > b is: " +(a>b));      // Greater than
		System.out.println("a <= b is: " +(a<=b));    // Less than equal to
		System.out.println("a >= b is: " +(a>=b));    // Greater than equal to

	}
}



/*
OUTPUT:	a == b is: false
		a != b is: true
		a < b is: true
		a > b is: false
		a <= b is: true
		a >= b is: false
*/