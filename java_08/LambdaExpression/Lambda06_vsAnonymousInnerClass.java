interface Student {
	int getId();
	String getName();
}

/*
There is two Abstract Method, So we can't use Lambda Expression
instead of Lambda Expression, We can use Anonymous Inner Class.
*/

class Lambda06_vsAnonymousInnerClass {
	public static void main(String[] args) {
		Student s1 = new Student() {
			@Override
			public int getId() {
				return 11;
			}

			@Override
			public String getName() {
				return "Alok";
			}
		};

		System.out.println(s1.getId());		// 11
		System.out.println(s1.getName());	// Alok

	}
}

