class EH05_methodToPrintException {
	public static void main(String[] args) {
		try {
			int num = 10 / 0;
			System.out.println(num);
		}
		catch (Exception e) {
			e.printStackTrace();			// No.1 "ExceptionName, Description & StackTrace"
			System.out.println();
			
			System.out.println(e);			// No.2 "ExceptionName & Description"
			System.out.println();

			System.out.println(e.toString());	// No.3 "ExceptionName & Description"
			System.out.println();
			
			System.out.println(e.getMessage());	// No.4 "Description"
		}
	}
}


/*
java.lang.ArithmeticException: / by zero                                                                    
        at EH_methodToPrintException.main(EH_methodToPrintException.java:4)

java.lang.ArithmeticException: / by zero

java.lang.ArithmeticException: / by zero

/ by zero
*/
