class Methods_VariableArguments {
	
	static void show(int...x) {			// int...x is a vararg.
		for(int a:x)
			System.out.print(a +" ");
	}

	static void show2(int x, int...y) {
		System.out.print("x: " +x +" ");
		for(int a:y)
			System.out.print("y: " +a +" ");
	}

	public static void main(String[] args) {
		
		show();
		System.out.println();
		
		show(10);
		System.out.println();
		
		show(10,20,30);
		System.out.println();
		
		show(new int[]{1,2,3,4});
		System.out.println();


		// show2();		// error: required: int,int[], found: no arguments
		
		show2(10);				// 10 -> x
		System.out.println();
		
		show2(10,20,30);		// 10 -> x, 20 30 -> y
		System.out.println();

	}
}



/*
OUTPUT: 
		10 
		10 20 30 
		1 2 3 4 
		x: 10 
		x: 10 y: 20 y: 30
*/