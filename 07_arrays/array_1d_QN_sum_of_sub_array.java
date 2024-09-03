class array_1d_QN_sum_of_sub_array {
	
	static void sub_array(int a[]) {
		
		for (int i=0; i<a.length; i++) {
			for (int j=i; j<a.length; j++) {
				int sum = 0;
				for (int k=i; k<=j; k++) {
					sum += a[k];
				}
				System.out.print(sum +" ");
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
OUTPUT: 1 3 6 
		2 5 
		3
*/


