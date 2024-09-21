class EH_Array_p1
{
	public static void main(String args[])
	{
		
			int[] arr1 = {1,2,3,4,5};

			int[] arr2 = new int[2];

			int i=0;

			for (i=0 ; i<5 ; i++)
			{		
				arr2[i] = arr1[i];
			}
			
			for(int a : arr2)
			{
				System.out.println(a);
			}
		
		
	}
}


/*
OUTPUT:
	Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
	Index 2 out of bounds for length 2
		at d_3_5_24_p1.main(d_3_5_24_p1.java:14)
*/
