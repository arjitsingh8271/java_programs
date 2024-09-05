/*
HCF (Highest Common Factor), also Known as GCD (Greatest Common Divisor).
HCF of two or more given no. is the highest no which exactly divides all the no.

Eg:		HCF of 12 and 16
	Factor of 12: 1,2,3,4,6,12
	Factor of 16: 1,2,4,8,16
	Common Factors is: 1,2,4
		HCF is 4
*/

class QN_HcfOfTwoNumbers {
	
	static int Hcf(int a, int b) {
		int min = Math.min(a,b);
		int hcf=0;
		for(int i=1; i<=min; i++) {
			if (a%i==0 & b%i==0)
				hcf = i;
		}
		return hcf;
	}
	// TC: O(min(a,b))

	// Efficient
	static int HcfEuclideanAlgo(int a, int b) {
		while(a != b) {
			if(a > b)
				a = a-b;
			else 
				b = b-a;
		}
		return a;
	}
	/*
		a=12, b=15
		a=12, b=3
		a=9, b=3
		a=6, b=3
		a=3, b=3 	return a or b;
	*/

	// More Efficient
	static int HcfOptEuclideanAlgo(int a, int b) {
		if(b == 0)
			return a;
		return HcfOptEuclideanAlgo(b, a%b);
	}
	/*
		hcf..(12,15)
			hcf..(15,12)
				hcf..(12,3)
					hcf..(3,0)
	*/


	public static void main(String[] args) {
		
		System.out.println(Hcf(12,15));
		System.out.println(HcfEuclideanAlgo(12,15));
		System.out.println(HcfOptEuclideanAlgo(12,15));

	}
}


/*
Euclidean Algorithm
-------------------

Let 'b' be smaller than 'a'
hcf(a,b) = hcf(a-b,b)

Why?
Let 'h' be HCF of 'a' and 'b'
a=hx, b=hy and hcf(x,y)=1
(a-b) = g(x-y)

*/