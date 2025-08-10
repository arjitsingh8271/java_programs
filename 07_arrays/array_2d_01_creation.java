class array_2d_01_creation {
	
	public static void main(String[] args) {

		// int arr[][] = new int[3][2];

		int arr[][] = {{1,2},{3,4},{5,6}};

		// for each loop
		for(int x[] : arr) {
			for(int y: x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		

		// for loop
		for(int i=0; i<arr.length; i++) {

			for (int j=0; j<arr[0].length; j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}