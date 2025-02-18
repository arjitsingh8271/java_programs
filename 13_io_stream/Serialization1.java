/*
What is Serialization?
----------------------
Serialization in Java is the process of converting an object into a byte stream so that it 
can be saved to a file, transferred over a network, or stored in a database.
The reverse process, called Deserialization, converts the byte stream back into an object.

Why Use Serialization?
----------------------
● Save object state: Store object data for later use.
● Send objects over a network: Required in RMI, web services, or messaging systems.
● Database storage: Objects can be serialized and stored in databases.

How it works:
-------------
● The Java.io.Serializable interface enables the serialization of objects. 
● Any class that implements this interface is considered serializable. 
● The entire process of serialization is JVM (Java Virtual Machine) independent. 
● An object can be serialized on one platform and deserialized on another. 

Use cases:
----------
● Serialization is usually used in Hibernate, JMS, JPA, and EJB.
● It helps transport the code from one JVM to another and then de-serialize it there.

How to Implement Serialization in Java?
---------------------------------------
To serialize an object in Java:
	1. The class must implement the Serializable interface.
	2. For Serialization use writeObject() of ObjectOutputStream to write the object.
	3. For DeSerialization use readObject() of ObjectInputStream to read the object.

*/

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class Student implements Serializable {
	int rollNo;
	String name;

	Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name);
    }
}


class Serialization1 {
	public static void main(String[] args) {
		
		Student s1 = new Student(12, "Amit");
		s1.display();

		try {
			FileOutputStream fos = new FileOutputStream("TestFile2.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s1);

			oos.close();
			fos.close();

			System.out.println("Serialization: Object saved to file.");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}


// OUTPUT: Roll No: 12, Name: Amit