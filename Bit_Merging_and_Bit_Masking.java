/*		  
          7 6 5 4 3 2 1 0   (1-byte = 8-bits)
	a=    0 0 0 0 0 0 0 0   (bit a=0)
	b=8   0 0 0 0 1 0 0 0
  a=a|b   0 0 0 0 1 0 0 0    (Merging a OR b)

	a=8   0 0 0 0 1 0 0 0
	b=64  0 1 0 0 0 0 0 0
  a=a|b   0 1 0 0 1 0 0 0    (Merging a OR b)

	a=72  0 1 0 0 1 0 0 0
	b=8   0 0 0 0 1 0 0 0
	a&b   0 0 0 0 1 0 0 0   
	(i.e 1>0 bit 3 is on inside a) (Masking a AND b)

	a=72  0 1 0 0 1 0 0 0
	b=16  0 0 0 1 0 0 0 0
	a&b   0 0 0 0 0 0 0 0   
	(i.e =0 bit is not set on inside a) (Masking a AND b)

		  
		  7 6 5 4 3 2 1 0   (1-byte = 8-bits)
	a=    0 0 0 0 0 0 0 0   (bit a=0)
	b=5   0 0 0 0 0 1 0 1            (5=0101 i.e 4-bit = nibble)
   a=a|b  0 0 0 0 0 1 0 1    (Merging a OR b)

	a=5   0 0 0 0 0 1 0 1
	b=9   0 0 0 0 1 0 0 1            (9=1001 i.e 4-bit = nibble)
  b=b<<4  1 0 0 1 0 0 0 0
   a=a|b  1 0 0 1 0 1 0 1    (Merging a OR b)
          9=1001  5=0101


*/

class Bit_Merging_and_Bit_Masking
{
	public static void main (String args[])
	{
		byte a=9, b=12, c;

		c=(byte)(a<<4);		//  c=    0 0 0 0  0 0 0 0
	 // c=(byte)(9<<4)		//  a=9   0 0 0 0  1 0 0 1 
							// c=a<<4 1 0 0 1  0 0 0 0
							//			 9        0
		
		c=(byte)(c|b);      //  c=    1 0 0 1  0 0 0 0
	 // c=(byte)(c|12)		//  b=12  0 0 0 0  1 1 0 0
							// c=c|b  1 0 0 1  1 1 0 0
							//			 9        12

		System.out.println((c&0b11110000)>>4); // 1st 4-bits on L.H.S 
											   // 0b= binary literals
		
		System.out.println((c&0b00001111));    // 2st 4-bits on R.H.S 
											   // 0b= binary literals


	}
}