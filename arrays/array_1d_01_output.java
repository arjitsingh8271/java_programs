import java.util.*;

class array_1d_01_output
{
	public static void main (String[] args)
	{
					// declare an array
		int a[] = new int[2]; 
					// initialize array
		a[0]=10;			
		a[1]=20;
					// print elements of an array
		System.out.println("a[0]: " + a[0]);
		System.out.println("a[1]: " + a[1]);


					// declere & initilize
		int arr[] = {1,2};
		System.out.println("arr[0]: " + arr[0]);
		System.out.println("arr[1]: " + arr[1]);

					// size of an array
		System.out.println("size of a: " + a.length);
		System.out.println("size of arr: " + arr.length);
	}
}




/*
OUTPUT: a[0]: 10
		a[1]: 20
		arr[0]: 1
		arr[1]: 2
		size of a: 2
		size of arr: 2
*/