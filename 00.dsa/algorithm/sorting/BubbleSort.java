/*
Bubble Sort Algoritm:
---------------------

1. Compare the first two adjacent elements of the list.
2. If the first element is greater than the second, swap them.
3. Move to the next pair of elements and repeat the comparison and swap if necessary.
4. Continue this process for each pair of adjacent elements until the end of the list.
5. The largest element will "bubble up" to the end of the list.
6. Repeat the entire process for the rest of the list, excluding the last sorted 
element each time, until no more swaps are needed.

Not Efficent, But simple to understand

T.C
---
	Best Case  = O(n)
	Avg Case   = O(n^2)
	Worst Case = O(n^2)

S.C = O(1)
----------

*/


class BubbleSort {

	static void bubbleSort(int[] arr) {
		int n = arr.length-1;

		for (int i=0; i<n; i++) {
			for (int j=0; j<n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
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