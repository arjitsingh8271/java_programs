/*
Time Complexity:
	Best, Average and Worst Case: O(n log n)

Space Complexity: O(n) because of the additional temporary arrays used during the merging process.
*/

class MergeSort2 {

	// Method to merge two halves
	static void merge(int[] arr, int start, int mid, int end) {
		int temp[] = new int[end-start+1];
		int k = 0;		// index of temp[];
		int i = start;	// index of 1st sorted part
		int j = mid+1;	// index of 2nd sorted part

		// Compare both part element & insert into temp[]
		while(i <= mid && j <= end) {
			if(arr[i] < arr[j]) {
				temp[k] = arr[i];
				i++;
				k++;
			} else {
				temp[k] = arr[j];
				j++;
				k++;
			}
		}

		// Copy remaining elements of 1st part if any
		while(i <= mid) {
			temp[k++] = arr[i++];
		}

		// Copy remaining elements of 2st part if any
		while(j <= end) {
			temp[k++] = arr[j++];
		}

		// Copy temp[] to orignal arr[]
		for (k=0, i=start; k<temp.length; k++,i++) {
			arr[i] = temp[k];
		}

	}

	// Method to sort the array using Merge Sort
	static void mergeSort(int[] arr, int start, int end) {
		if(start >= end)
			return;
		
		// Find the middle point
		int mid = (start+end)/2;

		// Sort the first half & second half
		mergeSort(arr, start, mid);
		mergeSort(arr, mid+1, end);

		 // Merge the sorted halves
		merge(arr, start, mid, end);
	}


	public static void main(String[] args) {

		int[] arr = {3,2,4,5,1,5};


		mergeSort(arr, 0, arr.length-1);	//(arr, start, end)

		System.out.println("Sorted array:");
		for(int x : arr)
			System.out.print(x +" ");
		System.out.println();
	}
}


/*
Explanation of Merge Sort:
--------------------------
Merge Sort is a divide-and-conquer sorting algorithm. Here's how it works:

Divide: The array is recursively divided into two halves until each subarray contains a single element.
Conquer: The individual elements (which are trivially sorted) are merged back together, but in a sorted order.
Combine: The merging process combines the sorted subarrays to form a single sorted array.

Steps in the Algorithm:
-----------------------
Recursive Division: The array is divided into two halves (this is done by calculating the middle point mid).
Sorting the Halves: Each half is recursively sorted by applying the mergeSort function.
Merging: After sorting, the merge function is called to merge the two halves in a sorted manner.

How the Code Implements Merge Sort:
----------------------------------
mergeSort(arr, start, end):

•Divides the array into two halves by finding the middle point.
•Recursively calls itself on each half (arr[start, mid] and arr[mid + 1, end]).
•Merges the two sorted halves using the merge() function.

merge(arr, start, mid, end):

•Merges the two sorted parts of the array into a temporary array temp[].
•After merging, the result is copied back into the original array arr[].
*/