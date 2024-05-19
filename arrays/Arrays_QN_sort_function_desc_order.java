//import java.util.Arrays;
import java.util.*;

class Arrays_QN_sort_function_desc_order
{
	public static void main(String args[])
	{
		int arr[] = {3, 5, 1, 4, 2};

		for(int a : arr)
			System.out.print(" " + a);
		System.out.println();

		Arrays.sort(arr, Collections.reverseOrder());

		System.out.println(Arrays.toString(arr));
	}
}




/*
OUTPUT:  3 5 1 4 2
		 1 2 3 4 5
*/ 