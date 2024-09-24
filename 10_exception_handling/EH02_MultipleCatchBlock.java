class A {
	void display() {
		System.out.println("Hello");
	}
}


class EH02_MultipleCatchBlock {
	
	public static void main(String[] args) {
		try {

			System.out.println(10/1);

			A obj = new A();
			obj.display();

			int[] arr1 = {1,2,3,4,5};
			int[] arr2 = new int[2];
			for (int i=0 ; i<5 ; i++) {	
					arr2[i] = arr1[i];
			}
		}
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException Triggered");
			System.out.println(e);
		}
		catch (NullPointerException e) {
			System.out.println("NullPointerException Triggered");
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println("Exception Triggered");
			System.out.println(e);
		}
	}
}