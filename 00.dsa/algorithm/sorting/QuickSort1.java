/*
Time Complexity:
	Best and Average Case: O(n log n)
	Worst Case: O(n²) (if pivot is always the smallest or largest element)

Space Complexity: O(log n) due to the recursion stack.
*/

class QuickSort1 {

	// Function to partition the array
	static int partican(int[] arr, int low, int high) {
		int pivot =  arr[high];
		int i = low-1;

		for(int j=low; j<high; j++) {
			// If the current element is smaller than the pivot (for ascending order)
			// If current element is greater than or equal to pivot (for descending order): (arr[j] >= pivot)
			if(arr[j] < pivot) {
				i++;
				// Swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// Swap arr[i+1] and pivot (arr[high])
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;

		// Return pivot
		return i+1;
	}

	// Main function to implement quick sort
	public static void quickSort(int[] arr, int low, int high) {
		if(low < high) {
			// Find the pivot element such that elements smaller than pivot
            // are on left and elements greater than pivot are on right
			int pivot = partican(arr, low, high);

			// Recursively sort elements before and after partition
			quickSort(arr, low, pivot-1);
			quickSort(arr, pivot+1 ,high);
		}
	}


	public static void main(String[] args) {

		int[] arr = {3,2,4,5,1,5};

		quickSort(arr, 0, arr.length-1);	//(arr, low, high)

		System.out.println("Sorted array:");
		for(int x : arr)
			System.out.print(x +" ");
		System.out.println();
	}
}