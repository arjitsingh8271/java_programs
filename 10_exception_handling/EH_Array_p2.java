class EH_Array_p2
{
	public static void main(String args[])
	{
		
			int[] arr1 = {1,2,3,4,5};
			int[] arr2 = new int[2];

			try
			{
				for (int i=0 ; i<5 ; i++)
				{	
					arr2[i] = arr1[i];
				}
			}

			catch (ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			
			for(int a : arr2)
			{
				System.out.println(a);
			}		
	}
}


/*
OUTPUT: 
	java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2                           
	1                                               
	2
*/
