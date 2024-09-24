// class EH01_p1 {
	
// 	public static void main(String[] args) {
// 		int[] n = {10, 20, 30, 40};
// 		int[] d = {1, 0, 3, 4};
	
// 		for (int i=0; i<n.length; i++) {
// 			System.out.println(n[i]/d[i]);
// 		}
// 	}
// }
// /*
// OUTPUT: 10
// 		Exception in thread "main" java.lang.ArithmeticException: / by zero
//         	at EH01.main(EH01.java:8)
// */


class EH01_p1 {
	
	public static void main(String[] args) {
		int[] n = {10, 20, 30, 40};
		int[] d = {1, 0, 3, 4};

		try {
			for (int i=0; i<n.length; i++) {
				System.out.println(n[i]/d[i]);
			}
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
}