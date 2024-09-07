import java.util.Arrays;

class QN_PrimeNoUpTo {
	
	static boolean isPrime(int n) {
		if(n<2) return false;
		for(int i=2; i*i<=n; i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	static void fun1(int n) {
		for(int i=1; i<=n; i++) {
			if(isPrime(i))
				System.out.print(i+" ");
		}
		System.out.println();
	}
	// TC: O(n*√n)


	// Efficient
	static void fun2(int n) {
		boolean[] isPrime = new boolean[n+1];
		Arrays.fill(isPrime, true);

		for(int i=2; i*i<=n; i++) {
			if(isPrime[i]) {
				for(int j=2*i; j<=n; j+=i) {
					isPrime[j] = false;
				}
			}
		}

		for(int i=2; i<=n; i++) {
			if(isPrime[i])
				System.out.print(i +" ");
		}
		System.out.println();
	}


	// More Efficient
	static void fun3(int n) {
		boolean[] isPrime = new boolean[n+1];
		Arrays.fill(isPrime, true);

		for(int i=2; i<=n; i++) {
			if(isPrime[i]) {
				System.out.print(i +" ");
				for(int j=i*i; j<=n; j+=i) {
					isPrime[j] = false;
				}
			}
		}
		System.out.println();
	}
	// TC: O(nloglogn)


	public static void main(String[] args) {
		fun1(10);
		fun2(10);
		fun3(10);

	}
}