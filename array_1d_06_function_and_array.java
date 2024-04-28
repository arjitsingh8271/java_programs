import java.util.*;

class array_1d_06_function_and_array
{
	public static void print(int arr[])
	{
		for(int i=0 ; i<arr.length ; i++)
			System.out.println(arr[i]);
	}
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5};
		print(arr);
	}
}




/*
OUTPUT: 1
		2
		3
		4
		5
*/