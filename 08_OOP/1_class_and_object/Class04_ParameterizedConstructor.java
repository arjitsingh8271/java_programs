class Student {
	
	String name;
	int roll;
	int age;

	Student(String name, int roll, int age) {
		this.name = name;
		this.roll = roll;
		this.age = age;
	}

	void display() {
		System.out.println("Name: " +name);
		System.out.println("Roll: " +roll);
		System.out.println("Age: " +age);
	}
}

class Class04_ParameterizedConstructor {
	public static void main(String[] args) {
		Student s1 = new Student("Amit", 11, 19);
		s1.display();

		Student s2 = new Student("Rahul", 7, 18);
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