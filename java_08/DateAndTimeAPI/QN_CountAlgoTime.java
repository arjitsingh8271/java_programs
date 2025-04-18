import java.util.Arrays;

class QN_CountAlgoTime {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();	// record the starting time
		System.out.println("Time Start: " +startTime);

		int[] arr = {4,2,3,1,4};

		Arrays.sort(arr);

		for (int i : arr) {
      		System.out.println(i);
    	}


		long endTime = System.currentTimeMillis();		// record the ending time
		System.out.println("Time End: " +endTime);

		long elapsed = endTime - startTime;				// compute the elapsed time

		System.out.println("Time Taken: " +elapsed);

	}
}