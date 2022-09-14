import java.util.*;

class Array_input_output_usign_loop
{
	public static void main (String args[])
	{
		Scanner s=new Scanner(System.in);

		System.out.println("Enter the number element you want to store: ");

		int n=s.nextInt();
		int a[]=new int[n];


		System.out.println("Enter the element to store in array: ");
		for(int i=0 ; i<n ; i++)
		{
			a[i]=s.nextInt();
		}
		
		System.out.println("The element store in array is: ");
		for(int i=0 ; i<a.length ; i++)
		{
			System.out.println(a[i]);
		}
		
	}
}