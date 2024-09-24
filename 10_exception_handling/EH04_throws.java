// class EH04_throws {
	
// 	public static void main(String[] args) throws Exception {
// 		System.out.println(10 / 0);
// 	}
// }


// class EH04_throws {
	
// 	public static void main(String[] args) throws Exception {
// 		for (int i=0; i<5; i++) {
// 			divide(10,i);
// 		}
// 	}

// 	static void divide(int a, int b) throws Exception {
// 		System.out.println(a / b);
// 	}
// }



class A {
	void display() {
		System.out.println("Hello");
	}
}


class EH04_throws {
	
	public static void main(String[] args) throws Exception {

		System.out.println(10/1);

		A obj = new A();
		obj.display();

		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = new int[2];
		for (int i=0 ; i<5 ; i++) {	
				arr2[i] = arr1[i];
		}
		
	}
}