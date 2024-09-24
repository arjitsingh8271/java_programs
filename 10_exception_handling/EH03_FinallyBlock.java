// Finally block always execute

class EH03_FinallyBlock {
	
	public static void main(String[] args) {
		int[] n = {10, 20, 30, 40};
		int[] d = {2, 0, 2, 2};

		for (int i=0; i<n.length; i++) {
			System.out.println(divide(n[i],d[i]));
		}
	}

	static int divide(int a, int b) {
		try {
			return a/b;
		}
		catch (Exception e) { 
			System.out.println(e);
			return -1;
		}
		finally {
			System.out.println("Always Execute");
		}
	}
}


/*
OUTPUT: Always Execute
		5
		java.lang.ArithmeticException: / by zero
		Always Execute
		-1
		Always Execute
		15
		Always Execute
		20
*/