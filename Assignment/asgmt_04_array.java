/*
Write a Java program to perform the following operations on an array:
Find the maximum and minimum elements.
Calculate the sum and average of the elements.
Reverse the array.
*/

class asgmt_04_array
{
	public static void main (String[] args)
	{
		int ar[] = {1,2,3,4,5};
		int max = ar[1];
		int min = ar[1];
		int sum=0;
		int avg;
		int temp;

		
		// Max element
		for(int i=0 ; i<ar.length; i++)
		{
			if (ar[i] > max)
				max = ar[i];
		}
		System.out.println("Max ele: " + max);


		// Min element
		for(int i=0 ; i<ar.length; i++)
		{
			if (ar[i] < min)
				min = ar[i];

			sum = sum + ar[i];
		}
		System.out.println("Min ele: " + min);
		System.out.println("Sum of ele: " + sum);

		avg = sum / 5;
		System.out.println("Avg of ele: " + avg);


		// Orignal Array
		for(int a : ar)
		{
			System.out.print(a + " ");
		}
		System.out.println();


		// Reverese Array
		for(int i=0 ; i<(ar.length / 2) ; i++)
		{
			temp = ar[i];
			ar[i] = ar[ar.length-1-i];
			ar[ar.length-1-i] = temp;
		}

		for(int a : ar)
		{
			System.out.print(a + " ");
		}
		System.out.println();


	}
}


/*
OUTPUT: Max ele: 5
		Min ele: 1
		Sum of ele: 15
		Avg of ele: 3
		1 2 3 4 5 
		5 4 3 2 1
*/ 