import java.util.*;

class function_QN_palindrone_number
{
	static Boolean isPalindrome(int x)
	{
		int rev=0, l_dig=0, temp=x;
		while(temp>0)
		{
			l_dig = temp % 10;
			rev = (rev * 10) + l_dig;
			temp = temp / 10;
		}

		return (x==rev);

	}

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println(isPalindrome(a));

	}
}



/*
OUTPUT: 121
		true

OUTPUT: 231
		false
*/