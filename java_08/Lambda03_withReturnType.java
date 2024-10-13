interface A {
	int add(int n, int m);
}

class Lambda03_withReturnType {
	public static void main(String[] args) {

		A a = new A() {
			public int add(int n, int m) {
				return n+m;
			}
		};
		int res1 = a.add(2,5);
		System.out.println(res1);	// 7


		//A b = (n, m) -> return n+m;
		A b = (n, m) -> n+m;

		System.out.println(b.add(10,20));	// 30

	}
}