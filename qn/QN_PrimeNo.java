class QN_PrimeNo {
	
	static boolean isPrime1(int n) {
		if(n<2) return false;

		for (int i=2; i<n; i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	// TC: O(n)

	// Efficient
	static boolean isPrimeSqrt(int n) {
		if(n<2) return false;

		for (int i=2; i*i <= n; i++) {	// or i<Math.sqrt(n)
			if(n%i==0)
				return false;
		}
		return true;
	}
	// TC: O(√n)

	// More Efficient
	static boolean isPrime3(int n) {
		if(n<2) return false;
		if(n==2 || n==3) return false;
		if(n%2==0 || n%3==0) return false;

		for (int i=5; i*i <= n; i+=6) {
			if(n%i==0 || n%(i+2)==0)
				return false;
		}
		return true;
	}


	public static void main(String[] args) {
		System.out.println(isPrime1(12));
		System.out.println(isPrimeSqrt(13));
		System.out.println(isPrime3(13));
	}
}