class array_1d_QN_missingNo {

	static int missNo(int[] a) {
		int n = a.length + 1;
		int total = n*(n+1)/2;

		for(int x : a)
			total -= x;

		return total;
	}
	
	public static void main(String[] args) {
		int[] arr = {4,5,1,3};

		System.out.println(missNo(arr));
	}
}