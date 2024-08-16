class array_2d_QN_multiplication {
	
	public static void main(String[] args) {

		int m1[][] = {{1,2},{3,4}};
		int m2[][] = {{1,0},{0,1}};
		int m3[][] = new int[2][2];

		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				m3[i][j] = 0;
				for(int k=0; k<2; k++) {
					m3[i][j] = m3[i][j] + m1[i][k] * m2[k][j];
				}
			}
		}

		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(m3[i][j]+" ");
			}
			System.out.println();
		}
	}
}