/*
Runtime Exception (Unchecked Exception):
● These exception occur during program execution (runtime).
● Not checked by the compiler, so handling is optional.
● Typically caused by logic error like division by zero, invalid array index, or null reference.
*/

/*
class EH_runtimeException {
	public static void main(String[] args) {
		int num = 10/0;
		System.out.println(num);
		System.out.println("XYZ");
	}
}

Exception in thread "main" java.lang.ArithmeticException: / by zero
        at EH_runtimeException.main(EH_runtimeException.java:10)

It will compile and run then print an Exception, it will not print "XYZ"
because the flow of the programe skiped the printing part
*/


class EH_runtimeException {
	public static void main(String[] args) {
		try {
			int num = 10/0;
			System.out.println(num);
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("XYZ");
	}
}

/*
java.lang.ArithmeticException: / by zero
XYZ
*/