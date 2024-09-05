class QN_PrimeFactors {
	
	static boolean isPrime(int n) {
		if(n<2) return false;
		for(int i=2; i*i<=n; i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}

	// static void fact(int n) {		// it will not print repeated numbers.
	// 	for(int i=2; i<=n; i++) {
	// 		if(isPrime(i)) {
	// 			if(n%i==0)
	// 				System.out.print(i +" ");
	// 		}
	// 	}
	// 	System.out.println();
	// }

	static void fact(int n) {			// it will print repeated numbers.
		if(n<=1) return;
		for(int i=2; i<=n; i++) {
			if(isPrime(i)) {
				int x=i;
				while(n%x==0) {
					System.out.print(i +" ");
					x = x*i;
				}
			}
		}
		System.out.println();
	}
	// TC: O(n^2logn)

	// Efficient
	static void fact2(int n) {
		if(n<=1) return;
		for(int i=2; i*i<=n; i++) {
			while(n%i==0) {
				System.out.print(i +" ");
				n = n/i;
			}
		}
		if(n>1)
			System.out.println(n);
	}


	// More Efficient
	static void fact3(int n) {
		if(n<=1) return;
		while(n%2==0) {
			System.out.print(2 +" ");
			n=n/2;
		}
		while(n%3==0) {
			System.out.print(3 +" ");
			n=n/3;
		}
		for(int i=5; i*i<=n; i+=6) {
			while(n%i==0) {
				System.out.print(i +" ");
				n = n/i;
			}
			while(n%(i+2)==0) {
				System.out.print(i+2);
				n = n/(i+2);
			}
		}
		if(n>3)
			System.out.println(n);
	}


	public static void main(String[] args) {
		fact(315);
		fact2(315);
		fact3(315);


	}
}