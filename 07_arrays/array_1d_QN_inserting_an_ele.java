class array_1d_QN_inserting_an_ele {
	
	public static void main(String[] args) {

		int ar[] = new int[8];
		ar[0]=1;
		ar[1]=2;
		ar[2]=3;
		ar[3]=4;
		ar[4]=5;


		int key = 9;
		int pos = 3;

		for(int i=3; i<5; i++) {
			ar[i+1] = ar[i];
		}
		ar[pos] = key;

		for(int x : ar) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
}
