class array_1d_QN_rotating_an_array {
	public static void main(String[] args) {
		int ar[] = {1,2,3,4,5};
		int temp = ar[0];

		for(int i=0; i<ar.length-1; i++) {
			ar[i] = ar[i+1];
		}
		ar[ar.length-1] = temp;

		for(int x : ar) {
			System.out.print(x+" ");	// 2 3 4 5 1 
		}
		System.out.println();
	}
}