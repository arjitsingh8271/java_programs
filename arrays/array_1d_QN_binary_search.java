import java.util.*;

class array_1d_QN_binary_search
{
	public static int binary_search(int a[], int k)
	{
		int l=0, r=(a.length-1);

		while(l <= r)
		{
			int mid = (l+r)/2;

			if(k == a[mid])		// found
				return mid;
			if(k < a[mid])		// shift left
				r=mid-1;
			else 				// shift right
				l=mid+1;
		}

		return -1;
	}

	public static void main(String[] args)
	{
		int arr[] = {1, 2, 3, 4, 5};
		int key = 4;

		System.out.println(binary_search(arr, key));
	}
}





/*
		key=4;
OUTPUT: 3
		
		key=14;
OUTPUT: -1
*/