/*

java.lang.Object
	↳ java.lang.Throwable
		↳ java.lang.Error
		↳ java.lang.Exception
			↳ java.lang.RuntimeException
				↳ java.lang.ArithmeticException
				↳ java.lang.NullPointerException
				↳ java.lang.IndexOutOfBoundsException
				↳ java.lang.IllegalArgumentExceptionException
			↳java.io.IOExcepton
				↳java.io.FileNotFoundException
				↳java.io.EOFException
			↳java.sql.SQLException
			...
*/


class EH01_p2 {
	
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
		catch (ArithmeticException e) {		// Rather than ArithmeticException,  
			System.out.print(e +" ");		// We can write RuntimeException or Exception
			return -1;						// Becoz ArithmeticException extends RuntimeException
		}									// And RuntimeException extends Exception
	}
}


/*
OUTPUT: 5
		java.lang.ArithmeticException: / by zero -1
		15
		20
*/