class Student {
	int id;
}


class QN_referenceOutput {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.id = 1;
		System.out.println(s1.id);	// 1
		
		fun1(s1);
		System.out.println(s1.id);	// 1

		fun2(s1);
		System.out.println(s1.id);	// 2
	}

	static void fun1(Student x) {
		Student a = new Student();
		a.id = 2;
		x = a;
	}

	static void fun2(Student x) {
		x.id = 2;
	}	
}