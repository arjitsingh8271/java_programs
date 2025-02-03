import java.io.FileInputStream;
import java.io.FileNotFoundException;

class File {
	void readFile() throws FileNotFoundException {
		FileInputStream file = new FileInputStream("abc.txt");
	}
}

class EH_throws2 {
	public static void main(String[] args) {
		File f = new File();

		try {
			f.readFile();
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