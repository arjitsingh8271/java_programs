import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

class Arrays_InbuiltMethods {
	
	public static void main(String[] args) {
		
		// 1. Sorting Arrays
		// Arrays.sort(): This method sorts an array in ascending order.
		int[] arr1 = {5, 3, 1, 4, 2};
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));  // [1, 2, 3, 4, 5]


		// 2. Binary Search
		// Arrays.binarySearch(): This method searches for a specific element in a sorted array using binary search.
		int[] arr2 = {1, 2, 3, 4, 5};
		int index = Arrays.binarySearch(arr2, 3);
		System.out.println(index);  // Output: 2
	

		// 3. Array to String
		// Arrays.toString(): Converts the array into a human-readable string representation.
		int[] arr3 = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(arr3));  // [1, 2, 3, 4, 5]


		// 4. Array Copying
		// Arrays.copyOf(): Copies the specified array to a new array, truncating or padding with zeros (if necessary) to obtain the specified length.
		int[] arr4 = {1, 2, 3};
		int[] newArr = Arrays.copyOf(arr4, 5);
		System.out.println(Arrays.toString(newArr));  // [1, 2, 3, 0, 0]

		// Arrays.copyOfRange(): Copies a range of elements from one array to a new array.
		int[] arr4_1 = {1, 2, 3, 4, 5};
		int[] subArr = Arrays.copyOfRange(arr4_1, 1, 4);
		System.out.println(Arrays.toString(subArr));  // [2, 3, 4]


		// 5. Filling Arrays
		// Arrays.fill(): Assigns the specified value to each element of the array.
		int[] arr5 = new int[5];
		Arrays.fill(arr5, 10);
		System.out.println(Arrays.toString(arr5));  // [10, 10, 10, 10, 10]


		// 6. Comparing Arrays
		// Arrays.equals(): Checks if two arrays are equal by comparing the values in corresponding indexes.
		int[] arr6 = {1, 2, 3};
		int[] arr6_1 = {1, 2, 3};
		System.out.println(Arrays.equals(arr6, arr6_1));  // true


		// 7. Parallel Sorting
		// Arrays.parallelSort(): Sorts the array in parallel (using multi-threading for large arrays).
		int[] arr7 = {5, 1, 3, 4, 2};
		Arrays.parallelSort(arr7);
		System.out.println(Arrays.toString(arr7));  // [1, 2, 3, 4, 5]


		// 8. Stream of Arrays
		// Arrays.stream(): Converts the array into a stream for processing.
		int[] arr8 = {1, 2, 3, 4, 5};
		int sum = Arrays.stream(arr8).sum();
		System.out.println(sum);  				// 15


		// 9. Sorting Arrays with Custom Comparator
		// Arrays.sort(): Can be used with a custom comparator to sort arrays of objects.
		String[] names = {"John", "Alice", "Bob"};
		Arrays.sort(names, (a, b) -> b.compareTo(a));  	// Sort in reverse order
		System.out.println(Arrays.toString(names));  	// [John, Bob, Alice]


		// 10. Converting Arrays to List
		// Arrays.asList(): Converts an array into a List.
		String[] arr10 = {"a", "b", "c"};
		List<String> list = Arrays.asList(arr10);
		System.out.println(list);  				// [a, b, c]


		// 11. Hash Code of an Array
		// Arrays.hashCode(): Returns the hash code for the array based on its contents.
		int[] arr11 = {1, 2, 3};
		System.out.println(Arrays.hashCode(arr11));  // Hash code (varies) 30817


		// 12. Deep Comparison of Multi-dimensional Arrays
		// Arrays.deepEquals(): Compares two arrays deeply (for multi-dimensional arrays).
		int[][] arr12 = {{1, 2}, {3, 4}};
		int[][] arr12_1 = {{1, 2}, {3, 4}};
		System.out.println(Arrays.deepEquals(arr12, arr12_1));  // true

		// 13. Deep toString for Multi-dimensional Arrays
		// Arrays.deepToString(): Converts a multi-dimensional array into a string.
		int[][] arr13 = {{1, 2}, {3, 4}};
		System.out.println(Arrays.deepToString(arr13));  // [[1, 2], [3, 4]]

		// 14. Spliterator
		// Arrays.spliterator(): Returns a Spliterator for the array, which can be used to traverse and split the array for parallel processing.
		//int[] arr14 = {1, 2, 3, 4, 5};
		//Spliterator.OfInt spliterator = Arrays.spliterator(arr14);
		//spliterator.forEachRemaining(System.out::println);

	}
}