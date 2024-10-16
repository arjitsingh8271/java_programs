/*
Time Complexity:
	Best, Average and Worst Case: O(n log n)

Space Complexity: O(n) because of the additional temporary arrays used during the merging process.
*/

class MergeSort1 {

	// Method to merge two halves
	static void merge(int[] arr, int left, int mid, int right) {
		// Sizes of the two sub-arrays
		int lSize = mid-left+1;
		int rSize = right-mid;

		// Temporary arrays
		int leftArr[] = new int[lSize];
		int rightArr[] = new int[rSize];

		 // Copy data to temporary arrays
		for (int i=0; i<lSize; i++) {
			leftArr[i] = arr[left+i];
		}

		for (int i=0; i<rSize; i++) {
			rightArr[i] = arr[mid+1+i];
		}

		// Merge the temporary arrays

        // Initial indices of the two sub-arrays
        int i = 0, j = 0;

        // Initial index of the merged array
        int k = left;
        while (i < lSize && j < rSize) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArr[] if any
        while (i < lSize) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArr[] if any
        while (j < rSize) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }

	}

	// Method to sort the array using Merge Sort
	static void mergeSort(int[] arr, int left, int right) {
		if(left < right) {
			 // Find the middle point
			int mid = (left+right)/2;

			// Sort the first half & second half
			mergeSort(arr, left, mid);
			mergeSort(arr, mid+1, right);

			 // Merge the sorted halves
			merge(arr, left, mid, right);
		}
	}


	public static void main(String[] args) {

		int[] arr = {3,2,4,5,1,5};

		mergeSort(arr, 0, arr.length-1);	//(arr, left, right)

		System.out.println("Sorted array:");
		for(int x : arr)
			System.out.print(x +" ");
		System.out.println();
	}
}