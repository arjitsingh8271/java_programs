class Laptop {
	
	public void code() {
		System.out.println("Coding..");
	}
}

class Developer {
	
	// Passing the object of a 'Laptop' class as an argument
	public void devApp(Laptop lap) {
		lap.code();
	}
}

class Object_PassingAsArgument {
	
	public static void main(String[] args) {
		
		Laptop lap1 = new Laptop();

		Developer arjit = new Developer();
		arjit.devApp(lap1);		// Coding...
	
	}
}