import java.util.*;

class array_1d_QN_linear_search
{
	public static int linear_search(int a[], int key)
	{
		for(int i=0; i<a.length ; i++)
		{
			if(a[i] == key)
			{
				System.out.println("Key found at " + i);
				return 0;
			}
		}
		System.out.println("Key not found");
		
		return 0;
	}

	public static void main(String[] args)
	{
		int arr[] = {10, 33, 3, 2, 5, 16};
		int key = 5;

		linear_search(arr, key);
	}
}