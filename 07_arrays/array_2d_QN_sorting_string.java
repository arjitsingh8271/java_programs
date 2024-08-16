class array_2d_QN_sorting_string {
	
	public static void main(String[] args) {

		String ar[] = {"Mango", "Grapes", "Apple", "Banana"};

		java.util.Arrays.sort(ar);

		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}
}