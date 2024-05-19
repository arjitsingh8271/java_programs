import java.util.*;

class array_1d_QN_remove_an_element_by_its_position
{
	public static void remove(int a[], int p)
	{
		for(int i=p-1; i<(a.length-1); i++)	// removing element
		{
			a[i] = a[i+1];
		}

		for(int i=0; i<(a.length-1); i++)	// printing array
			System.out.print(a[i] + " ");

	}

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int arr[] = {4, 2, 3, 1, 5};
		int pos = s.nextInt();

		remove(arr, pos);
		System.out.println();
	}
}




/*
OUTPUT: 2
		4 3 1 5

		5
		4 2 3 1
*/