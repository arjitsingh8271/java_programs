class BinarySearch {

	static int binarySearch(int[] arr, int key) {
		int l = arr[0];
		int h = arr.length-1;

		while(l <= h) {
			int mid = (l+h)/2;

			if (arr[mid] == key)
				return mid;
<<<<<<< HEAD
			else if(arr[mid] < key)
				l = mid + 1;
			else
				h = mid - 1;
=======
			else if(arr[mid] > key)
				h = mid - 1;
			else
				l = mid + 1;
>>>>>>> 93d2dec (Applying local changes after pulling updates)
		}

		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,3,5,6,9};
		int key = 6;

		int result = binarySearch(arr, key);
		System.out.println(result);
	}
}