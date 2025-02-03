/*
Finally is the block that is always executed whether exception is handled or note.

Note: 
	● Multiple catch block with one try block
	● Single finally block with one try block
*/

/*
class EH06_finally1 {
	public static void main(String[] args) {
		try {
			System.out.println(10/2);	// 5
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finally block."); // finally block.
		}
	}
}
*/


class EH06_finally1 {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch (Exception e) {
			System.out.println(e);	// java.lang.ArithmeticException: / by zero
		}
		finally {
			System.out.println("finally block."); // finally block.
		}
	}
}
