interface Computer {
	void code();
}

class Laptop implements Computer {
	
	public void code() {
		System.out.println("Coding.. Using Laptop");
	}
}

class Desktop implements Computer {
	
	public void code() {
		System.out.println("Coding.. Using Desktop");
	}
}

class Developer {
	
	public void devApp(Computer com) {
		com.code();
	}
}

class ExampleOfInterface {
	
	public static void main(String[] args) {
		
		Computer lap = new Laptop();
		Computer des = new Desktop();

		Developer arjit = new Developer();
		arjit.devApp(lap);		// Coding.. Using Laptop

		Developer Rahul = new Developer();
		Rahul.devApp(des);		// Coding.. Using Desktop
	
	}
}