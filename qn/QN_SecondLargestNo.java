class QN_SecondLargestNo {

	static int ans(int[] a) {
		int sL = Integer.MIN_VALUE;
		int l = Integer.MIN_VALUE;

		for(int i=0; i<a.length; i++) {
			if(a[i] > l) {
				sL = l;
				l = a[i];
			}
			else if (a[i] > sL && a[i] != l)
				sL = a[i];
		}

		return sL;
	}
	
	public static void main(String[] args) {

		int[] arr = {12,2,4,1};

		System.out.println(ans(arr));

	}
}