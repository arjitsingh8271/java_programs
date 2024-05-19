/*
Logical Operators
it return True or False
*/

class operators_3_logical
{
	public static void main(String[] args)
	{
		int a=4,b=5;

		System.out.println("(a==b) && (a<b) is: " +((a==b) && (a<b)));  // And
		System.out.println("(a==b) || (a<b) is: " +((a==b) || (a<b)));  // Or
		System.out.println("! (a==b) is: " +(!(a==b)));					// Not
	}
}



/*
OUTPUT: (a==b) && (a<b) is: false
		(a==b) || (a<b) is: true
		! (a==b) is: true
*/