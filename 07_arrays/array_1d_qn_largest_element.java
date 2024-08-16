import java.util.*;

class array_1d_qn_largest_element
{
	public static int l_elmt(int a[])
	{
		int max = Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++)
		{
			if(max < a[i])
				max = a[i];
		}

		return max;
	}

	public static void main(String[] args)
	{
		int arr[] = {5, 2, 3, 4, 1};
		System.out.println(l_elmt(arr));
	}
}




// OUTPUT: 5