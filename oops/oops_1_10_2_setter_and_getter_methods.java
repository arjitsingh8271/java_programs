class Student
{
	private int roll;
	private String name;
	private Double sgpa;

	void setRoll(int roll){
		this.roll = roll;
	}
	int getRoll(){
		return roll;
	}

	void setName(String name){
		this.name = name;
	}
	String getName(){
		return name;
	}

	void setSgpa(Double sgpa){
		this.sgpa = sgpa;
	}
	Double getSgpa(){
		return sgpa;
	}	
}

class oops_1_10_2_setter_and_getter_methods
{
	public static void main(String args[])
	{
		Student s1 = new Student();

		s1.setRoll(21);
		s1.setName("Amit");
		s1.setSgpa(9.22);

		System.out.println(s1.getRoll());	// 21
		System.out.println(s1.getName());	// Amit
		System.out.println(s1.getSgpa());	// 9.22
	}
}