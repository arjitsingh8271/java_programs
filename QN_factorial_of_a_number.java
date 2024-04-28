import java.util.*;

class QN_factorial_of_a_number
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), fact=1;

		for (int i = n ; i >= 1 ; i-- ) 
		{
			fact *= i;	
		}

		System.out.println(fact);
	}
}