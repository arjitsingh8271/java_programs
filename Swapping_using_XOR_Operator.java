/*  XOR:
		A   B  A^B
		0   0   0 
		0   1   1 
		1   0   1
		1   1   0

*/
class Swapping_using_XOR_Operator
{
	public static void main (String args[])
	{
		int a=9, b=12;
		System.out.println("Before Swapping a: " +a +"  " +"b: " +b);

		a=a^b;	// a=   00001001
				// b=   00001100
				// a^b= 00000101
				// a=   00000101 i.e a=5

		b=a^b;	// a=   00000101
				// b=   00001100
				// a^b= 00001001
				// b=   00001001 i.e b=9

		a=a^b;  // a=   00000101
				// b=   00001001
				// a^b= 00001100
				// a=   00001100 i.e a=12

		System.out.println("After Swapping a: " +a +"  " +"b: " +b);

	}
}