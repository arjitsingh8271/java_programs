/*
LCM (Least Common Multiple) of two or more no. is the smallest 
no. other than 0 that's is a multiple of all given no.

Eg:		LCM of 4 and 6
	Multiples of 4: 4,8,12,16,20,24
	Multiples of 6: 6,12,18,24
	Common Multiple: 12,24
		LCM is 12
*/


class QN_LcmOfTwoNumbers {
	
	static int Lcm(int a, int b) {
		int max = Math.max(a,b);
		while(max <= a*b) {
			if(max%a==0 && max%b==0)
				return max;
			max++;
		}
		return max;
	}
	// TC: O((a*b)-max(a,b))

	// More Efficient
	static int Hcf(int a, int b) {
		if(b == 0)
			return a;
		return Hcf(b,a%b);
	}
	static int LcmUsingHcf(int a, int b) {
		return (a*b)/Hcf(a,b);
	}
	// TC: O(log(min(a,b)))

	public static void main(String[] args) {
		
		System.out.println(Lcm(4,6));
		System.out.println(LcmUsingHcf(4,6));
	}
}