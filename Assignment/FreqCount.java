import java.util.*;

class FreqCount
{
	public static void main (String args[])

	{
		Scanner s=new Scanner(System.in);

		System.out.println("Enter the number of element you want to store: ");

		int n=s.nextInt();
		int arr[]=new int[n];


		System.out.println("Enter the numbers to check there frequency: ");
		for(int i=0 ; i<n ; i++)
		{
			arr[i]=s.nextInt();
		}

		int [] fr = new int [arr.length];  
        int visited = -1;  
            
        for(int i = 0; i < arr.length; i++)
        {  
            int count = 1;  
        
            for(int j = i+1; j < arr.length; j++)
            { 
        	   if(arr[i] == arr[j])
        	   {  
            	   count++;  
                    fr[j] = visited;  
                }  
            }
                if(fr[i] != visited)
                {
            	   fr[i] = count;
                }  
              
        }
            System.out.println("Element: ");

            for(int i = 0; i < fr.length; i++)
            {  
                if(fr[i] != visited)
                {
                    System.out.print(" " + arr[i]); 
                } 
                     
            }

            System.out.println();

            System.out.println("Frequency: ");
            for(int i = 0; i < fr.length; i++)
            {  
                if(fr[i] != visited)
                {
                    System.out.print(" " + fr[i]);
                }  
                      
            }

            System.out.println();
		
	}
}