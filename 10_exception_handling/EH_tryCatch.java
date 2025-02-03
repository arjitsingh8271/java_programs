/* Without try-catch block
class EH_tryCatch {
	public static void main(String[] args) {
		System.out.println(10/0);
		System.out.println("After S.o.p()");
	}
}

// Exception in thread "main" java.lang.ArithmeticException: / by zero
//        at EH_tryCatch.main(EH_tryCatch.java:3)
*/


/*	Eg. 1
class EH_tryCatch {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("After try-catch block");
	}
}

// java.lang.ArithmeticException: / by zero
// After try-catch block
*/


/* Eg. 2
class EH_tryCatch {

	static void divide() {
		System.out.println(10/0);
		System.out.println("divide()");
	}

	public static void main(String[] args) {
		try {
			divide();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("main()");
	}
}

// java.lang.ArithmeticException: / by zero
// main()
*/


// Eg. 3
class EH_tryCatch {

	static void divide() {
		try {
			System.out.println(10/0);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("divide()");
	}

	public static void main(String[] args) {
		divide();
		System.out.println("main()");
	}
}


// java.lang.ArithmeticException: / by zero
// divide()
// main()