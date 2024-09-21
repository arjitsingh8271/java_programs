class Add {
	
	public int add(int a, int b) {
		return a + b;
	}

	// Method Overloadng
	public int add(int a, int b, int c) {
		return a + b +c;
	}

	// Method Overloadng
	public double add(double a, double b) {
		return a + b;
	}

	// Method Overloadng
	public double add(double a, double b, double c) {
		return a + b +c;
	}
}

class Poly01_CompileTime {
	public static void main(String[] args) {

		Add t = new Add();
		System.out.println(t.add(1, 2));
		System.out.println(t.add(1, 2, 3));

		System.out.println(t.add(1.4, 2.5));
		System.out.println(t.add(1.2, 2.8, 3.6));
	}
}