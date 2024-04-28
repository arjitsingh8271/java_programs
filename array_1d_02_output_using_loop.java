class array_1d_02_output_using_loop
{
	public static void main (String args[])
	{
		int arr[] = {1,2,3};

		for(int i=0; i<arr.length; i++)		//arr.length for the length of array
		{
			System.out.println(arr[i]);
		}

		
		String name[] = {"Arjit", "Ram", "Rahul"};		// String type array
		for(int i=0; i<name.length; i++)		
		{
			System.out.println(name[i]);
		}
	}
}




/*
OUTPUT: 1
		2
		3
		Arjit
		Ram
		Rahul
*/