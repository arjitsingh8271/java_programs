class Student {
	
	private String name;
	private int roll;
	private int age;

	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}

	void setRoll(int roll) {
		this.roll = roll;
	}
	int getRoll() {
		return roll;
	}

	void setAge(int age) {
		if(age < 0)
			System.out.println("Invalid Age.");
		this.age = age;
	}
	int getAge() {
		return age;
	}
}

class Encaps01 {

	public static void main(String[] args) {
	
		Student s1 = new Student();
		s1.setName("Rahul");
		s1.setRoll(12);
		s1.setAge(19);

		System.out.println("Name: " +s1.getName());
		System.out.println("Roll: " +s1.getRoll());
		System.out.println("Age: " +s1.getAge());	
	}
}