import java.util.*;

class array_1d_qn_sum_of_all_element
{
	public static int sum(int a[])
	{
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			sum += a[i];
		}

		return sum;
	}

	public static void main(String[] args)
	{
		int arr[] = {5, 2, 3, 4, 1};
		System.out.println(sum(arr));
	}
}




// OUTPUT: 15