class array_1d_QN_sub_array_in_an_array {
	
	static void sub_array(int a[]) {

		for (int i=0; i<a.length; i++) {
			for (int j=i; j<a.length; j++) {
				for (int k=i; k<=j; k++) {
					System.out.print(a[k] +" ");
				}
				System.out.print(" ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int arr[] = {1, 2, 3};
		sub_array(arr);
	}
}




/*
OUTPUT: 1  1 2  1 2 3
		2  2 3  
		3
*/