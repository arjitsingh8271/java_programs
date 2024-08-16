import java.util.*;

class array_1d_QN_remove_an_element_in_array
{
	public static void remove(int a[], int elmt)
	{
		int pos=0;
		for(int i=0; i<a.length; i++)		// finding position
		{
			if(a[i] == elmt)
			{
				pos = i;
				break;
			}
		}
		
		for(int i=pos; i<(a.length-1); i++)	// removing element
		{
			a[i] = a[i+1];
		}

		for(int i=0; i<(a.length-1); i++)	// printing array
		{
			System.out.print(a[i] + " ");	
		}
	}
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		int arr[] = {1, 2, 3, 4};
		int rm_elmt = s.nextInt();

		remove(arr, rm_elmt);
		System.out.println();
	}
}




/*
OUTPUT: 3
		1 2 4

		4
		1 2 3 
*/