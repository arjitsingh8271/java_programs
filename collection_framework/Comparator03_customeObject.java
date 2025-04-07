import java.util.ArrayList;
import java.util.Collections;	// Collections is a Class


class Student {
	Integer id;
	String name;

	Student(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return this.id + " : " + this.name;
	}
}


class Comparator03_customeObject {
	public static void main(String[] args) {

		Student s1 = new Student(1, "Ravi");
		Student s2 = new Student(12, "Alok");
		Student s3 = new Student(11, "Priya");

		ArrayList<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		System.out.println(list);	// [1 : Ravi, 12 : Alok, 11 : Priya]

		Collections.sort(list, (a, b) -> b.id - a.id);
		System.out.println(list); 	// [12 : Alok, 11 : Priya, 1 : Ravi]

	}

}