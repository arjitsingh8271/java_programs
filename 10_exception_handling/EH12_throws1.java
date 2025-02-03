/*
"throws" is used to declare an exception. It gives an information to caller method
that there may occur an exception in this method so it is better for caller method
to provide the exception handling code i.e (try-catch) so normal flow can be maintained.
*/


import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
class EH12_throws1 {

	static void readFile() throws FileNotFoundException {
		FileInputStream file = new FileInputStream("abc.txt");
	}

	public static void main(String[] args) {
		readFile();
		System.out.println("XYZ");
	}
}

// EH_throws.java:18: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//                readFile();

// It will not complie because of this error.
*/



class EH12_throws1 {

	static void readFile() throws FileNotFoundException {
		FileInputStream file = new FileInputStream("abc.txt");
	}

	public static void main(String[] args) {
		try {
			readFile();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("XYZ");
	}
}

/*
If file is not found:
	java.io.FileNotFoundException: abc.txt (No such file or directory)
	XYZ

Else:
	XYZ
*/
