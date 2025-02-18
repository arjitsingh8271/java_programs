import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

class DeSerialization1 {
	public static void main(String[] args) {
		try {
			// Deserialization: Reading object from file
			FileInputStream fis = new FileInputStream("TestFile2.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			Student obj = (Student) ois.readObject();	// typecasting into (Student)
			obj.display();

			ois.close();
			fis.close();
		}
		catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}


// OUTPUT: Roll No: 12, Name: Amit