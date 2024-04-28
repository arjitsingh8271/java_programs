/*
Pairs
ARRAY:	{1, 2, 3, 4 ,5}
OUTPUT:	(1,2) (1,3) (1,4) (1,5)
		(2,3) (2,4) (2,5)
		(3,4) (3,5)
		(4,5)
*/

import java.util.*;

class array_1d_QN_pairs_in_an_array
{
	public static void print_pairs(int a[])
	{
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
				System.out.print("(" + a [i] + "," + a[j] + ")");
			System.out.println();
		}
	}

	public static void main(String args[])
	{
		int arr[] = {2, 4, 6, 8, 10};
		print_pairs(arr);
	}
}




/*
OUTPUT: (2,4)(2,6)(2,8)(2,10)
		(4,6)(4,8)(4,10)
		(6,8)(6,10)
		(8,10)
*/