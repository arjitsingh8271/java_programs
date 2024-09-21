class Student {
	
	String name;
	int roll;
	int age;

	void display() {
		System.out.println("Name: " +name);
		System.out.println("Roll: " +roll);
		System.out.println("Age: " +age);
	}
}

class Class02 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Amit";
		s1.roll = 11;
		s1.age = 19;
		s1.display();

		Student s2 = new Student();
		s2.name = "Rahul";
		s2.roll = 7;
		s2.age = 18;
		s2.display();
	}
}


/*
OUTPUT: Name: Amit
		Roll: 11
		Age: 19
		Name: Rahul
		Roll: 7	
		Age: 18
*/