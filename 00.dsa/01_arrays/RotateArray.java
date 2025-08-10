/*

Arr = [1,2,3,4,5]
d=1
Result = [2,3,4,5,1] 
d=2
Result = [3,4,5,1,2] 
d=3
Result = [4,5,1,2,3] 


Solution:
---------
d=2
step1: Reverse 1st 2 elements.
arr = [1,2] [3,4,5] - [2,1,3,4,5]
step2: Reverse rest elements.
arr = [2,1] [3,4,5] - [2,1,5,4,3]
step2: Reverse all elements.
arr = [2,1,5,4,3] [3,4,5,1,2] - Ans

*/



class RotateArray {
	
	// public static void rotateArray(int[] arr, int d) {
	// 	int temp;
		
	// 	// Step 1
	// 	for (int i=0; i<d/2; i++) {
	// 		temp = arr[i];
	// 		arr[i] = arr[d-i-1];
	// 		arr[i-1+d] = temp;
	// 	}

	// 	// Step 2
	// 	int j = arr.length-1;
	// 	while (d <= j) {
	// 		temp = arr[d];
	// 		arr[d] = arr[j];
	// 		arr[j] = temp;
	// 		d++;
	// 		j--;
	// 	}

	// 	// Step 3
	// 	for (int i=0; i<arr.length/2; i++) {
	// 		temp = arr[i];
	// 		arr[i] = arr[arr.length-i-1];
	// 		arr[arr.length-i-1] = temp;
	// 	}
	// }

	// Better way to write

	public static void rev(int[] arr, int i, int j) {
		while (i<=j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

	public static void rotateArray(int[] arr, int n, int d) {
		// Step 1
		rev(arr, 0, d-1);
		// Step 2
		rev(arr, d, n-1);
		// Step 3
		rev(arr, 0, n-1);
	}

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		System.out.println("Given Array:");
		for (int x: arr) {
			System.out.print(x +" ");
		}
		System.out.println();

		rotateArray(arr, arr.length, 2);
		
		System.out.println("Array Rotate 2:");		
		for (int x: arr) {
			System.out.print(x +" ");
		}
		System.out.println();
	}

}