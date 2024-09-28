package MyPackages;

public class Student {
	
	private String name;
	private int roll;
	private String dept;
	private char gender;
	private String address;

	public Student() {}

	public Student(String name) {
		this.name = name;
	}

	public Student(String name, int roll) {
		this.name = name;
		this.roll = roll;
	}

	public Student(String name, int roll, String dept) {
		this.name = name;
		this.roll = roll;
		this.dept = dept;
	}

	public Student(String name, int roll, String dept, char gender) {
		this.name = name;
		this.roll = roll;
		this.dept = dept;
		this.gender = gender;
	}

	public Student(String name, int roll, String dept, char gender, String address) {
		this.name = name;
		this.roll = roll;
		this.dept = dept;
		this.gender = gender;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void display() {
		System.out.println("Name: " +name);
		System.out.println("Roll No: " +roll);
		System.out.println("Dept: " +dept);
		System.out.println("Gender: " +gender);
		System.out.println("Address: " +address);
	}
}