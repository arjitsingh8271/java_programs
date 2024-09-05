class Recursion_countDigit {

	// Iterative Solution
	// static int countDigit(int n) {
	// 	int count=0;
	// 	while (n != 0) {
	// 		n /=10;
	// 		count++;
	// 	}
	// 	return count;
	// }
	
	static int countDigit(int n) {
		if (n==0)
			return 0;
		return 1 + countDigit(n/10);
	}

	public static void main(String[] args) {
			System.out.println(countDigit(1234));
		}	
}