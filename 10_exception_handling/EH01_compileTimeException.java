/*
Compile-Time Exception (Checked Exception):
● These exception are Checked by the compiler at compile time.
● The program wil not compile unless they are handled using try-catch or throws.
● Usully related to external resources like files. database, or network connection.
*/

import java.io.FileInputStream;
import java.io.IOException;

/*
class EH01_compileTimeException {
	public static void main(String[] args) {
		
		FileInputStream file = new FileInputStream("abc.txt");
		System.out.println("XYZ");
	}
}

EH_compileTimeException.java:13: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
                FileInputStream file = new FileInputStream("abc.txt");
                                       ^
1 error

// It will not compile, until the error is fixed.
*/


class EH01_compileTimeException {
	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream("abc.txt");
		}
		catch (IOException e) {			// catch (Exception e) 	we can also write
			System.out.println(e);
		}
		System.out.println("XYZ");
	}
}

/*
After compiling and running the program it will print an Exception then print "XYZ":
java.io.FileNotFoundException: abc.txt (No such file or directory)
XYZ
*/
