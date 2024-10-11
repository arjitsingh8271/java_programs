class ElseIf_Statement {
	public static void main(String[] args) {

		int age = 10;

		if(age < 17)
			System.out.println("You can't Drive");
		else if(age >= 18 && age <= 60)		// Here && is a Logical Operator
			System.out.println("You can Drive");
		else
			System.out.println("Go buy Chocolate or Orange Juice :)");
	}
}