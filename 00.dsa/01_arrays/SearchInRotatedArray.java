/*
Given a sorted and rotated array A of N distinct elements which is roatated at some point, and given an element key.
The task is to find the index of the given element key in the array A.
*/

class SearchInRotatedArray {

	public static int binarySearch(int[] arr, int l, int r, int key) {
		while (l<=r) {
			int mid = (l+r)/2;
			if (arr[mid] == key)
				return mid;
			else if (arr[mid] < key)
				l = mid+1;
			else
				r = mid-1;
		}

		return -1;
	}
	
	public static int getPivot(int[] arr, int l, int r) {
		while (l<=r) {
			int mid = (l+r)/2;
			if (arr[mid] > arr[mid+1])
				return mid;
			else if (arr[mid] < arr[mid-1])
				return mid-1;
			else if (arr[mid] > arr[l])
				l = mid+1;
			else
				r = mid-1;
		}

		return -1;
	}

	public static int search(int[] arr, int l, int r, int key) {
		int pivot = getPivot(arr, l, r);
		int result = binarySearch(arr, l, pivot, key);
		if (result == -1) {
			result = binarySearch(arr, pivot+1, r, key);
		}

		return result;
	}

	public static void main(String[] args) {
		int[] arr = {5,6,7,8,9,10,1,2,3};
		System.out.println(search(arr, 0, arr.length-1, 7));
	}
}