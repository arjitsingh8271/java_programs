import java.util.*;

class QN_count_digits
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt(), count=0;		
		
		while(num > 0)
		{
			num = num / 10;
			count++; 
		}

		System.out.println(count);
	}
}



/*
OUTPUT: 1234
		4
*/