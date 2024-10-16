class BubbleSort_M {

	static void bubbleSort(int[] arr) {
		int n = arr.length-1;

		for (int i=0; i<n; i++) {
			boolean swapped = false;
			
			for (int j=0; j<n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;

					swapped = true;
				}
			}

			if(swapped == false)
			break;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {3,2,4,5,1,5};

		bubbleSort(arr);	//(arr, low, high)

		System.out.println("Sorted array:");
		for(int x : arr)
			System.out.print(x +" ");
		System.out.println();
	}
}