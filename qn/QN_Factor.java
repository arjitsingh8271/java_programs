class QN_Factor {
	
	static void fact1(int n) {
		for(int i=1; i<=n; i++) {
			if(n%i==0)
				System.out.print(i +" ");
		}
		System.out.println();
	}


	// Efficient		not in sorted order
	static void fact2(int n) {
		for(int i=1; i*i<=n; i++) {
			if(n%i==0) {
				System.out.print(i +" ");
				if(i != n/i)
					System.out.print(n/i +" ");
			}
		}
		System.out.println();
	}


	// More Efficient
	static void fact3(int n) {
		int i;
		for(i=1; i*i<=n; i++) {
			if(n%i==0)
				System.out.print(i +" ");
		}
		for(; i>=1; i--) {
			if(n%i==0)
				System.out.print(n/i +" ");
		}
		System.out.println();
	}


	public static void main(String[] args) {
		fact1(15);
		fact2(15);
		fact3(15);
	}
}