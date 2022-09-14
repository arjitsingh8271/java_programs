class Increment_and_Decrement_Operators
{
	public static void main (String args[])
	{
		int x=5,y;
		y=x++;  // post++
				// 1st y=x i.e y=5 
		        // then x is increment i.e x=6
		System.out.println("  x:" +x +" " +"y:"+ y);

		y=++x; 	// ++pre
				// 1st x is increment i.e x=7 
				// then y=x i.e y=7
		System.out.println("  x:" +x +" " +"y:"+ y);


		// int a=2,b=4,c=5,d;
		// d = a * b++ + c;
		// System.out.println("d = " +d +" " +"b = " +b);

		// d = a * ++b + c;
		// System.out.println("d = " +d +" " +"b = " +b);

		//           post++           ++pre
		// Ex:       a=2,b=4,c=5      a=2,b=4,c=5
		// step 1:   a * b++ + c      a * ++b +bc  
		// step 2:   2 * 4 + 5        2 * 5 + 5   (b = 5)   
		// step 3:   13               10 + 5
		// step 4:   (b = 5)          15

//Note: only 1 data type we cannot perform incre.. drece.. that is boolen
	
	}
}