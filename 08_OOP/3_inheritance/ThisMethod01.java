// this() will exucute constructor of same class

class A {
	
	A() {
		System.out.println("A");
	}
	
	A(int a) {
		System.out.println("A Int");
	}
}

class B extends A {
	
	B() {
		super();
		System.out.println("B");
	}
	
	B(int n) {
		this();
		System.out.println("B Int");
	}
}

class ThisMethod01 {
	public static void main(String[] args) {
		
		B obj = new B(7);
	}
}


/*
OUTPUT: A
		B
		B Int
*/