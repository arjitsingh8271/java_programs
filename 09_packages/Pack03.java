/*
/home/arjit/.../java_programming/
|
|--	09_packages
|		↳Pack02.java
|--	MyPackage
		↳Student.java


javac -cp /home/arjit/Desktop/Programming/java_programming/ Pack03.java
java -cp .:/home/arjit/Desktop/Programming/java_programming/ Pack03

*/

import MyPackages.Student;

class Pack03 {
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Rahul");
		s1.display();
		System.out.println();


		Student s2 = new Student("Amit", 12, "BTech", 'M', "Ranchi");
		s2.display();
		System.out.println();


		Student s3 = new Student("Rani", 12, "BSc", 'F');
		System.out.println(s3.getName());
		System.out.println(s3.getRoll());
		System.out.println(s3.getDept());
		System.out.println(s3.getGender());

	}
}


/*
OUTPUT:	Name: Rahul
		Roll No: 0
		Dept: null
		Gender: 
		Address: null

		Name: Amit
		Roll No: 12
		Dept: BTech
		Gender: M
		Address: Ranchi

		Rani
		12
		BSc
		F
*/