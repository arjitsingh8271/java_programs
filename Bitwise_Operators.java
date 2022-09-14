/* Bitwise Operators:-
    AND                    &
    OR                     |
    XOR                    ^
    NOT                    ~ 
    RIGHT SHIFT            >>
    UNSIGNED RIGHT SHIFT   >>>
    LEFT SHIFT             <<

    AND:             OR:              XOR:             NOT:
        A   B  A&B      A   B  A|B       A   B  A^B        A   B 
        0   0   0       0   0   0        0   0   0         0   1 
        0   1   0       0   1   1        0   1   1         1   0 
        1   0   0       1   0   1        1   0   1         
        1   1   1       1   1   1        1   1   0         
NOTE : (Merging and Masking) in Tutorial videos on SSD

*/

class Bitwise_Operators
{
	public static void main (String args[])
	{
		int a=10, b=6, c=-10, w,x,y,z, p,q,r;

		w=a&b;		// a=10  00001010   (AND Operator)
					// b=6   00000110
					// x=2   00000010
		
		x=a|b;		// a=10  00001010   (OR Operator)
					// b=6   00000110
					// x=14  00001110
		
		y=a^b;		// a=10  00001010   (XOR Operator)
					// b=6   00000110
					// x=12  00001100

		z=~a;		// a=10     00001010  (NOT Operator)
					// ~a=-11   11110101  i.e z=-11
					
					//  1's     00001010
					//  2's           +1
					//  2's     00001011  i.e =11

		System.out.println("'& AND' Operator w is: " +w);
		System.out.println("'| OR' Operator x is:  " +x);
		System.out.println("'^ XOR' Operator y is: " +y);
		System.out.println("'~ NOT' Operator z is: " +z);
		System.out.println();

		p=a<<1;		// a=10   1010   (LEFT SHIFT Operator) its means n*2^k  (n=10,k=1)
					// <<1=  1010
					// p=20  10100

		q=a>>1;		// a=10   1010   (RIGHT SHIFT Operator) its means n/2^k  (n=10,k=1)
					// a>>1    1010
					// p=5    0101

		r=c>>>1;	// 10=   00001010  (UNSIGNED RIGHT SHIFT Operator)
					// 1's=  11110101
					// 2's=        +1
					// 2's=  11110110  i.e -10
					
					// c=-10 11110110
					// c>>1  10111011   (sign bit untouched i.e MSB can't change)
					// c>>>1 01111011   (sign bit touched i.e MSB can change)
					// r= +ve number

		System.out.println("'<< LEFT SHIFT' Operator p is: " +p);
		System.out.println("'>> RIGHT SHIFT' Operator q is: " +q);
		System.out.println("'>>> UNSIGNED RIGHT SHIFT' Operator r is: " +r);
	}
}