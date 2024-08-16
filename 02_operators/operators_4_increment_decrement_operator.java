

class operators_4_increment_decrement_operator
{
	public static void main(String[] args)
	{
		int a=4;

		System.out.println("a is: " +a);
		System.out.println("a++ is: " +(a++));   // Postfix increment operator
		System.out.println("a is: " +a);
		System.out.println("a-- is: " +(a--));   // Postfix decrement operator
		System.out.println("a is: " +a);
		System.out.println("++a is: " +(++a));   // Prefix increment operator
		System.out.println("a is: " +a);
		System.out.println("--a is: " +(--a));  // Prefix decrement operator
		System.out.println("a is: " +a);

	}
}



/*
OUTPUT: a is: 4
		a++ is: 4
		a is: 5
		a-- is: 5
		a is: 4
		++a is: 5
		a is: 5
		--a is: 4
		a is: 4
*/