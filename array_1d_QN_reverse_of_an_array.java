/*
Logic for reverse of an array

l=0 , h=(size-1)
condition (l<h)
swap: temp = l; l = h; h = temp;
Input:	{1, 2, 3, 4}
 		 l        h 	l++, h--
		{4, 2, 3, 1}
    		l  h
Output:	{4, 3, 2, 1}

*/

import java.util.*;

class array_1d_QN_reverse_of_an_array
{
		// 1st logic
	public static void reverse_array_1(int a[])
	{
		int temp, left=0, right=(a.length-1);

		while(left<=right)
		{
			temp = a[left];
			a[left] = a[right];
			a[right] = temp;
			left++;
			right--;
		}

		for(int x : a)
			System.out.print(x + " ");

		// for(int i=0; i<a.length; i++)
		// 	System.out.print(a[i] + " ");
		
		System.out.println();
	}

		// 2nd logic
	public static void reverse_array_2(int a[])
	{
		for(int i=0, j=(a.length-1) ; i<(a.length/2); i++,j--)
		{
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}

		for(int x : a)
			System.out.print(x + " ");

		// for(int i=0; i<a.length; i++)
		// 	System.out.print(a[i] + " ");
		
		System.out.println();
	}
	
		// 3rd logic
	public static void reverse_array_3(int a[])
	{
		for(int i=0; i<a.length/2; i++)
		{
			int temp = a[i];
			a[i] = a[a.length-i-1];
			a[a.length-i-1] = temp;
		}

		for(int x : a)
			System.out.print(x + " ");

		// for(int i=0; i<a.length; i++)
		// 	System.out.print(a[i] + " ");
		
		System.out.println();
	}
	

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = s.nextInt();
		}

		//int arr[] = {1,2,3,4};

		reverse_array_1(arr);
		reverse_array_2(arr);
		reverse_array_3(arr);

	}
}




/*
INPUT:	4
		1 2 3 4
OUTPUT:	4 3 2 1 
		1 2 3 4
		4 3 2 1 
*/
